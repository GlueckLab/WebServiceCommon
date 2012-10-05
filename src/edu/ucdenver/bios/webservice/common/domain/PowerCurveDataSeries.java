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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 */
package edu.ucdenver.bios.webservice.common.domain;

import edu.ucdenver.bios.webservice.common.enums.PowerMethodEnum;
import edu.ucdenver.bios.webservice.common.enums.StatisticalTestTypeEnum;

// TODO: Auto-generated Javadoc
/**
 * Description of an individual data series displayed on
 * a power curve.
 *
 * @author Sarah Kreidler
 */
public class PowerCurveDataSeries {

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The idx. */
    private int idx;
    
    /** label for this data series. */
    private String label = "";
    
    /** indicates if confidence limits should be included on plot. */
    private boolean confidenceLimits = false;
    
    /** The statistical test. */
    private StatisticalTestTypeEnum statisticalTestTypeEnum = null;

    /** The beta scale. */
    private double betaScale = 0;

    /** The sigma scale. */
    private double sigmaScale = 0;

    /** The type i error. */
    private double typeIError = -1;

    /** The sample size. */
    private int sampleSize = -1;
    
    /** The nominal power. */
    private double nominalPower = -1;
    
    /** power method. */
    private PowerMethodEnum powerMethod = null;

    /** The quantile. */
    private double quantile = -1;

    /*--------------------
     * Constructors
     *--------------------*/ 
    /**
     * Instantiates a new power curve data series.
     */
    public PowerCurveDataSeries() {}
       
    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     *
     * @param label the new label
     */
    public void setLabel(String label) {
        this.label = label;
    }
   
    /**
     * Checks if is confidence limits.
     *
     * @return true, if is confidence limits
     */
    public boolean isConfidenceLimits() {
        return confidenceLimits;
    }

    /**
     * Sets the confidence limits.
     *
     * @param confidenceLimits the new confidence limits
     */
    public void setConfidenceLimits(boolean confidenceLimits) {
        this.confidenceLimits = confidenceLimits;
    }

    /**
     * Gets the statistical test type enum.
     *
     * @return the statistical test type enum
     */
    public StatisticalTestTypeEnum getStatisticalTestTypeEnum() {
        return statisticalTestTypeEnum;
    }

    /**
     * Sets the statistical test type enum.
     *
     * @param statisticalTestTypeEnum the new statistical test type enum
     */
    public void setStatisticalTestTypeEnum(
            StatisticalTestTypeEnum statisticalTestTypeEnum) {
        this.statisticalTestTypeEnum = statisticalTestTypeEnum;
    }

    /**
     * Gets the beta scale.
     *
     * @return the beta scale
     */
    public double getBetaScale() {
        return betaScale;
    }

    /**
     * Sets the beta scale.
     *
     * @param betaScale the new beta scale
     */
    public void setBetaScale(double betaScale) {
        this.betaScale = betaScale;
    }

    /**
     * Gets the sigma scale.
     *
     * @return the sigma scale
     */
    public double getSigmaScale() {
        return sigmaScale;
    }

    /**
     * Sets the sigma scale.
     *
     * @param sigmaScale the new sigma scale
     */
    public void setSigmaScale(double sigmaScale) {
        this.sigmaScale = sigmaScale;
    }

    /**
     * Gets the type i error.
     *
     * @return the type i error
     */
    public double getTypeIError() {
        return typeIError;
    }

    /**
     * Sets the type i error.
     *
     * @param typeIError the new type i error
     */
    public void setTypeIError(double typeIError) {
        this.typeIError = typeIError;
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
     * @param sampleSize the new sample size
     */
    public void setSampleSize(int sampleSize) {
        this.sampleSize = sampleSize;
    }
    
    /**
     * Gets the power method.
     *
     * @return the power method
     */
    public PowerMethodEnum getPowerMethod() {
        return powerMethod;
    }

    /**
     * Sets the power method.
     *
     * @param powerMethod the new power method
     */
    public void setPowerMethod(PowerMethodEnum powerMethod) {
        this.powerMethod = powerMethod;
    }

    /**
     * Gets the quantile.
     *
     * @return the quantile
     */
    public double getQuantile() {
        return quantile;
    }

    /**
     * Sets the quantile.
     *
     * @param quantile the new quantile
     */
    public void setQuantile(double quantile) {
        this.quantile = quantile;
    }

    /**
     * Gets the nominal power.
     *
     * @return the nominal power
     */
    public double getNominalPower() {
        return nominalPower;
    }

    /**
     * Sets the nominal power.
     *
     * @param nominalPower the new nominal power
     */
    public void setNominalPower(double nominalPower) {
        this.nominalPower = nominalPower;
    }

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
     * @param id the new id
     */
    public void setIdx(int id) {
        this.idx = id;
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
        return "PowerCurveDataSeries [idx=" + idx + ", label=" + label
                + ", confidenceLimits=" + confidenceLimits
                + ", statisticalTestTypeEnum=" + statisticalTestTypeEnum
                + ", betaScale=" + betaScale + ", sigmaScale=" + sigmaScale
                + ", typeIError=" + typeIError + ", sampleSize=" + sampleSize
                + ", nominalPower=" + nominalPower + ", powerMethod="
                + powerMethod + ", quantile=" + quantile + "]";
    }
    
}
