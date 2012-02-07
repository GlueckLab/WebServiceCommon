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

import java.util.ArrayList;
import java.util.List;
/**
 * This is a wrapper for the spacing in repeated measures.
 * @author Uttara Sakhadeo
 *
 */
/*class Spacing
{
	protected List<Integer> spacingList = null;
	
	public Spacing()
	{
		spacingList = new ArrayList<Integer>();
	}		
	public Spacing(List<Integer> spacingList) {
		//super();
		this.spacingList = spacingList;
	}
	public List<Integer> getSpacingList() {
		return spacingList;
	}		
	public void setSpacingList(List<Integer> spacingList) {
		this.spacingList = spacingList;
	}		
}*/

/**
 * This is a wrapper for the repeated measures information.
 * @author Uttara Sakhadeo
 *
 */
public class RepeatedMeasuresNode 
{
	private String dimension = null;
	private String type = null;
	private Integer numberOfMeasurements = null;
	private Integer depth = null;
	private List<Integer> spacingList = null;
	//private Spacing spacingList = null;
	
	public RepeatedMeasuresNode()
	{
		//spacingList = new Spacing();
	}	
	public RepeatedMeasuresNode(String name) 
	{
		//super();
		this.dimension = name;		
	}		
	public RepeatedMeasuresNode(String name, String type, Integer count,Integer depth) 
	{
		//super();
		this.dimension = name;
		this.type = type;
		this.numberOfMeasurements = count;		
		this.depth = depth;
	}			
	public RepeatedMeasuresNode(String name, String type, Integer count,
			List<Integer> spacingList, Integer depth) 
	{
		//super();
		this.dimension = name;
		this.type = type;
		this.numberOfMeasurements = count;
		this.depth = depth;
		this.setSpacingList(spacingList);
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getNumberOfMeasurements() {
		return numberOfMeasurements;
	}
	public void setNumberOfMeasurements(Integer numberOfMeasurements) {
		this.numberOfMeasurements = numberOfMeasurements;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	public List<Integer> getSpacingList() {
		return spacingList;
	}
	public void setSpacingList(List<Integer> spacingList) {
		this.spacingList = spacingList;
	}
	
	
}