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
 * List of Type I Error objects to work around Jackson serializaiton issues.
 *
 * @author Uttara Sakhadeo
 *
 */
public class TypeIErrorList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;
    
    /** The type i error list. */
    List<TypeIError> typeIErrorList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new type i error list.
     */
    public TypeIErrorList() {

    }       

    /**
     * Instantiates a new type i error list.
     *
     * @param uuid the uuid
     */
    public TypeIErrorList(byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new type i error list.
     *
     * @param uuid the uuid
     * @param typeIErrorList the type i error list
     */
    public TypeIErrorList(byte[] uuid, List<TypeIError> typeIErrorList) {
        super();
        this.uuid = uuid;
        this.typeIErrorList = typeIErrorList;
    }

    /**
     * Instantiates a new type i error list.
     *
     * @param size
     *            the size
     */
    public TypeIErrorList(final int size) {
        this.typeIErrorList = new ArrayList<TypeIError>(size);
    }

    /**
     * Instantiates a new type i error list.
     *
     * @param list
     *            the list
     */
    public TypeIErrorList(final List<TypeIError> list) {
        this.typeIErrorList = list;
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
     * Gets the type i error list.
     *
     * @return the type i error list
     */
    public List<TypeIError> getTypeIErrorList() {
        return typeIErrorList;
    }

    /**
     * Sets the type i error list.
     *
     * @param typeIErrorList the new type i error list
     */
    public void setTypeIErrorList(List<TypeIError> typeIErrorList) {
        this.typeIErrorList = typeIErrorList;
    }
        
}
