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
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * This is a wrapper for the Confidence Interval information.
 * @author Uttara Sakhadeo
 *
 */
@Entity
@Table(name="CONFIDENCE_INTERVAL")
public class ConfidenceIntervalDescription implements Serializable 
{
    private static final long serialVersionUID = 3510470585624009610L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/	
	private int id;	
	@OneToOne
	private StudyDesign studyDesign;	
	@Column(name="isBetaFixed")
	private boolean betaFixed;
	@Column(name="isSigmaFixed")
	private boolean sigmaFixed;
	private float lowerTrailProbability;
	private float upperTrailProbability;
	@Column(name="sampleSize")
	private int sampleSize;
	@Column(name="rankOfDesignMatrix")
	private  int rankOfDesignMatrix;	
	/*--------------------
	 * Constructors
	 *--------------------*/	
	public ConfidenceIntervalDescription() {
	}	
	/**
	 * @param studyUUID
	 * @param isBetaFixed
	 * @param isSigmaFixed
	 * @param lowerTailProbability
	 * @param upperTailProbability
	 * @param sampleSize
	 * @param rankOfDesignMatrix
	 */
	public ConfidenceIntervalDescription(boolean isBetaFixed,
			boolean isSigmaFixed, float lowerTailProbability,
			float upperTailProbability, int sampleSize, int rankOfDesignMatrix) {
		this.betaFixed = isBetaFixed;
		this.sigmaFixed = isSigmaFixed;
		this.lowerTrailProbability = lowerTailProbability;
		this.upperTrailProbability = upperTailProbability;
		this.sampleSize = sampleSize;
		this.rankOfDesignMatrix = rankOfDesignMatrix;
	}
	/**
	 * @param id
	 * @param studyUUID
	 * @param isBetaFixed
	 * @param isSigmaFixed
	 * @param lowerTailProbability
	 * @param upperTailProbability
	 * @param sampleSize
	 * @param rankOfDesignMatrix
	 */
	public ConfidenceIntervalDescription(int id, boolean isBetaFixed,
			boolean isSigmaFixed, float lowerTailProbability,
			float upperTailProbability, int sampleSize, int rankOfDesignMatrix) {
		this.id = id;
		this.betaFixed = isBetaFixed;
		this.sigmaFixed = isSigmaFixed;
		this.lowerTrailProbability = lowerTailProbability;
		this.upperTrailProbability = upperTailProbability;
		this.sampleSize = sampleSize;
		this.rankOfDesignMatrix = rankOfDesignMatrix;
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
	public boolean isBetaFixed() {
		return betaFixed;
	}
	public void setBetaFixed(boolean isBetaFixed) {
		this.betaFixed = isBetaFixed;
	}	
	public boolean isSigmaFixed() {
		return sigmaFixed;
	}
	public void setSigmaFixed(boolean isSigmaFixed) {
		this.sigmaFixed = isSigmaFixed;
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
	public StudyDesign getStudyDesign() {
		return studyDesign;
	}
	public void setStudyDesign(StudyDesign studyDesign) {
		this.studyDesign = studyDesign;
	}
	public float getLowerTrailProbability() {
		return lowerTrailProbability;
	}
	public void setLowerTrailProbability(float lowerTrailProbability) {
		this.lowerTrailProbability = lowerTrailProbability;
	}
	public float getUpperTrailProbability() {
		return upperTrailProbability;
	}
	public void setUpperTrailProbability(float upperTrailProbability) {
		this.upperTrailProbability = upperTrailProbability;
	}	
}
