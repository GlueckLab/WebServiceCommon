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

import edu.ucdenver.bios.webservice.common.enums.HorizontalAxisLabelEnum;
import edu.ucdenver.bios.webservice.common.enums.StratificationVariableEnum;

/**
 * Object describes Power Curve Structure.
 * 
 * @author Uttara Sakhadeo
 */
public class PowerCurveDescription implements Serializable
{	
    private static final long serialVersionUID = 701214126222753261L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/		
	private int id;
	private int sampleSize;
	private String powerCurveDescription;
	private String statisticalTest;
	private float regressionCoeeficientScaleFactor;
	private float variabilityScaleFactor;
	private float typeIError;
	private StudyDesign studyDesign;
	private HorizontalAxisLabelEnum horizontalAxisLabelEnum;
	private StratificationVariableEnum stratificationVarEnum;	
	/*--------------------
	 * Constructors
	 *--------------------*/
	/*
	 * Create an empty Power Curve Description object
	 */
	public PowerCurveDescription()
	{}	
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSampleSize() {
		return sampleSize;
	}
	public void setSampleSize(int sampleSize) {
		this.sampleSize = sampleSize;
	}
	public String getPowerCurveDescription() {
		return powerCurveDescription;
	}
	public void setPowerCurveDescription(String powerCurveDescription) {
		this.powerCurveDescription = powerCurveDescription;
	}
	public String getStatisticalTest() {
		return statisticalTest;
	}
	public void setStatisticalTest(String statisticalTest) {
		this.statisticalTest = statisticalTest;
	}
	public float getRegressionCoeeficientScaleFactor() {
		return regressionCoeeficientScaleFactor;
	}
	public void setRegressionCoeeficientScaleFactor(
			float regressionCoeeficientScaleFactor) {
		this.regressionCoeeficientScaleFactor = regressionCoeeficientScaleFactor;
	}
	public float getVariabilityScaleFactor() {
		return variabilityScaleFactor;
	}
	public void setVariabilityScaleFactor(float variabilityScaleFactor) {
		this.variabilityScaleFactor = variabilityScaleFactor;
	}
	public float getTypeIError() {
		return typeIError;
	}
	public void setTypeIError(float typeIError) {
		this.typeIError = typeIError;
	}
	public StudyDesign getStudyDesign() {
		return studyDesign;
	}
	public void setStudyDesign(StudyDesign studyDesign) {
		this.studyDesign = studyDesign;
	}	
	public StratificationVariableEnum getStratificationVarEnum() {
		return stratificationVarEnum;
	}
	public void setStratificationVarEnum(
			StratificationVariableEnum stratificationVarEnum) {
		this.stratificationVarEnum = stratificationVarEnum;
	}
	public HorizontalAxisLabelEnum getHorizontalAxisLabelEnum() {
		return horizontalAxisLabelEnum;
	}
	public void setHorizontalAxisLabelEnum(
			HorizontalAxisLabelEnum horizontalAxisLabelEnum) {
		this.horizontalAxisLabelEnum = horizontalAxisLabelEnum;
	}	
	/*--------------------
	 * toString()
	 *--------------------*/
	@Override
	public String toString() {
		return "PowerCurveDescription [id=" + id + ", sampleSize=" + sampleSize
				+ ", powerCurveDescription=" + powerCurveDescription
				+ ", statisticalTest=" + statisticalTest
				+ ", regressionCoeeficientScaleFactor="
				+ regressionCoeeficientScaleFactor
				+ ", variabilityScaleFactor=" + variabilityScaleFactor
				+ ", typeIError=" + typeIError + ", studyDesign=" + studyDesign
				+ ", horizontalAxisLabelEnum=" + horizontalAxisLabelEnum
				+ ", stratificationVarEnum=" + stratificationVarEnum + "]";
	}
}
