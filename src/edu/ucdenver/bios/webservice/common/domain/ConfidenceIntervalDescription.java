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

/**
 * This is a wrapper for the Confidence Interval information.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class ConfidenceIntervalDescription implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3510470585624009610L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** The beta fixed. */
    private boolean betaFixed;

    /** The sigma fixed. */
    private boolean sigmaFixed;

    /** The lower trail probability. */
    private float lowerTrailProbability;

    /** The upper trail probability. */
    private float upperTrailProbability;

    /** The sample size. */
    private int sampleSize;

    /** The rank of design matrix. */
    private int rankOfDesignMatrix;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new confidence interval description.
     */
    public ConfidenceIntervalDescription() {
    }

    /**
     * Instantiates a new confidence interval description.
     * 
     * @param isBetaFixed
     *            the is beta fixed
     * @param isSigmaFixed
     *            the is sigma fixed
     * @param lowerTailProbability
     *            the lower tail probability
     * @param upperTailProbability
     *            the upper tail probability
     * @param sampleSize
     *            the sample size
     * @param rankOfDesignMatrix
     *            the rank of design matrix
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
     * Instantiates a new confidence interval description.
     * 
     * @param id
     *            the id
     * @param isBetaFixed
     *            the is beta fixed
     * @param isSigmaFixed
     *            the is sigma fixed
     * @param lowerTailProbability
     *            the lower tail probability
     * @param upperTailProbability
     *            the upper tail probability
     * @param sampleSize
     *            the sample size
     * @param rankOfDesignMatrix
     *            the rank of design matrix
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
    /**
     * Gets the id.
     * 
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Checks if is beta fixed.
     * 
     * @return true, if is beta fixed
     */
    public boolean isBetaFixed() {
        return betaFixed;
    }

    /**
     * Sets the beta fixed.
     * 
     * @param isBetaFixed
     *            the new beta fixed
     */
    public void setBetaFixed(boolean isBetaFixed) {
        this.betaFixed = isBetaFixed;
    }

    /**
     * Checks if is sigma fixed.
     * 
     * @return true, if is sigma fixed
     */
    public boolean isSigmaFixed() {
        return sigmaFixed;
    }

    /**
     * Sets the sigma fixed.
     * 
     * @param isSigmaFixed
     *            the new sigma fixed
     */
    public void setSigmaFixed(boolean isSigmaFixed) {
        this.sigmaFixed = isSigmaFixed;
    }

    /**
     * Gets the sample size.
     * 
     * @return the sample size
     */
    public int getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the sample size.
     * 
     * @param sampleSize
     *            the new sample size
     */
    public void setSampleSize(int sampleSize) {
        this.sampleSize = sampleSize;
    }

    /**
     * Gets the rank of design matrix.
     * 
     * @return the rank of design matrix
     */
    public int getRankOfDesignMatrix() {
        return rankOfDesignMatrix;
    }

    /**
     * Sets the rank of design matrix.
     * 
     * @param rankOfDesignMatrix
     *            the new rank of design matrix
     */
    public void setRankOfDesignMatrix(int rankOfDesignMatrix) {
        this.rankOfDesignMatrix = rankOfDesignMatrix;
    }

    /*
     * public StudyDesign getStudyDesign() { return studyDesign; } public void
     * setStudyDesign(StudyDesign studyDesign) { this.studyDesign = studyDesign;
     * }
     */
    /**
     * Gets the lower trail probability.
     * 
     * @return the lower trail probability
     */
    public float getLowerTrailProbability() {
        return lowerTrailProbability;
    }

    /**
     * Sets the lower trail probability.
     * 
     * @param lowerTrailProbability
     *            the new lower trail probability
     */
    public void setLowerTrailProbability(float lowerTrailProbability) {
        this.lowerTrailProbability = lowerTrailProbability;
    }

    /**
     * Gets the upper trail probability.
     * 
     * @return the upper trail probability
     */
    public float getUpperTrailProbability() {
        return upperTrailProbability;
    }

    /**
     * Sets the upper trail probability.
     * 
     * @param upperTrailProbability
     *            the new upper trail probability
     */
    public void setUpperTrailProbability(float upperTrailProbability) {
        this.upperTrailProbability = upperTrailProbability;
    }

    /*--------------------
     * toString()
     *--------------------*/
    
    @Override
    public String toString() {
        return "ConfidenceIntervalDescription [id=" + id + ", betaFixed="
                + betaFixed + ", sigmaFixed=" + sigmaFixed
                + ", lowerTrailProbability=" + lowerTrailProbability
                + ", upperTrailProbability=" + upperTrailProbability
                + ", sampleSize=" + sampleSize + ", rankOfDesignMatrix="
                + rankOfDesignMatrix + "]";
    }

}
