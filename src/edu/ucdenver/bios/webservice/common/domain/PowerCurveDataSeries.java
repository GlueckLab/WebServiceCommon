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

/**
 * Description of an individual data series displayed on 
 * a power curve
 * @author Sarah Kreidler
 *
 */
public class PowerCurveDataSeries {

    /**  label for this data series */
    private String label = "";
    
    /** indicates if confidence limits should be included on plot */
    private boolean confidenceLimits = false;
    
    /** The statistical test. */
    private StatisticalTestTypeEnum statisticalTestTypeEnum = null;

    /** The beta scale. */
    private double betaScale = Double.NaN;

    /** The sigma scale. */
    private double sigmaScale = Double.NaN;

    /** The type i error. */
    private double typeIError = Double.NaN;

    /** The sample size. */
    private int sampleSize = -1;
    
    /** power method */
    private PowerMethodEnum powerMethod = null;

    /** The quantile. */
    private double quantile = Double.NaN;

    public PowerCurveDataSeries() {}
       
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
   
    public boolean isConfidenceLimits() {
        return confidenceLimits;
    }

    public void setConfidenceLimits(boolean confidenceLimits) {
        this.confidenceLimits = confidenceLimits;
    }

    public StatisticalTestTypeEnum getStatisticalTestTypeEnum() {
        return statisticalTestTypeEnum;
    }

    public void setStatisticalTestTypeEnum(
            StatisticalTestTypeEnum statisticalTestTypeEnum) {
        this.statisticalTestTypeEnum = statisticalTestTypeEnum;
    }

    public double getBetaScale() {
        return betaScale;
    }

    public void setBetaScale(double betaScale) {
        this.betaScale = betaScale;
    }

    public double getSigmaScale() {
        return sigmaScale;
    }

    public void setSigmaScale(double sigmaScale) {
        this.sigmaScale = sigmaScale;
    }

    public double getTypeIError() {
        return typeIError;
    }

    public void setTypeIError(double typeIError) {
        this.typeIError = typeIError;
    }

    public int getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(int sampleSize) {
        this.sampleSize = sampleSize;
    }
    
    public PowerMethodEnum getPowerMethod() {
        return powerMethod;
    }

    public void setPowerMethod(PowerMethodEnum powerMethod) {
        this.powerMethod = powerMethod;
    }

    public double getQuantile() {
        return quantile;
    }

    public void setQuantile(double quantile) {
        this.quantile = quantile;
    }
    
    
}
