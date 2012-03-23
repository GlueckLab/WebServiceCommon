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
 * Enum object referred in 'StatisticalTest' class.
 *
 * @author Uttara Sakhadeo
 */
public enum StatisticalTestTypeEnum {

    /** The UNIREP. */
    UNIREP("unirep"),

    /** The UNIREPBOX. */
    UNIREPBOX("unirepBox"),

    /** The UNIREPGG. */
    UNIREPGG("unirepGG"),

    /** The UNIREPHF. */
    UNIREPHF("unirepHF"),

    /** The WL. */
    WL("wl"),

    /** The PBT. */
    PBT("pbt"),

    /** The HLT. */
    HLT("hlt");

    /** The id. */
    private final String id;

    /**
     * Instantiates a new statistical test type enum.
     *
     * @param id
     *            the id
     */
    StatisticalTestTypeEnum(final String id) {
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
     * @return the statistical test type enum
     */
    public static StatisticalTestTypeEnum parseId(final String id) {
        StatisticalTestTypeEnum type = null;
        for (StatisticalTestTypeEnum b : StatisticalTestTypeEnum.values()) {
            if (id.equalsIgnoreCase(b.id)) {
                type = b;
            }
        }
        return type;
    }
}
