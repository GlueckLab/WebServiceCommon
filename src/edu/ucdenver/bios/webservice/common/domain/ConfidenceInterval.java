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

import java.io.Serializable;

/**
 * POJO describing a confidence interval.
 *
 * @author Sarah Kreidler
 *
 */
public class ConfidenceInterval implements Serializable {
    /**
     * Serializable UID.
     */
    private static final long serialVersionUID = 5023627485583542502L;
    /** lower tail probability. */
    private double alphaLower;
    /** upper tail probability. */
    private double alphaUpper;
    /** lower limit of the conifidence interval. */
    private double lowerLimit;
    /** upper limit of the confidence interval. */
    private double upperLimit;

    /**
     * Create a confidence interval object.
     *
     * @param lowerLimit lower limit of confidence interval
     * @param upperLimit upper limit of confidence interval
     * @param alphaLower lower tail probability
     * @param alphaUpper upper tail probability
     * @throws IllegalArgumentException on invalid bounds or
     * tail probabilities
     */
    public ConfidenceInterval(double lowerLimit, double upperLimit,
            double alphaLower, double alphaUpper)
    throws IllegalArgumentException {
        if (lowerLimit > upperLimit) {
            throw new IllegalArgumentException("invalid bounds for confidence interval");
        }
        if (alphaLower < 0 || alphaLower > 1
                || alphaUpper < 0 || alphaUpper > 1
                || alphaUpper + alphaLower > 1) {
            throw new IllegalArgumentException("invalid alpha values for confidence interval");
        }

        this.alphaLower = alphaLower;
        this.alphaUpper = alphaUpper;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    /**
     * Create an empty confidence interval object.
     */
    public ConfidenceInterval() {}

    /**
     * Get the lower tail probability.
     * @return lower tail probability
     */
    public double getAlphaLower() {
        return alphaLower;
    }

    /**
     * Set the lower tail probability.
     * @param alphaLower lower tail probability
     */
    public void setAlphaLower(double alphaLower) {
        this.alphaLower = alphaLower;
    }

    /**
     * Get the upper tail probability.
     * @return lower tail probability
     */
    public double getAlphaUpper() {
        return alphaUpper;
    }

    /**
     * Set the upper tail probability.
     * @param alphaUpper upper tail probability
     */
    public void setAlphaUpper(double alphaUpper) {
        this.alphaUpper = alphaUpper;
    }

    /**
     * Get the lower limit of the confidence interval
     * @return lower limit of confidence interval
     */
    public double getLowerLimit()
    {
        return lowerLimit;
    }

    /**
     * Set the lower limit of the confidence interval
     * @param lowerLimit lower limit of the confidence interval
     */
    public void setLowerLimit(double lowerLimit)
    {
        this.lowerLimit = lowerLimit;
    }

    /**
     * Get the upper limit of the confidence interval
     * @return upper limit of confidence interval
     */
    public double getUpperLimit()
    {
        return upperLimit;
    }

    /**
     * Set the upper limit of the confidence interval
     * @param upperLimit upper limit of the confidence interval
     */
    public void setUpperLimit(double upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * Get the coverage probability of the confidence interval
     * @return coverage probability
     */
    public double getConfidenceCoefficient() {
        return 1 - alphaUpper - alphaLower;
    }

}
