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
 * This is a wrapper for the TypeIError information.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class TypeIError implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5142097237939251003L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The idx. */
    private int idx;

    /** The alpha value. */
    private double alphaValue;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new type i error.
     */
    public TypeIError() {
    }

    /**
     * Instantiates a new type i error.
     * 
     * @param alphaValue
     *            the alpha value
     */
    public TypeIError(final double alphaValue) {
        super();
        this.alphaValue = alphaValue;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the id.
     * 
     * @return the id
     */
    public final int getIdx() {
        return idx;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public final void setIdx(final int id) {
        this.idx = id;
    }

    /**
     * Gets the alpha value.
     * 
     * @return the alpha value
     */
    public final double getAlphaValue() {
        return alphaValue;
    }

    /**
     * Sets the alpha value.
     * 
     * @param alphaValue
     *            the new alpha value
     */
    public final void setAlphaValue(final double alphaValue) {
        this.alphaValue = alphaValue;
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
        return "TypeIError [idx=" + idx + ", alphaValue=" + alphaValue + "]";
    }
}
