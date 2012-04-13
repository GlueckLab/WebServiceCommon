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

// TO-DO: Auto-generated Javadoc
/**
 * List of statistical test objects to work around Jackson serializaiton issues.
 *
 * @author Uttara Sakhadeo
 *
 */
public class StatisticalTestList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The statistical test list. */
    private List<StatisticalTest> statisticalTestList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new statistical test list.
     */
    public StatisticalTestList() {

    }

    /**
     * Instantiates a new statistical test list.
     *
     * @param uuid the uuid
     */
    public StatisticalTestList(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new statistical test list.
     *
     * @param uuid the uuid
     * @param list the list
     */
    public StatisticalTestList(final byte[] uuid,
        final List<StatisticalTest> list) {
        this.uuid = uuid;
        this.statisticalTestList = list;
    }

    /**
     * Instantiates a new statistical test list.
     *
     * @param size
     *            the size
     */
    public StatisticalTestList(final int size) {
        this.statisticalTestList = new ArrayList<StatisticalTest>(size);
    }

    /**
     * Instantiates a new statistical test list.
     *
     * @param list
     *            the list
     */
    public StatisticalTestList(final List<StatisticalTest> list) {
        this.statisticalTestList = list;
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
     * Gets the statistical test list.
     *
     * @return the statistical test list
     */
    public final List<StatisticalTest> getStatisticalTestList() {
        return statisticalTestList;
    }

    /**
     * Sets the statistical test list.
     *
     * @param statisticalTestList the new statistical test list
     */
    public final void setStatisticalTestList(
            List<StatisticalTest> statisticalTestList) {
        this.statisticalTestList = statisticalTestList;
    }

}
