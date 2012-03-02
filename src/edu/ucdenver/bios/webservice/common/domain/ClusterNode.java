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

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * This is a wrapper for the clustering information.
 * @author Uttara Sakhadeo
 *
 */
public class ClusterNode implements Serializable 
{		
	/*--------------------
	 * Member Variables
	 *--------------------*/
	private int id;
	@ManyToOne
	private StudyDesign studyDesign = null;
	/*@Column(name="position")
	private Integer position = null;*/
	@Column(name="group")
	private String groupName = null;
	@Column(name="size")
	private Integer groupSize = null;
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
	public ClusterNode(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @param clusterName
	 * @param sampleSize
	 */
	public ClusterNode(String groupName, Integer groupSize, int node, int parent) {
		this.groupName = groupName;
		this.groupSize = groupSize;
		this.node = node;
		this.parent = parent;
	}	
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
}