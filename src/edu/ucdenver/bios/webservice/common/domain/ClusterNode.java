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

import javax.persistence.Column;
import javax.persistence.ManyToOne;

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
	@Column(name="id")
	private Integer id = null;
	@ManyToOne
	private StudyDesign studyDesign = null;
	/*@Column(name="position")
	private Integer position = null;*/
	@Column(name="name")
	private String groupeName = null;
	@Column(name="size")
	private Integer groupeSize = null;
	@Column(name="icc")
	private Double intraClusterCorrelation = null;
	@Column(name="node")
	private int node;
	@Column(name="parent")
	private int parent;
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
	public ClusterNode(String groupeName, Integer groupeSize, int node, int parent) {
		this.groupeName = groupeName;
		this.groupeSize = groupeSize;
		this.node = node;
		this.parent = parent;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public StudyDesign getStudyDesign() {
		return studyDesign;
	}
	public void setStudyDesign(StudyDesign studyDesign) {
		this.studyDesign = studyDesign;
	}
	public int getNode() {
		return node;
	}
	public void setNode(int node) {
		this.node = node;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}		
}