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
 * The Class UuidMatrixName.
 */
public class UuidMatrixName implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The uuid. */
    private byte[] uuid;

    /** The matrix name. */
    private String matrixName;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new uuid matrix name.
     */
    public UuidMatrixName() {
        super();
    }

    /**
     * Instantiates a new uuid matrix name.
     * 
     * @param uuid
     *            the uuid
     */
    public UuidMatrixName(byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid matrix name.
     * 
     * @param matrixName
     *            the matrix name
     */
    public UuidMatrixName(String matrixName) {
        super();
        this.matrixName = matrixName;
    }

    /**
     * Instantiates a new uuid matrix name.
     * 
     * @param uuid
     *            the uuid
     * @param matrixName
     *            the matrix name
     */
    public UuidMatrixName(byte[] uuid, String matrixName) {
        super();
        this.uuid = uuid;
        this.matrixName = matrixName;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the uuid.
     * 
     * @return the uuid
     */
    public byte[] getUuid() {
        return uuid;
    }

    /**
     * Sets the uuid.
     * 
     * @param uuid
     *            the new uuid
     */
    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Gets the matrix name.
     * 
     * @return the matrix name
     */
    public String getMatrixName() {
        return matrixName;
    }

    /**
     * Sets the matrix name.
     * 
     * @param matrixName
     *            the new matrix name
     */
    public void setMatrixName(String matrixName) {
        this.matrixName = matrixName;
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
    public String toString() {
        return "UuidMatrixName [uuid=" + Arrays.toString(uuid)
                + ", matrixName=" + matrixName + "]";
    }

}
