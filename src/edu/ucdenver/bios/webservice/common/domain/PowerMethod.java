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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.ucdenver.bios.webservice.common.enums.PowerMethodEnum;

/**
 * This is a wrapper for the power method object information.
 * @author Uttara Sakhadeo
 *
 */
@Entity
@Table(name="POWER_METHOD_LIST")
public class PowerMethod 
{
	/*--------------------
	 * Member Variables
	 *--------------------*/	
	private int id;	
	@OneToMany
	private StudyDesign studyDesign;
	@Column(name="method")
	private PowerMethodEnum powerMethodEnum;	
	/*--------------------
	 * Constructors
	 *--------------------*/
	public PowerMethod(){}
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
	public PowerMethodEnum getPowerMethodEnum() {
		return powerMethodEnum;
	}
	public void setPowerMethodEnum(PowerMethodEnum powerMethodEnum) {
		this.powerMethodEnum = powerMethodEnum;
	}	
}