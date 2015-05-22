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

/**
 * Convenience routines for handling blobs.
 */
public class Blob2DArray implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The data. */
    private double[][] data;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new blob2 d array.
     */
    public Blob2DArray() {
        super();
    }

    /**
     * Instantiates a new blob2 d array.
     *
     * @param dataValue
     *            the data
     */
    public Blob2DArray(final double[][] dataValue) {
        super();
        this.data = dataValue;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the data.
     *
     * @return the data
     */
    public final double[][] getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param dataValue
     *            the new data
     */
    public final void setData(final double[][] dataValue) {
        this.data = dataValue;
    }

    /*--------------------
     * toString()
     *--------------------*/
    /**
     * Intended only for debugging.
     *
     * <P>Here, a generic implementation uses reflection to print
     * names and values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     */
    @Override
    public final String toString() {
        return "Blob2DArray [data=" + Arrays.toString(data) + "]";
    }
}
