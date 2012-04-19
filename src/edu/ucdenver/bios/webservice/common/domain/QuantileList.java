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

import org.hibernate.mapping.Array;

// TODO: Auto-generated Javadoc

/**
 * List of quantile objects to work around Jackson serializaiton issues.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class QuantileList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The quantile list. */
    private List<Quantile> quantileList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new quantile list.
     */
    public QuantileList() {

    }

    /**
     * Instantiates a new quantile list.
     * 
     * @param uuid
     *            the uuid
     */
    public QuantileList(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new quantile list.
     * 
     * @param uuid
     *            the uuid
     * @param list
     *            the list
     */
    public QuantileList(final byte[] uuid, final List<Quantile> list) {
        this.uuid = uuid;
        this.quantileList = list;
    }

    /**
     * Instantiates a new quantile list.
     * 
     * @param size
     *            the size
     */
    public QuantileList(final int size) {
        this.quantileList = new ArrayList<Quantile>(size);
    }

    /**
     * Instantiates a new quantile list.
     * 
     * @param list
     *            the list
     */
    public QuantileList(final List<Quantile> list) {
        this.quantileList = list;
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
     * Gets the quantile list.
     * 
     * @return the quantile list
     */
    public final List<Quantile> getQuantileList() {
        return quantileList;
    }

    /**
     * Sets the quantile list.
     * 
     * @param quantileList
     *            the new quantile list
     */
    public final void setQuantileList(final List<Quantile> quantileList) {
        this.quantileList = quantileList;
    }

}
