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
import java.util.Arrays;

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
    /** The idx. */
    private int idx;

    /** The beta fixed. */
    private boolean betaFixed = false;

    /** The sigma fixed. */
    private boolean sigmaFixed = false;

    /** The lower tail probability. */
    private double lowerTailProbability = -1;

    /** The upper tail probability. */
    private double upperTailProbability = -1;

    /** The sample size. */
    private int sampleSize = -1;

    /** The rank of design matrix. */
    private int rankOfDesignMatrix = -1;
        
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
            boolean isSigmaFixed, double lowerTailProbability,
            double upperTailProbability, int sampleSize, int rankOfDesignMatrix) {
        this.betaFixed = isBetaFixed;
        this.sigmaFixed = isSigmaFixed;
        this.lowerTailProbability = lowerTailProbability;
        this.upperTailProbability = upperTailProbability;
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
            boolean isSigmaFixed, double lowerTailProbability,
            double upperTailProbability, int sampleSize, int rankOfDesignMatrix) {
        this.idx = id;
        this.betaFixed = isBetaFixed;
        this.sigmaFixed = isSigmaFixed;
        this.lowerTailProbability = lowerTailProbability;
        this.upperTailProbability = upperTailProbability;
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
    public int getIdx() {
        return idx;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setIdx(int id) {
        this.idx = id;
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
     * Gets the lower Tail probability.
     * 
     * @return the lower Tail probability
     */
    public double getLowerTailProbability() {
        return lowerTailProbability;
    }

    /**
     * Sets the lower Tail probability.
     * 
     * @param lowerTailProbability
     *            the new lower Tail probability
     */
    public void setLowerTailProbability(double lowerTailProbability) {
        this.lowerTailProbability = lowerTailProbability;
    }

    /**
     * Gets the upper Tail probability.
     * 
     * @return the upper Tail probability
     */
    public double getUpperTailProbability() {
        return upperTailProbability;
    }

    /**
     * Sets the upper Tail probability.
     * 
     * @param upperTailProbability
     *            the new upper Tail probability
     */
    public void setUpperTailProbability(double upperTailProbability) {
        this.upperTailProbability = upperTailProbability;
    }    
    /*--------------------
     * toString()
     *--------------------*/
    /**
     * Intended only for debugging.
     * 
     * <P>
     * Here, a generic implementation uses reflection to print names and values
     * of all fields <em>declared in this class</em>. Note that superclass
     * fields are left out of this implementation.
     * 
     * @return the string
     */

    @Override
    public String toString() {
        return "ConfidenceIntervalDescription [idx=" + idx + ", betaFixed="
                + betaFixed + ", sigmaFixed=" + sigmaFixed
                + ", lowerTailProbability=" + lowerTailProbability
                + ", upperTailProbability=" + upperTailProbability
                + ", sampleSize=" + sampleSize + ", rankOfDesignMatrix="
                + rankOfDesignMatrix + "]";
    }    
    
    /**
     * Returns true if this confidence interval description is fully specified.
     * @return true if complete, false otherwise
     */
    public boolean isComplete() {
        return (
                (betaFixed == true || sigmaFixed == true) &&
                lowerTailProbability >= 0 &&
                upperTailProbability >= 0 &&
                sampleSize > 1 &&
                rankOfDesignMatrix > 0
                );
    }
}
