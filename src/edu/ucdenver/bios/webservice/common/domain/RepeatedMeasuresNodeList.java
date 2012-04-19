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
import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * List of repeated measures node objects to work around Jackson serializaiton
 * issues.
 *
 * @author Uttara Sakhadeo
 *
 */
public class RepeatedMeasuresNodeList implements Serializable{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The repeated measures list. */
    private List<RepeatedMeasuresNode> repeatedMeasuresList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new repeated measures node list.
     */
    public RepeatedMeasuresNodeList() {

    }

    /**
     * Instantiates a new repeated measures node list.
     *
     * @param uuid the uuid
     */
    public RepeatedMeasuresNodeList(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new repeated measures node list.
     *
     * @param uuid the uuid
     * @param list the list
     */
    public RepeatedMeasuresNodeList(final byte[] uuid,
        final List<RepeatedMeasuresNode> list) {
        this.uuid = uuid;
        this.repeatedMeasuresList = list;
    }

    /**
     * Instantiates a new repeated measures node list.
     *
     * @param size
     *            the size
     */
    public RepeatedMeasuresNodeList(final int size) {
        this.repeatedMeasuresList = new ArrayList<RepeatedMeasuresNode>(size);
    }

    /**
     * Instantiates a new repeated measures node list.
     *
     * @param list
     *            the list
     */
    public RepeatedMeasuresNodeList(final List<RepeatedMeasuresNode> list) {
        this.repeatedMeasuresList = list;
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
     * Gets the repeated measures list.
     *
     * @return the repeated measures list
     */
    public final List<RepeatedMeasuresNode> getRepeatedMeasuresList() {
        return repeatedMeasuresList;
    }

    /**
     * Sets the repeated measures list.
     *
     * @param repeatedMeasuresList the new repeated measures list
     */
    public final void setRepeatedMeasuresList(
            final List<RepeatedMeasuresNode> repeatedMeasuresList) {
        this.repeatedMeasuresList = repeatedMeasuresList;
    }      
}
