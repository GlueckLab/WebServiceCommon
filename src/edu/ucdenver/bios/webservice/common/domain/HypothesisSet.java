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
 * List of Hypothesis objects to work around Jackson serializaiton issues.
 *
 * @author Uttara Sakhadeo
 *
 */
public class HypothesisSet {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;
    
    /** The hypothesis set. */
    private Set<Hypothesis> hypothesisSet = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new hypothesis set.
     */
    public HypothesisSet() {

    }
    
    /**
     * Instantiates a new hypothesis set.
     *
     * @param uuid the uuid
     */
    public HypothesisSet(final byte[] uuid) {
        this.uuid = uuid;
    }
    
    /**
     * Instantiates a new hypothesis set.
     *
     * @param uuid the uuid
     * @param set the set
     */
    public HypothesisSet(final byte[] uuid,
        final Set<Hypothesis> set) {
        this.uuid = uuid;
        this.hypothesisSet = set;
    }

    /**
     * Instantiates a new hypothesis set.
     *
     * @param size
     *            the size
     */
    public HypothesisSet(final int size) {
        this.hypothesisSet = new HashSet<Hypothesis>(size);
    }

    /**
     * Instantiates a new hypothesis set.
     *
     * @param set
     *            the set
     */
    public HypothesisSet(final Set<Hypothesis> set) {
        this.hypothesisSet = set;
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
     * Gets the hypothesis set.
     *
     * @return the hypothesis set
     */
    public final Set<Hypothesis> getHypothesisSet() {
        return hypothesisSet;
    }

    /**
     * Sets the hypothesis set.
     *
     * @param hypothesisSet the new hypothesis set
     */
    public final void setHypothesisSet(Set<Hypothesis> hypothesisSet) {
        this.hypothesisSet = hypothesisSet;
    }
        
}
