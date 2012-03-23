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
    REGRESSION_COEEFICIENT_SCALE_FACTOR("Regression Coefficient Scale Factor");

    /** The id. */
    private final String id;

    /**
     * Instantiates a new horizontal axis label enum.
     *
     * @param id
     *            the id
     */
    HorizontalAxisLabelEnum(final String id) {
        this.id = id;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Parses the id.
     *
     * @param id
     *            the id
     * @return the horizontal axis label enum
     */
    public static HorizontalAxisLabelEnum parseId(final String id) {
        HorizontalAxisLabelEnum horizontalAxisLabel = null;
        for (HorizontalAxisLabelEnum b : HorizontalAxisLabelEnum.values()) {
            if (id.equalsIgnoreCase(b.id)) {
                horizontalAxisLabel = b;
            }
        }
        return horizontalAxisLabel;
    }
}
