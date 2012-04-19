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
package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;
import java.util.Arrays;

import edu.ucdenver.bios.webservice.common.enums.HypothesisTypeEnum;

// TODO: Auto-generated Javadoc
/**
 * This is a wrapper for the Hypothesis object.
 *
 * When user requests remove/retrieve a Hypothesis, this wrapper class serves
 * the purpose. User can pass Uuid and Type of Hypothesis through this wrapper.
 *
 * @author Uttara Sakhadeo .
 */
public class UuidHypothesisType implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The uuid. */
    private byte[] uuid;

    /** The type. */
    private HypothesisTypeEnum type;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new uuid hypothesis type.
     */
    public UuidHypothesisType() {
        super();
    }

    /**
     * Instantiates a new uuid hypothesis type.
     *
     * @param uuid
     *            the uuid
     */
    public UuidHypothesisType(final byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid hypothesis type.
     *
     * @param type
     *            the type
     */
    public UuidHypothesisType(final HypothesisTypeEnum type) {
        super();
        this.type = type;
    }

    /**
     * Instantiates a new uuid hypothesis type.
     *
     * @param uuid
     *            the uuid
     * @param type
     *            the type
     */
    public UuidHypothesisType(final byte[] uuid, final HypothesisTypeEnum type) {
        super();
        this.uuid = uuid;
        this.type = type;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the uuid.
     *
     * @return the uuid
     */
    public final byte[] getUuid() {
        return uuid;
    }

    /**
     * Sets the uuid.
     *
     * @param uuid
     *            the new uuid
     */
    public final void setUuid(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public final HypothesisTypeEnum getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type
     *            the new type
     */
    public final void setType(final HypothesisTypeEnum type) {
        this.type = type;
    }

    /*--------------------
     * toString()
     *--------------------*/
    /**
     * Intended only for debugging.
     *
     * <P>
     * Here, a generic implementation uses reflection to print names and values
     * of all fields <em>declared in this class</em>. Note that superclass
     * fields are left out of this implementation.
     *
     * @return the string
     */
    @Override
    public final String toString() {
        return "UuidHypothesisType [uuid=" + Arrays.toString(uuid) + ", type="
                + type + "]";
    }

}
