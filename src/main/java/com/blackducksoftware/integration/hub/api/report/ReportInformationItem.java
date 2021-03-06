/*******************************************************************************
 * Copyright (C) 2016 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package com.blackducksoftware.integration.hub.api.report;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.joda.time.DateTime;

import com.blackducksoftware.integration.hub.api.item.HubItem;
import com.blackducksoftware.integration.hub.meta.MetaInformation;

public class ReportInformationItem extends HubItem {
    public static final String REPORT_CONTENT_LINK = "content";

    public static final String REPORT_DOWNLOAD_LINK = "download";

    private final String reportFormat;

    private final String locale;

    private final String fileName;

    private final int fileSize;

    private final String createdAt;

    private final String updatedAt;

    private final String finishedAt;

    private final String createdBy;

    public ReportInformationItem(final String reportFormat, final String locale, final String fileName,
            final int fileSize, final String createdAt, final String updatedAt, final String finishedAt,
            final String createdBy, final MetaInformation _meta) {
        super(_meta);
        this.reportFormat = reportFormat;
        this.locale = locale;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.finishedAt = finishedAt;
        this.createdBy = createdBy;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public String getLocale() {
        return locale;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public DateTime getTimeCreatedAt() {
        return getDateTime(createdAt);
    }

    public DateTime getTimeUpdatedAt() {
        return getDateTime(updatedAt);
    }

    public DateTime getTimeFinishedAt() {
        return getDateTime(finishedAt);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
        result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
        result = prime * result + fileSize;
        result = prime * result + ((finishedAt == null) ? 0 : finishedAt.hashCode());
        result = prime * result + ((locale == null) ? 0 : locale.hashCode());
        result = prime * result + ((reportFormat == null) ? 0 : reportFormat.hashCode());
        result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
        result = prime * result + ((getMeta() == null) ? 0 : getMeta().hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ReportInformationItem)) {
            return false;
        }
        final ReportInformationItem other = (ReportInformationItem) obj;
        if (getMeta() == null) {
            if (other.getMeta() != null) {
                return false;
            }
        } else if (!getMeta().equals(other.getMeta())) {
            return false;
        }
        if (createdAt == null) {
            if (other.createdAt != null) {
                return false;
            }
        } else if (!createdAt.equals(other.createdAt)) {
            return false;
        }
        if (createdBy == null) {
            if (other.createdBy != null) {
                return false;
            }
        } else if (!createdBy.equals(other.createdBy)) {
            return false;
        }
        if (fileName == null) {
            if (other.fileName != null) {
                return false;
            }
        } else if (!fileName.equals(other.fileName)) {
            return false;
        }
        if (fileSize != other.fileSize) {
            return false;
        }
        if (finishedAt == null) {
            if (other.finishedAt != null) {
                return false;
            }
        } else if (!finishedAt.equals(other.finishedAt)) {
            return false;
        }
        if (locale == null) {
            if (other.locale != null) {
                return false;
            }
        } else if (!locale.equals(other.locale)) {
            return false;
        }
        if (reportFormat == null) {
            if (other.reportFormat != null) {
                return false;
            }
        } else if (!reportFormat.equals(other.reportFormat)) {
            return false;
        }
        if (updatedAt == null) {
            if (other.updatedAt != null) {
                return false;
            }
        } else if (!updatedAt.equals(other.updatedAt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, RecursiveToStringStyle.JSON_STYLE);
    }

}
