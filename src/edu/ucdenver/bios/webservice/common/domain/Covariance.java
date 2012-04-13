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
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * This is a wrapper for the Covariance information.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class Covariance implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** The name. */
    private String name;
    
    /** The standard deviation list. */
    private List<StandardDeviation> standardDeviationList = null;

    /** The rho. */
    private double rho;

    /** The delta. */
    private double delta;

    /** The rows. */
    private int rows;

    /** The columns. */
    private int columns;

    /** The blob. */
    private Blob2DArray blob;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new covariance.
     */
    public Covariance() {
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the id.
     * 
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(int id) {
        this.id = id;
    }    

    /**
     * Gets the rho.
     * 
     * @return the rho
     */
    public double getRho() {
        return rho;
    }

    /**
     * Sets the rho.
     * 
     * @param rho
     *            the new rho
     */
    public void setRho(double rho) {
        this.rho = rho;
    }

    /**
     * Gets the delta.
     * 
     * @return the delta
     */
    public double getDelta() {
        return delta;
    }

    /**
     * Sets the delta.
     * 
     * @param delta
     *            the new delta
     */
    public void setDelta(double delta) {
        this.delta = delta;
    }

    /**
     * Gets the rows.
     * 
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * Sets the rows.
     * 
     * @param rows
     *            the new rows
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * Gets the columns.
     * 
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Sets the columns.
     * 
     * @param columns
     *            the new columns
     */
    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the blob.
     * 
     * @return the blob
     */
    public Blob2DArray getBlob() {
        return blob;
    }

    /**
     * Sets the blob.
     * 
     * @param blob
     *            the new blob
     */
    public void setBlob(Blob2DArray blob) {
        this.blob = blob;
    }
    
    /**
     * Gets the standard deviation list.
     *
     * @return the standard deviation list
     */
    public List<StandardDeviation> getStandardDeviationList() {
        return standardDeviationList;
    }

    /**
     * Sets the standard deviation list.
     *
     * @param standardDeviationList the new standard deviation list
     */
    public void setStandardDeviationList(
            List<StandardDeviation> standardDeviationList) {
        this.standardDeviationList = standardDeviationList;
    }

    /*--------------------
     * Return/Store data[][]
     *--------------------*/
    /**
     * Sets the blob.
     * 
     * @param data
     *            the new blob
     */
    public void setBlobFromArray(double[][] data) {
        Blob2DArray blob = new Blob2DArray(data);
        setBlob(blob);
    }

    /**
     * Gets the double array from blob.
     * 
     * @return the double array from blob
     */
    public double[][] getDoubleArrayFromBlob() {
        return blob.getData();
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
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Covariance [id=" + id + ", name=" + name
                + ", standardDeviationList=" + standardDeviationList + ", rho="
                + rho + ", delta=" + delta + ", rows=" + rows + ", columns="
                + columns + ", blob=" + blob + "]";
    }
}
