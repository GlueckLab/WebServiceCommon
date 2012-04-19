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

// TODO: Auto-generated Javadoc
/**
 * This is a wrapper for the NamedMatrix object.
 *
 * When user requests create/update a NamedMatrix, this wrapper class serves the
 * purpose. User can pass Uuid and NamedMatrix object through this wrapper.
 *
 * @author Uttara Sakhadeo .
 */
public class UuidMatrix implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The uuid. */
    private byte[] uuid;

    /** The matrix. */
    private NamedMatrix matrix;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new uuid matrix.
     */
    public UuidMatrix() {
        super();
    }

    /**
     * Instantiates a new uuid matrix.
     *
     * @param uuid
     *            the uuid
     */
    public UuidMatrix(final byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid matrix.
     *
     * @param matrix
     *            the matrix
     */
    public UuidMatrix(final NamedMatrix matrix) {
        super();
        this.matrix = matrix;
    }

    /**
     * Instantiates a new uuid matrix.
     *
     * @param uuid
     *            the uuid
     * @param matrix
     *            the matrix
     */
    public UuidMatrix(final byte[] uuid, final NamedMatrix matrix) {
        super();
        this.uuid = uuid;
        this.matrix = matrix;
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
     * Gets the matrix.
     *
     * @return the matrix
     */
    public final NamedMatrix getMatrix() {
        return matrix;
    }

    /**
     * Sets the matrix.
     *
     * @param matrix
     *            the new matrix
     */
    public final void setMatrix(final NamedMatrix matrix) {
        this.matrix = matrix;
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
        return "UuidMatrix [uuid=" + Arrays.toString(uuid) + ", matrix="
                + matrix + "]";
    }
}
