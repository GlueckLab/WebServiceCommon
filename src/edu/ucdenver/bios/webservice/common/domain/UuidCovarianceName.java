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
 * This is a wrapper for the Covariance object.
 *
 * When user requests remove/retrieve a Covariance, this wrapper class serves
 * the purpose. User can pass Uuid and Name of Covariance through this wrapper.
 *
 * @author Uttara Sakhadeo .
 */
public class UuidCovarianceName implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The uuid. */
    private byte[] uuid;

    /** The covariance name. */
    private String covarianceName;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new uuid covariance name.
     */
    public UuidCovarianceName() {
        super();
    }

    /**
     * Instantiates a new uuid covariance name.
     *
     * @param uuid
     *            the uuid
     */
    public UuidCovarianceName(final byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid covariance name.
     *
     * @param covarianceName
     *            the covariance name
     */
    public UuidCovarianceName(final String covarianceName) {
        super();
        this.covarianceName = covarianceName;
    }

    /**
     * Instantiates a new uuid covariance name.
     *
     * @param uuid
     *            the uuid
     * @param covarianceName
     *            the covariance name
     */
    public UuidCovarianceName(final byte[] uuid, final String covarianceName) {
        super();
        this.uuid = uuid;
        this.covarianceName = covarianceName;
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
     * Gets the covariance name.
     *
     * @return the covariance name
     */
    public final String getCovarianceName() {
        return covarianceName;
    }

    /**
     * Sets the covariance name.
     *
     * @param covarianceName
     *            the new covariance name
     */
    public final void setCovarianceName(final String covarianceName) {
        this.covarianceName = covarianceName;
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
        return "UuidCovarianceName [uuid=" + Arrays.toString(uuid)
                + ", covarianceName=" + covarianceName + "]";
    }
}
