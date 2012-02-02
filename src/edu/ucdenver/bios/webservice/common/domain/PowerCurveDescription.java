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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Object describes Power Curve Structure.
 * 
 * @author Uttara Sakhadeo
 */
@Entity
@Table(name="tablePowerCurveDescription")
public class PowerCurveDescription 
{
	/*--------------------
	 * Member Variables
	 *--------------------*/
	public enum HorizontalAxisLabel
	{
		VARIABILITY_SCALE_FACTOR,
		TOTAL_SAMPLE_SEIZE,
		REGRESSION_COEEFICIENT_SCALE_FACTOR		
	};
	public enum StratificationVariable
	{
		TYPE_I_ERROR,
		STATISTICAL_TEST
	};
	@Id
	private int id;
	@Column(name="sampleSize")
	private int sampleSize;
	@Column(name="powerCurveDescription")
	private String powerCurveDescription;
	@Column(name="statisticalTest")
	private String statisticalTest;
	@Column(name="regressionCoeeficientScaleFactor")
	private float regressionCoeeficientScaleFactor;
	@Column(name="variabilityScaleFactor")
	private float variabilityScaleFactor;
	@Column(name="typeIError")
	private float typeIError;
	@Column(name="uuid")
	private StudyDesign studyDesign;
	@Column(name="horizontalAxisLabel")
	private HorizontalAxisLabel hAxisLabel;
	@Column(name="stratificationVariable")
	private StratificationVariable stratificationVar;
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
	public HorizontalAxisLabel gethAxisLabel() {
		return hAxisLabel;
	}
	public void sethAxisLabel(HorizontalAxisLabel hAxisLabel) {
		this.hAxisLabel = hAxisLabel;
	}
	public StratificationVariable getStratificationVar() {
		return stratificationVar;
	}
	public void setStratificationVar(StratificationVariable stratificationVar) {
		this.stratificationVar = stratificationVar;
	}

	
}
