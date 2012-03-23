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
import java.util.List;

/**
 * This is a wrapper for the BetweenParticipantFactor information.
 *
 * @author Uttara Sakhadeo
 *
 */
public class BetweenParticipantFactor implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3373126132690287186L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** The predictor name. */
    private String predictorName = null;

    /** The category list. */
    private List<Category> categoryList = null;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new between participant factor.
     */
    public BetweenParticipantFactor() {
    }

    /**
     * Instantiates a new between participant factor.
     *
     * @param predictorNameValue
     *            the predictor name
     * @param categoryList
     *            the category list
     */
    public BetweenParticipantFactor(final String predictorNameValue,
            final List<Category> categoryList) {
        this.predictorName = predictorNameValue;
        this.categoryList = categoryList;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the predictor name.
     *
     * @return the predictor name
     */
    public final String getPredictorName() {
        return predictorName;
    }

    /**
     * Sets the predictor name.
     *
     * @param predictorNameValue
     *            the new predictor name
     */
    public final void setPredictorName(final String predictorNameValue) {
        this.predictorName = predictorNameValue;
    }

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
     * @param idValue
     *            the new id
     */
    public final void setId(final int idValue) {
        this.id = idValue;
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
        return "BetweenParticipantFactor [id=" + id + ", predictorName="
                + predictorName + ", categoryList=" + categoryList + "]";
    }
}
