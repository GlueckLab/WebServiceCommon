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
 * Enum object referred in 'StudyDesign' class.
 *
 * @author Uttara Sakhadeo
 */
public enum StudyDesignViewTypeEnum {

    /** The GUIDE d_ mode. */
    GUIDED_MODE("Guided Mode"),

    /** The MATRI x_ mode. */
    MATRIX_MODE("Matrix Mode"),

    /** The UPLOAD. */
    UPLOAD("Upload");

    /** The idx. */
    private final String idx;

    /**
     * Instantiates a new study design view type enum.
     *
     * @param idx
     *            the idx
     */
    StudyDesignViewTypeEnum(final String idx) {
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
     * @return the study design view type enum
     */
    public static StudyDesignViewTypeEnum parseId(final String idx) {
        StudyDesignViewTypeEnum studyDesignViewTypeEnum = null;
        for (StudyDesignViewTypeEnum b : StudyDesignViewTypeEnum.values()) {
            if (idx.equalsIgnoreCase(b.idx)) {
                studyDesignViewTypeEnum = b;
            }
        }
        return studyDesignViewTypeEnum;
    }
}
