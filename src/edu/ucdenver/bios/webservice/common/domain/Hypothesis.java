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
import java.util.ArrayList;
import java.util.List;

import edu.ucdenver.bios.webservice.common.enums.HypothesisTypeEnum;

/**
 * This is a wrapper for the Hypothesis information.
 * @author Uttara Sakhadeo
 *
 */
public class Hypothesis implements Serializable 
{
    private static final long serialVersionUID = 570635778188633231L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/	
	private int id;	
	private HypothesisTypeEnum type;
	private List<HypothesisBetweenParticipantMapping> betweenParticipantFactorMapList = null;
	private List<HypothesisRepeatedMeasuresMapping> repeatedMeasuresMapTree= null;
	/*--------------------
	 * Constructors
	 *--------------------*/
	public Hypothesis(){}    
    /**
     * @param type
     * @param betweenParticipantFactorMapList
     * @param repeatedMeasuresMapTree
     */
    public Hypothesis(
            HypothesisTypeEnum type,
            List<HypothesisBetweenParticipantMapping> betweenParticipantFactorMapList,
            List<HypothesisRepeatedMeasuresMapping> repeatedMeasuresMapTree)
    {
        super();
        this.type = type;
        this.betweenParticipantFactorMapList = betweenParticipantFactorMapList;
        this.repeatedMeasuresMapTree = repeatedMeasuresMapTree;
    }
    /*--------------------
	 * Getter/Setter Methods
	 *--------------------*/  	
	public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public HypothesisTypeEnum getType()
    {
        return type;
    }

    public void setType(HypothesisTypeEnum type)
    {
        this.type = type;
    }

    public List<HypothesisBetweenParticipantMapping> getBetweenParticipantFactorMapList()
    {
        return betweenParticipantFactorMapList;
    }

    public void setBetweenParticipantFactorMapList(
            List<HypothesisBetweenParticipantMapping> betweenParticipantFactorMapList)
    {
        this.betweenParticipantFactorMapList = betweenParticipantFactorMapList;
    }    
    public List<HypothesisRepeatedMeasuresMapping> getRepeatedMeasuresMapTree()
    {
        return repeatedMeasuresMapTree;
    }
    public void setRepeatedMeasuresMapTree(
            List<HypothesisRepeatedMeasuresMapping> repeatedMeasuresMapTree)
    {
        this.repeatedMeasuresMapTree = repeatedMeasuresMapTree;
    }
    /*--------------------
     * Return BetweenParticipantFactor list
     *--------------------*/
        public List<BetweenParticipantFactor> getBetweenParticipantFactorList()
        {
            List<HypothesisBetweenParticipantMapping> list = this.getBetweenParticipantFactorMapList();
            List<BetweenParticipantFactor> betweenParticipantFactorList = new ArrayList<BetweenParticipantFactor>();
            for(HypothesisBetweenParticipantMapping m : list)
            {
                betweenParticipantFactorList.add(m.getBetweenParticipantFactor());
            }
            return betweenParticipantFactorList;
        } 
    /*--------------------
     * Return RepeatedMeasures list
     *--------------------*/
        public List<RepeatedMeasuresNode> getRepeatedMeasuresList()
        {
            List<HypothesisRepeatedMeasuresMapping> list = this.getRepeatedMeasuresMapTree();
            List<RepeatedMeasuresNode> betweenParticipantFactorList = new ArrayList<RepeatedMeasuresNode>();
            for(HypothesisRepeatedMeasuresMapping m : list)
            {
                betweenParticipantFactorList.add(m.getRepeatedMeasuresNode());
            }
            return betweenParticipantFactorList;
        } 
    /*--------------------
	 * toString()
	 *--------------------*/
	 @Override
	    public String toString()
	    {
	        return "Hypothesis [id=" + id + ", type=" + type
	                + ", betweenParticipantFactorMapList="
	                + betweenParticipantFactorMapList + ", repeatedMeasuresMapTree="
	                + repeatedMeasuresMapTree + "]";
	    }	
}
