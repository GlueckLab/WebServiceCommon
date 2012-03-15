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
import java.sql.Blob;
import java.util.Arrays;

/**
 * This is a wrapper for the Covariance information.
 * @author Uttara Sakhadeo
 *
 */
public class Covariance implements Serializable 
{	
	private static final long serialVersionUID = 1L;
	/*--------------------
	 * Member Variables
	 *--------------------*/	
	private int id;		
	private String name;
	private double sd;
	private double roh;
	private double delta;
	private int rows;
	private int columns;			
	private Blob2DArray blob;
	/*--------------------
	 * Constructors
	 *--------------------*/
	public Covariance(){}		
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSd() {
		return sd;
	}
	public void setSd(double sd) {
		this.sd = sd;
	}
	public double getRoh() {
		return roh;
	}
	public void setRoh(double roh) {
		this.roh = roh;
	}
	public double getDelta() {
		return delta;
	}
	public void setDelta(double delta) {
		this.delta = delta;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}	
	public void setName(String name) {
		this.name = name;
	}		
	public String getName() {
		return name;
	}
	public Blob2DArray getBlob() {
		return blob;
	}
	public void setBlob(Blob2DArray blob) {
		this.blob = blob;
	}
	/*--------------------
	 * toString()
	 *--------------------*/
	@Override
	public String toString() {
		return "Covariance [id=" + id + ", name=" + name + ", sd=" + sd
				+ ", roh=" + roh + ", delta=" + delta + ", rows=" + rows
				+ ", columns=" + columns + ", blob=" + blob + "]";
	}	
}
