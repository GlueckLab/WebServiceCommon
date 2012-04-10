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

import edu.ucdenver.bios.webservice.common.enums.HypothesisTrendTypeEnum;

/**
 * This is a wrapper for the Hypothesis information.
 *
 * @author Uttara Sakhadeo
 *
 */
public class HypothesisRepeatedMeasuresMapping implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The type. */
    private HypothesisTrendTypeEnum type;

    /** The repeated measures node. */
    private RepeatedMeasuresNode repeatedMeasuresNode = null;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new hypothesis repeated measures mapping.
     */
    public HypothesisRepeatedMeasuresMapping() {
    }

    /**
     * Instantiates a new hypothesis repeated measures mapping.
     *
     * @param type
     *            the type
     * @param repeatedMeasuresNode
     *            the repeated measures node
     */
    public HypothesisRepeatedMeasuresMapping(final HypothesisTrendTypeEnum type,
            final RepeatedMeasuresNode repeatedMeasuresNode) {
        super();
        this.type = type;
        this.repeatedMeasuresNode = repeatedMeasuresNode;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the type.
     *
     * @return the type
     */
    public final HypothesisTrendTypeEnum getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type
     *            the new type
     */
    public final void setType(final HypothesisTrendTypeEnum type) {
        this.type = type;
    }

    /**
     * Gets the repeated measures node.
     *
     * @return the repeated measures node
     */
    public final RepeatedMeasuresNode getRepeatedMeasuresNode() {
        return repeatedMeasuresNode;
    }

    /**
     * Sets the repeated measures node.
     *
     * @param repeatedMeasuresNode
     *            the new repeated measures node
     */
    public final void setRepeatedMeasuresNode(
            final RepeatedMeasuresNode repeatedMeasuresNode) {
        this.repeatedMeasuresNode = repeatedMeasuresNode;
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
        return "HypothesisRepeatedMeasuresMapping [type=" + type
                + ", repeatedMeasuresNode=" + repeatedMeasuresNode + "]";
    }
}
