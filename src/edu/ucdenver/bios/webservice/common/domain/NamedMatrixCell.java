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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * This is a wrapper for the Matrix information.
 * This class holds cell data of a NamedMatrix.
 * @author Uttara Sakhadeo
 *
 */
public class NamedMatrixCell implements Serializable 
{
	/*--------------------
	 * Member Variables
	 *--------------------*/
	 private int id;
	 @Column(name="row")
	 private int row;
	 @Column(name="column")
	 private int column;
	 @Column(name="data")
	 private double value;
	 @ManyToOne
	 private NamedMatrix namedMatrix = null;	
	/*--------------------
	 * Constructors
	 *--------------------*/	 
	public NamedMatrixCell() {super();}
	/**
	 * @param row
	 * @param column
	 * @param value
	 */
	public NamedMatrixCell(int row, int column, double value) {
		super();
		this.row = row;
		this.column = column;
		this.value = value;
	}
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/	
	public int getRow() {
		return row;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public NamedMatrix getNamedMatrix() {
		return namedMatrix;
	}
	public void setNamedMatrix(NamedMatrix namedMatrix) {
		this.namedMatrix = namedMatrix;
	}	
}
