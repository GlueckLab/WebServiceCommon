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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import edu.ucdenver.bios.webservice.common.enums.HorizontalAxisLabelEnum;
import edu.ucdenver.bios.webservice.common.enums.PowerMethodEnum;
import edu.ucdenver.bios.webservice.common.enums.StatisticalTestTypeEnum;
import edu.ucdenver.bios.webservice.common.enums.StratificationVariableEnum;

// TODO: Auto-generated Javadoc
/**
 * Object describes Power Curve Structure.
 * 
 * @author Uttara Sakhadeo
 */
public class PowerCurveDescription implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 701214126222753261L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** boolean indicating if the legend should be displayed. */
    private boolean legend = false;
    
    /** width and height of image. */
    private int width = 300;   
    private int height = 300;
    
    /** The power curve description. */
    private String title = null;

    /** The horizontal axis label enum. */
    private HorizontalAxisLabelEnum horizontalAxisLabelEnum = null;

    /** List of data series included in the plot. */
    private List<PowerCurveDataSeries> dataSeriesList = null;
    
    /*--------------------
     * Constructors
     *--------------------*/   
    /**
     * Instantiates a new power curve description.
     */
    public PowerCurveDescription() {
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
     * Checks if is legend.
     *
     * @return true, if is legend
     */
    public boolean isLegend() {
        return legend;
    }

    /**
     * Sets the legend.
     *
     * @param legend the new legend
     */
    public void setLegend(boolean legend) {
        this.legend = legend;
    }

    /**
     * Gets the width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the width.
     *
     * @param width the new width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets the height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height.
     *
     * @param height the new height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**

     * Gets the title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     *
     * @param title the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**

     * Gets the horizontal axis label enum.
     * 
     * @return the horizontal axis label enum
     */
    public final HorizontalAxisLabelEnum getHorizontalAxisLabelEnum() {
        return horizontalAxisLabelEnum;
    }

    /**
     * Sets the horizontal axis label enum.
     * 
     * @param horizontalAxisLabelEnum
     *            the new horizontal axis label enum
     */
    public final void setHorizontalAxisLabelEnum(final
            HorizontalAxisLabelEnum horizontalAxisLabelEnum) {
        this.horizontalAxisLabelEnum = horizontalAxisLabelEnum;
    }

    /**
     * Gets the data series list.
     *
     * @return the data series list
     */
    public List<PowerCurveDataSeries> getDataSeriesList() {
        return dataSeriesList;
    }

    /**
     * Sets the data series list.
     *
     * @param dataSeriesList the new data series list
     */
    public void setDataSeriesList(List<PowerCurveDataSeries> dataSeriesList) {
        this.dataSeriesList = dataSeriesList;
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
    public String toString() {
        return "PowerCurveDescription [id=" + id + ", legend=" + legend
                + ", width=" + width + ", height=" + height + ", title="
                + title + ", horizontalAxisLabelEnum="
                + horizontalAxisLabelEnum + ", dataSeriesList="
                + dataSeriesList + "]";
    }


}
