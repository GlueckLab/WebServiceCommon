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
/**
 * This is a wrapper for the clustering information.
 * @author Uttara Sakhadeo
 *
 */
public class ClusterNode 
{		
	/*--------------------
	 * Member Variables
	 *--------------------*/
	private String groupeName = null;	
	private Integer groupeSize = null;	
	private Integer depth = null;
	/*--------------------
	 * Constructors
	 *--------------------*/	
	public ClusterNode() {}	
	/**
	 * @param clusterName
	 */
	public ClusterNode(String groupeName) {
		this.groupeName = groupeName;
	}
	/**
	 * @param clusterName
	 * @param sampleSize
	 */
	public ClusterNode(String groupeName, Integer groupeSize, Integer depth) {
		this.groupeName = groupeName;
		this.groupeSize = groupeSize;
		this.depth = depth;
	}	
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/
	public String getGroupeName() {
		return groupeName;
	}
	public void setGroupeName(String groupeName) {
		this.groupeName = groupeName;
	}
	public Integer getGroupeSize() {
		return groupeSize;
	}
	public void setGroupeSize(Integer groupeSize) {
		this.groupeSize = groupeSize;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}			
}