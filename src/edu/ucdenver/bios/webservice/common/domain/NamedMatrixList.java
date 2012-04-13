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

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * List of named matrix objects to work around Jackson serializaiton issues.
 * 
 * @author Sarah Kreidler
 */
public class NamedMatrixList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The matrix list. */
    private List<NamedMatrix> matrixList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new named matrix list.
     */
    public NamedMatrixList() {

    }

    /**
     * Instantiates a new named matrix list.
     * 
     * @param uuid
     *            the uuid
     */
    public NamedMatrixList(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new named matrix list.
     * 
     * @param uuid
     *            the uuid
     * @param list
     *            the list
     */
    public NamedMatrixList(final byte[] uuid, final List<NamedMatrix> list) {
        this.uuid = uuid;
        this.matrixList = list;
    }

    /**
     * Instantiates a new named matrix list.
     * 
     * @param size
     *            the size
     */
    public NamedMatrixList(final int size) {
        this.matrixList = new ArrayList<NamedMatrix>(size);
    }

    /**
     * Instantiates a new named matrix list.
     * 
     * @param list
     *            the list
     */
    public NamedMatrixList(final List<NamedMatrix> list) {
        this.matrixList = list;
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
     * Gets the matrix list.
     * 
     * @return the matrix list
     */
    public final List<NamedMatrix> getMatrixList() {
        return matrixList;
    }

    /**
     * Sets the matrix list.
     * 
     * @param matrixList
     *            the new matrix list
     */
    public final void setMatrixList(List<NamedMatrix> matrixList) {
        this.matrixList = matrixList;
    }

}
