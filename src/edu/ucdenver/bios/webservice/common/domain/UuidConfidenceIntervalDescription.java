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
 * This is a wrapper for the ConfidenceIntervalDescription object.
 * 
 * When user requests create/update a ConfidenceIntervalDescription, this
 * wrapper class serves the purpose. User can pass Uuid and
 * ConfidenceIntervalDescription object through this wrapper.
 * 
 * @author Uttara Sakhadeo .
 */
public class UuidConfidenceIntervalDescription implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The uuid. */
    private byte[] uuid;

    /** The confidence interval. */
    private ConfidenceIntervalDescription confidenceInterval = null;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new uuid confidence interval description.
     */
    public UuidConfidenceIntervalDescription() {
    }

    /**
     * Instantiates a new uuid confidence interval description.
     * 
     * @param uuid
     *            the uuid
     */
    public UuidConfidenceIntervalDescription(final byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid confidence interval description.
     * 
     * @param confidenceInterval
     *            the confidence interval
     */
    public UuidConfidenceIntervalDescription(
            final ConfidenceIntervalDescription confidenceInterval) {
        super();
        this.confidenceInterval = confidenceInterval;
    }

    /**
     * Instantiates a new uuid confidence interval description.
     * 
     * @param uuid
     *            the uuid
     * @param confidenceInterval
     *            the confidence interval
     */
    public UuidConfidenceIntervalDescription(final byte[] uuid,
            final ConfidenceIntervalDescription confidenceInterval) {
        super();
        this.uuid = uuid;
        this.confidenceInterval = confidenceInterval;
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
     * Gets the confidence interval.
     * 
     * @return the confidence interval
     */
    public final ConfidenceIntervalDescription getConfidenceInterval() {
        return confidenceInterval;
    }

    /**
     * Sets the confidence interval.
     * 
     * @param confidenceInterval
     *            the new confidence interval
     */
    public final void setConfidenceInterval(
            final ConfidenceIntervalDescription confidenceInterval) {
        this.confidenceInterval = confidenceInterval;
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
        return "UuidConfidenceIntervalDescription [uuid="
                + Arrays.toString(uuid) + ", confidenceInterval="
                + confidenceInterval + "]";
    }
}
