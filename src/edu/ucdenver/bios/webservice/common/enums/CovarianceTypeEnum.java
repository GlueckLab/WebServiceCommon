/*
 * Web service utility functions for managing hibernate, json, etc.
 *
 * Copyright (C) 2010 Regents of the University of Colorado.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 */
package edu.ucdenver.bios.webservice.common.enums;

/**
 * Enum object for covariance matrix types
 *
 * @author Uttara Sakhadeo
 * @author Sarah Kreidler
 */
public enum CovarianceTypeEnum {

    /** Lear correlation */
    LEAR_CORRELATION("LEAR Correlation"),

    /** Unstructured correlation. */
    UNSTRUCTURED_CORRELATION("Unstructured Correlation"),

    /** Unstructured covariance. */
    UNSTRUCTURED_COVARIANCE("Unstructured Covariance");

    /** The id. */
    private final String idx;

    /**
     * Instantiates a new horizontal axis label enum.
     *
     * @param id
     *            the id
     */
    CovarianceTypeEnum(final String idx) {
        this.idx = idx;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getIdx() {
        return idx;
    }

    /**
     * Parses the id.
     *
     * @param id
     *            the id
     * @return the horizontal axis label enum
     */
    public static CovarianceTypeEnum parseId(final String idx) {
        CovarianceTypeEnum covarianceType = null;
        for (CovarianceTypeEnum ct : CovarianceTypeEnum.values()) {
            if (idx.equalsIgnoreCase(ct.idx)) {
                covarianceType = ct;
            }
        }
        return covarianceType;
    }
}

