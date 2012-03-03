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

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * This is a wrapper for the Matrix information.
 * @author Uttara Sakhadeo
 *
 */
public class NamedMatrix implements Serializable
{
    private static final long serialVersionUID = 7392545585998026017L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/
	private int id;
	@Column(name="name")
    private String name=null;   
	@ManyToMany
    private List<NamedMatrixCell> matrixCellList=null;
    @ManyToOne
    private StudyDesign studyDesign = null;

    /*--------------------
	 * Constructors
	 *--------------------*/
    public NamedMatrix(){}
    public NamedMatrix(String name)
    {
        this.name = name;                
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
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }		
	public List<NamedMatrixCell> getMatrixCellList() {
		return matrixCellList;
	}
	public void setMatrixCellList(List<NamedMatrixCell> matrixCellList) {
		this.matrixCellList = matrixCellList;
	}
	public StudyDesign getStudyDesign() {
		return studyDesign;
	}
	public void setStudyDesign(StudyDesign studyDesign) {
		this.studyDesign = studyDesign;
	}
}
