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
 * Enum of types of repeated measures.
 */
public enum RepeatedMeasuresDimensionType {

    /** The NUMERICAL. */
    NUMERICAL("Numerical"),

    /** The ORDINAL. */
    ORDINAL("Ordinal"),

    /** The CATEGORICAL. */
    CATEGORICAL("Categorical");

    /** The idx. */
    private final String idx;

    /**
     * Instantiates a new repeated measures dimension type.
     *
     * @param idx
     *            the idx
     */
    RepeatedMeasuresDimensionType(final String idx) {
        this.idx = idx;
    }

    /**
     * Gets the idx.
     *
     * @return the idx
     */
    public String getId() {
        return idx;
    }

    /**
     * Parses the idx.
     *
     * @param idx
     *            the idx
     * @return the repeated measures dimension type
     */
    public static RepeatedMeasuresDimensionType parseId(final String idx) {
        RepeatedMeasuresDimensionType dimensionType = null;
        for (RepeatedMeasuresDimensionType type : RepeatedMeasuresDimensionType
                .values()) {
            if (idx.equalsIgnoreCase(type.idx)) {
                dimensionType = type;
            }
        }
        return dimensionType;
    }
}
