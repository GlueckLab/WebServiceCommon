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
 * The Class Category.
 */
public class Category implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4943061399348979383L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The idx. */
    private int idx;

    /** The category. */
    private String category = null;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new category.
     */
    public Category() {
    }

    /**
     * Instantiates a new category.
     *
     * @param categoryValue
     *            the category
     */
    public Category(final String categoryValue) {
        this.category = categoryValue;
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
     * @param idValue
     *            the new id
     */
    public final void setIdx(final int idValue) {
        this.idx = idValue;
    }

    /**
     * Gets the category.
     *
     * @return the category
     */
    public final String getCategory() {
        return category;
    }

    /**
     * Sets the category.
     *
     * @param categoryValue
     *            the new category
     */
    public final void setCategory(final String categoryValue) {
        this.category = categoryValue;
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
        return "Category [idx=" + idx + ", category=" + category + "]";
    }
}
