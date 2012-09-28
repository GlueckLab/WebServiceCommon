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

/**
 * This is a wrapper for the RelativeGroupSize object information.
 *
 * @author Uttara Sakhadeo
 *
 */
public class RelativeGroupSize implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5881947477812713919L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The idx. */
    private int idx;

    /** The value. */
    private int value;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new relative group size.
     */
    public RelativeGroupSize() {
    }

    /**
     * Instantiates a new relative group size.
     *
     * @param value
     *            the value
     */
    public RelativeGroupSize(final int value) {
        super();
        this.value = value;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the id.
     *
     * @return the id
     */
    public final int getId() {
        return idx;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public final void setId(final int id) {
        this.idx = id;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public final int getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value
     *            the new value
     */
    public final void setValue(final int value) {
        this.value = value;
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
        return "RelativeGroupSize [id=" + idx + ", value=" + value + "]";
    }
}
