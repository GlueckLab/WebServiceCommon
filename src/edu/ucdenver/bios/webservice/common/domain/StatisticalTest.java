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

import edu.ucdenver.bios.webservice.common.enums.StatisticalTestType;
/**
 * This is a wrapper for the test list object information.
 * @author Uttara Sakhadeo
 *
 */
public class StatisticalTest implements Serializable 
{
    private static final long serialVersionUID = 9105215653008294947L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/	
	private int id;	
	private StatisticalTestType type;	
	/*--------------------
	 * Constructors
	 *--------------------*/
	public StatisticalTest(){}		
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StatisticalTestType getType() {
		return type;
	}
	public void setType(StatisticalTestType type) {
		this.type = type;
	}	
	/*--------------------
	 * toString()
	 *--------------------*/
	@Override
	public String toString() {
		return "StatisticalTest [id=" + id + ", type=" + type + "]";
	}	
}
