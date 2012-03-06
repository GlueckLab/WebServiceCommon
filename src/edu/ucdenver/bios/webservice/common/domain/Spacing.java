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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * This is a wrapper for the Spacing information
 * required for RepeatedMeasuresNode.
 * @author Uttara Sakhadeo
 *
 */
@Entity
@Table(name="REPEATED_MEASURES_SPACING")
public class Spacing implements Serializable 
{
    private static final long serialVersionUID = 5598549066957591425L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/	
	private int id;	
	@ManyToOne
	@Column(name="idRepeatedMeasures")
	private RepeatedMeasuresNode repeatedMeasuresNode;
	@Column(name="data")
	private int value;
	/*--------------------
	 * Constructors
	 *--------------------*/
	public Spacing(){}	
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
	public RepeatedMeasuresNode getRepeatedMeasuresNode() {
		return repeatedMeasuresNode;
	}
	public void setRepeatedMeasuresNode(RepeatedMeasuresNode repeatedMeasuresNode) {
		this.repeatedMeasuresNode = repeatedMeasuresNode;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}