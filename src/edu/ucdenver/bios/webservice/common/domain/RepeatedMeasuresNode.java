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

import edu.ucdenver.bios.webservice.common.enums.RepeatedMeasuresDimensionType;

/**
 * This is a wrapper for the repeated measures information.
 * @author Uttara Sakhadeo
 *
 */
public class RepeatedMeasuresNode implements Serializable 
{
    private static final long serialVersionUID = -714204384820498167L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/
	private int id;
	private String dimension = null;
	private RepeatedMeasuresDimensionType repeatedMeasuresDimensionType = null;
	private Integer numberOfMeasurements = null;
	private int node;
	private Integer parent;	
	private List<Spacing> spacingList = null;
	/*--------------------
	 * Constructors
	 *--------------------*/
	public RepeatedMeasuresNode()
	{
		//spacingList = new Spacing();
	}	
	public RepeatedMeasuresNode(String name) 
	{
		//super();
		this.dimension = name;		
	}		
	public RepeatedMeasuresNode(String name, RepeatedMeasuresDimensionType type, Integer count,int node, int parent) 
	{
		//super();
		this.dimension = name;
		this.repeatedMeasuresDimensionType = type;
		this.numberOfMeasurements = count;		
		this.node = node;
		this.parent = parent;		
	}			
	public RepeatedMeasuresNode(String name, RepeatedMeasuresDimensionType type, Integer count,
			List<Spacing> spacingList, int node, int parent) 
	{
		//super();
		this.dimension = name;
		this.repeatedMeasuresDimensionType = type;
		this.numberOfMeasurements = count;
		this.node = node;
		this.parent = parent;
		this.setSpacingList(spacingList);
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
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}	
	public Integer getNumberOfMeasurements() {
		return numberOfMeasurements;
	}
	public void setNumberOfMeasurements(Integer numberOfMeasurements) {
		this.numberOfMeasurements = numberOfMeasurements;
	}		
	public int getNode() {
		return node;
	}
	public void setNode(int node) {
		this.node = node;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	public List<Spacing> getSpacingList() {
		return spacingList;
	}
	public void setSpacingList(List<Spacing> spacingList) {
		this.spacingList = spacingList;
	}
	public RepeatedMeasuresDimensionType getRepeatedMeasuresDimensionType() {
		return repeatedMeasuresDimensionType;
	}
	public void setRepeatedMeasuresDimensionType(
			RepeatedMeasuresDimensionType repeatedMeasuresDimensionType) {
		this.repeatedMeasuresDimensionType = repeatedMeasuresDimensionType;
	}	
	/*--------------------
	 * toString()
	 *--------------------*/
	@Override
	public String toString() {
		return "RepeatedMeasuresNode [id=" + id + ", dimension=" + dimension
				+ ", repeatedMeasuresDimensionType="
				+ repeatedMeasuresDimensionType + ", numberOfMeasurements="
				+ numberOfMeasurements + ", node=" + node + ", parent="
				+ parent + ", spacingList=" + spacingList + "]";
	}	
}