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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;

/**
 * This is a wrapper for the SampleSize a list object information.
 * @author Uttara Sakhadeo
 *
 */
public class SampleSize implements Serializable 
{
    private static final long serialVersionUID = 7498358054750918337L;
    
    /*--------------------
     * Member Variables
     *--------------------*/    
    private int id;     
    private int value;   
    /*--------------------
     * Constructors
     *--------------------*/
    public SampleSize(){} 
    /**
     * @param value
     */
    public SampleSize(int value) {
        super();
        this.value = value;
    }
    /**
     * @param id
     * @param value
     */
    public SampleSize(int id, int value) {
        super();
        this.id = id;
        this.value = value;
    }
    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    /*--------------------
     * toString()
     *--------------------*/
    @Override
    public String toString() {
        return "Quantile [id=" + id + ", value=" + value + "]";
    }   
}