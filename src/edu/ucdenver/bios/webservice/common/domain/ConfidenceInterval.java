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

/**
 * This is a wrapper for the Confidence Interval information.
 * @author Uttara Sakhadeo
 *
 */
public class ConfidenceInterval 
{
	/*--------------------
	 * Member Variables
	 *--------------------*/
	private int id;
	private StudyDesign studyDesign;
	private boolean isBetaFixed;
	private boolean isSigmaFixed;
	private float lowerTailProbability;
	private float upperTailProbability;
	private int sampleSize;
	private  int rankOfDesignMatrix;	
	/*--------------------
	 * Constructors
	 *--------------------*/	
	public ConfidenceInterval() {
	}	
	/**
	 * @param studyDesign
	 * @param isBetaFixed
	 * @param isSigmaFixed
	 * @param lowerTailProbability
	 * @param upperTailProbability
	 * @param sampleSize
	 * @param rankOfDesignMatrix
	 */
	public ConfidenceInterval(StudyDesign studyDesign, boolean isBetaFixed,
			boolean isSigmaFixed, float lowerTailProbability,
			float upperTailProbability, int sampleSize, int rankOfDesignMatrix) {
		this.studyDesign = studyDesign;
		this.isBetaFixed = isBetaFixed;
		this.isSigmaFixed = isSigmaFixed;
		this.lowerTailProbability = lowerTailProbability;
		this.upperTailProbability = upperTailProbability;
		this.sampleSize = sampleSize;
		this.rankOfDesignMatrix = rankOfDesignMatrix;
	}
	/**
	 * @param id
	 * @param studyDesign
	 * @param isBetaFixed
	 * @param isSigmaFixed
	 * @param lowerTailProbability
	 * @param upperTailProbability
	 * @param sampleSize
	 * @param rankOfDesignMatrix
	 */
	public ConfidenceInterval(int id, StudyDesign studyDesign, boolean isBetaFixed,
			boolean isSigmaFixed, float lowerTailProbability,
			float upperTailProbability, int sampleSize, int rankOfDesignMatrix) {
		this.id = id;
		this.studyDesign = studyDesign;
		this.isBetaFixed = isBetaFixed;
		this.isSigmaFixed = isSigmaFixed;
		this.lowerTailProbability = lowerTailProbability;
		this.upperTailProbability = upperTailProbability;
		this.sampleSize = sampleSize;
		this.rankOfDesignMatrix = rankOfDesignMatrix;
	}		
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StudyDesign getstudyDesign() {
		return studyDesign;
	}
	public void setstudyDesign(StudyDesign studyDesign) {
		this.studyDesign = studyDesign;
	}
	public boolean isBetaFixed() {
		return isBetaFixed;
	}
	public void setBetaFixed(boolean isBetaFixed) {
		this.isBetaFixed = isBetaFixed;
	}
	public boolean isSigmaFixed() {
		return isSigmaFixed;
	}
	public void setSigmaFixed(boolean isSigmaFixed) {
		this.isSigmaFixed = isSigmaFixed;
	}
	public float getLowerTailProbability() {
		return lowerTailProbability;
	}
	public void setLowerTailProbability(float lowerTailProbability) {
		this.lowerTailProbability = lowerTailProbability;
	}
	public float getUpperTailProbability() {
		return upperTailProbability;
	}
	public void setUpperTailProbability(float upperTailProbability) {
		this.upperTailProbability = upperTailProbability;
	}
	public int getSampleSize() {
		return sampleSize;
	}
	public void setSampleSize(int sampleSize) {
		this.sampleSize = sampleSize;
	}
	public int getRankOfDesignMatrix() {
		return rankOfDesignMatrix;
	}
	public void setRankOfDesignMatrix(int rankOfDesignMatrix) {
		this.rankOfDesignMatrix = rankOfDesignMatrix;
	}

}
