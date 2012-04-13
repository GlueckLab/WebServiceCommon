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
 * List of power result objects to work around Jackson serializaiton issues.
 * 
 * @author Sarah Kreidler
 */
public class PowerResultList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The power result list. */
    private List<PowerResult> powerResultList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new power result list.
     */
    public PowerResultList() {

    }

    /**
     * Instantiates a new power result list.
     * 
     * @param uuid
     *            the uuid
     */
    public PowerResultList(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new power result list.
     * 
     * @param uuid
     *            the uuid
     * @param list
     *            the list
     */
    public PowerResultList(final byte[] uuid, final List<PowerResult> list) {
        this.uuid = uuid;
        this.powerResultList = list;
    }

    /**
     * Instantiates a new power result list.
     * 
     * @param size
     *            the size
     */
    public PowerResultList(final int size) {
        this.powerResultList = new ArrayList<PowerResult>(size);
    }

    /**
     * Instantiates a new power result list.
     * 
     * @param list
     *            the list
     */
    public PowerResultList(final List<PowerResult> list) {
        this.powerResultList = list;
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
     * Gets the power result list.
     * 
     * @return the power result list
     */
    public final List<PowerResult> getPowerResultList() {
        return powerResultList;
    }

    /**
     * Sets the power result list.
     * 
     * @param powerResultList
     *            the new power result list
     */
    public final void setPowerResultList(List<PowerResult> powerResultList) {
        this.powerResultList = powerResultList;
    }

}
