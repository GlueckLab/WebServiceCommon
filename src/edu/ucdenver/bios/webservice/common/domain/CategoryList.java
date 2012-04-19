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
 * List of category objects to work around Jackson serializaiton issues.
 *
 * @author Uttara Sakhadeo
 *
 */
public class CategoryList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The category list. */
    private List<Category> categoryList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new category list.
     */
    public CategoryList() {

    }

    /**
     * Instantiates a new category list.
     *
     * @param uuid
     *            the uuid
     */
    public CategoryList(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new category list.
     *
     * @param size
     *            the size
     */
    public CategoryList(final int size) {
        this.categoryList = new ArrayList<Category>(size);
    }

    /**
     * Instantiates a new category list.
     *
     * @param list
     *            the list
     */
    public CategoryList(final List<Category> list) {
        this.categoryList = list;
    }

    /**
     * Instantiates a new category list.
     *
     * @param uuid
     *            the uuid
     * @param list
     *            the list
     */
    public CategoryList(final byte[] uuid, final List<Category> list) {
        this.categoryList = list;
        this.uuid = uuid;
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
     * Gets the category list.
     *
     * @return the category list
     */
    public final List<Category> getCategoryList() {
        return categoryList;
    }

    /**
     * Sets the category list.
     *
     * @param categoryList
     *            the new category list
     */
    public final void setCategoryList(final List<Category> categoryList) {
        this.categoryList = categoryList;
    }

}
