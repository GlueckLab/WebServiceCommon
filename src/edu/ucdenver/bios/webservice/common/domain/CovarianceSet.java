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
// TO-DO: Auto-generated Javadoc
/**
 * List of covariance objects to work around Jackson serializaiton issues.
 *
 * @author Uttara Sakhadeo
 *
 */
public class CovarianceSet {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;
    
    /** The covariance set. */
    private Set<Covariance> covarianceSet = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new covariance set.
     */
    public CovarianceSet() {

    }
    
    /**
     * Instantiates a new covariance set.
     *
     * @param uuid the uuid
     */
    public CovarianceSet(final byte[] uuid) {
        this.uuid = uuid;        
    }
    
    /**
     * Instantiates a new covariance set.
     *
     * @param uuid the uuid
     * @param set the set
     */
    public CovarianceSet(final byte[] uuid,
            final Set<Covariance> set) {
        this.uuid = uuid;
        this.covarianceSet = set;
    }

    /**
     * Instantiates a new covariance set.
     *
     * @param size
     *            the size
     */
    public CovarianceSet(final int size) {
        this.covarianceSet = new HashSet<Covariance>(size);
    }

    /**
     * Instantiates a new covariance set.
     *
     * @param set
     *            the set
     */
    public CovarianceSet(final Set<Covariance> set) {
        this.covarianceSet = set;
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
     * Gets the covariance set.
     *
     * @return the covariance set
     */
    public final Set<Covariance> getCovarianceSet() {
        return covarianceSet;
    }

    /**
     * Sets the covariance set.
     *
     * @param covarianceSet the new covariance set
     */
    public final void setCovarianceSet(Set<Covariance> covarianceSet) {
        this.covarianceSet = covarianceSet;
    }
        
}
