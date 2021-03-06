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
 * Enum object referred in 'PowerCurveDescription' class.
 *
 * @author Uttara Sakhadeo
 */
public enum HorizontalAxisLabelEnum {

    /** The VARIABILITY SCALE FACTOR. */
    VARIABILITY_SCALE_FACTOR("Variability Scale Factor"),

    /** The TOTAL SAMPLE SIZE. */
    TOTAL_SAMPLE_SIZE("Total Sample Size"),

    /** The REGRESSION COEEFICIENT SCALE FACTOR. */
    REGRESSION_COEEFICIENT_SCALE_FACTOR("Regression Coefficient Scale Factor"),

    /** The desired power **/
    DESIRED_POWER("Desired Power");

    /** The idx. */
    private final String idx;

    /**
     * Instantiates a new horizontal axis label enum.
     *
     * @param idx
     *            the idx
     */
    HorizontalAxisLabelEnum(final String idx) {
        this.idx = idx;
    }

    /**
     * Gets the idx.
     *
     * @return the idx
     */
    public String getIdx() {
        return idx;
    }

    /**
     * Parses the idx.
     *
     * @param idx
     *            the idx
     * @return the horizontal axis label enum
     */
    public static HorizontalAxisLabelEnum parseId(final String idx) {
        HorizontalAxisLabelEnum horizontalAxisLabel = null;
        for (HorizontalAxisLabelEnum b : HorizontalAxisLabelEnum.values()) {
            if (idx.equalsIgnoreCase(b.idx)) {
                horizontalAxisLabel = b;
            }
        }
        return horizontalAxisLabel;
    }
}
