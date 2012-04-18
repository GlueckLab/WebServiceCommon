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

import java.util.HashSet;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Set of named matrix objects to work around Jackson serializaiton issues.
 * 
 * @author Sarah Kreidler
 */
public class NamedMatrixSet {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The matrix set. */
    private Set<NamedMatrix> matrixSet = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new named matrix set.
     */
    public NamedMatrixSet() {

    }

    /**
     * Instantiates a new named matrix set.
     * 
     * @param uuid
     *            the uuid
     */
    public NamedMatrixSet(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new named matrix set.
     * 
     * @param uuid
     *            the uuid
     * @param set
     *            the set
     */
    public NamedMatrixSet(final byte[] uuid, final Set<NamedMatrix> set) {
        this.uuid = uuid;
        this.matrixSet = set;
    }

    /**
     * Instantiates a new named matrix set.
     * 
     * @param size
     *            the size
     */
    public NamedMatrixSet(final int size) {
        this.matrixSet = new HashSet<NamedMatrix>(size);
    }

    /**
     * Instantiates a new named matrix set.
     * 
     * @param set
     *            the set
     */
    public NamedMatrixSet(final Set<NamedMatrix> set) {
        this.matrixSet = set;
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
     * Gets the matrix set.
     * 
     * @return the matrix set
     */
    public final Set<NamedMatrix> getMatrixSet() {
        return matrixSet;
    }

    /**
     * Sets the matrix set.
     * 
     * @param matrixSet
     *            the new matrix set
     */
    public final void setMatrixSet(Set<NamedMatrix> matrixSet) {
        this.matrixSet = matrixSet;
    }

}
