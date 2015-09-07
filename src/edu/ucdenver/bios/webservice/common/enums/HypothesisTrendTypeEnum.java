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
 * Enum of available types of trends which can be tested in a hypothesis.
 */
public enum HypothesisTrendTypeEnum {

    /** The NONE. */
    NONE("None"),

    /** The CHANG e_ fro m_ baseline. */
    CHANGE_FROM_BASELINE("Change from baseline"),

    /** The AL l_ poynomial. */
    ALL_POLYNOMIAL("All polynomial trends"),

    /** The LINEAR. */
    LINEAR("Linear trend"),

    /** The QUADRATIC. */
    QUADRATIC("Quadratic trend"),

    /** The CUBIC. */
    CUBIC("Cubic trend");

    /** The idx. */
    private final String idx;

    /**
     * Instantiates a new hypothesis trend type enum.
     *
     * @param idx
     *            the idx
     */
    HypothesisTrendTypeEnum(final String idx) {
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
     * @return the hypothesis trend type enum
     */
    public static HypothesisTrendTypeEnum parseId(final String idx) {
        HypothesisTrendTypeEnum hypothesisTrendType = null;
        for (HypothesisTrendTypeEnum type : HypothesisTrendTypeEnum.values()) {
            if (idx.equalsIgnoreCase(type.idx)) {
                hypothesisTrendType = type;
            }
        }
        return hypothesisTrendType;
    }
}
