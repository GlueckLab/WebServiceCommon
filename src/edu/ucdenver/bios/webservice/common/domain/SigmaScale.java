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
 * This is a wrapper for the SigmaScale information.
 *
 * @author Uttara Sakhadeo
 *
 */
public class SigmaScale implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3573281687667302009L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** The value. */
    private double value;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new sigma scale.
     */
    public SigmaScale() {
    }

    /**
     * Instantiates a new sigma scale.
     *
     * @param value
     *            the value
     */
    public SigmaScale(final double value) {
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
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public final void setId(final int id) {
        this.id = id;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public final double getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value
     *            the new value
     */
    public final void setValue(final double value) {
        this.value = value;
    }

    /*--------------------
     * toString()
     *--------------------*/
    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public final String toString() {
        return "SigmaScale [id=" + id + ", value=" + value + "]";
    }
}
