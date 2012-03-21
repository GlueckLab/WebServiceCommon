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

import edu.ucdenver.bios.webservice.common.enums.HypothesisTypeEnum;

/**
 * This is a wrapper for the Hypothesis information.
 * @author Uttara Sakhadeo
 *
 */
public class HypothesisRepeatedMeasuresMapping implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
   
    /*--------------------
     * Member Variables
     *--------------------*/
    private HypothesisTypeEnum type;
    private RepeatedMeasuresNode repeatedMeasuresNode = null;
    /*--------------------
     * Constructors
     *--------------------*/
    public HypothesisRepeatedMeasuresMapping(){}           
    /**
     * @param type
     * @param repeatedMeasuresNode
     */
    public HypothesisRepeatedMeasuresMapping(HypothesisTypeEnum type,
            RepeatedMeasuresNode repeatedMeasuresNode)
    {
        super();
        this.type = type;
        this.repeatedMeasuresNode = repeatedMeasuresNode;
    }
    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    public HypothesisTypeEnum getType()
    {
        return type;
    }
    public void setType(HypothesisTypeEnum type)
    {
        this.type = type;
    }
    public RepeatedMeasuresNode getRepeatedMeasuresNode()
    {
        return repeatedMeasuresNode;
    }
    public void setRepeatedMeasuresNode(RepeatedMeasuresNode repeatedMeasuresNode)
    {
        this.repeatedMeasuresNode = repeatedMeasuresNode;
    } 
    /*--------------------
     * toString()
     *--------------------*/
    @Override
    public String toString()
    {
        return "HypothesisRepeatedMeasuresMapping [type=" + type
                + ", repeatedMeasuresNode=" + repeatedMeasuresNode + "]";
    }    
}
