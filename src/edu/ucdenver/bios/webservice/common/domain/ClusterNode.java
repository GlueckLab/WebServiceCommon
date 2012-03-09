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
 * This is a wrapper for the clustering information.
 * @author Uttara Sakhadeo
 *
 */
public class ClusterNode implements Serializable 
{		
    private static final long serialVersionUID = -8859192442862759392L;
    /*--------------------
	 * Member Variables
	 *--------------------*/
	private int id;	
	private String groupName = null;
	private Integer groupSize = null;
	private Double intraClusterCorrelation = null;
	private Integer node;
	private Integer parent;
	/*--------------------
	 * Constructors
	 *--------------------*/	
	public ClusterNode() {}	
	/**
	 * @param clusterName
	 */
	public ClusterNode(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @param clusterName
	 * @param sampleSize
	 */
	public ClusterNode(String groupName, Integer groupSize, Integer node, Integer parent) {
		this.groupName = groupName;
		this.groupSize = groupSize;
		this.node = node;
		this.parent = parent;
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
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Integer getGroupSize() {
		return groupSize;
	}
	public void setGroupSize(Integer groupSize) {
		this.groupSize = groupSize;
	}
	public Double getIntraClusterCorrelation() {
		return intraClusterCorrelation;
	}
	public void setIntraClusterCorrelation(Double intraClusterCorrelation) {
		this.intraClusterCorrelation = intraClusterCorrelation;
	}
	public Integer getNode() {
		return node;
	}
	public void setNode(Integer node) {
		this.node = node;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	/*--------------------
	 * toString()
	 *--------------------*/
	@Override
	public String toString() {
		return "ClusterNode [id=" + id + ", groupName=" + groupName
				+ ", groupSize=" + groupSize + ", intraClusterCorrelation="
				+ intraClusterCorrelation + ", node=" + node + ", parent="
				+ parent + "]";
	}	
}