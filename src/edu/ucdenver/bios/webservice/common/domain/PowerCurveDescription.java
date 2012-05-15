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
import java.util.Arrays;

import edu.ucdenver.bios.webservice.common.enums.HorizontalAxisLabelEnum;
import edu.ucdenver.bios.webservice.common.enums.PowerMethodEnum;
import edu.ucdenver.bios.webservice.common.enums.StatisticalTestTypeEnum;
import edu.ucdenver.bios.webservice.common.enums.StratificationVariableEnum;

// TODO: Auto-generated Javadoc
/**
 * Object describes Power Curve Structure.
 * 
 * @author Uttara Sakhadeo
 */
public class PowerCurveDescription implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 701214126222753261L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** The power curve description. */
    private String powerCurveDescription;

    /** The power method enum. */
    private PowerMethodEnum powerMethodEnum;

    /** The horizontal axis label enum. */
    private HorizontalAxisLabelEnum horizontalAxisLabelEnum;

    /** The stratification var enum. */
    private StratificationVariableEnum stratificationVarEnum;

    /** The statistical test. */
    private StatisticalTestTypeEnum statisticalTestTypeEnum;

    /** The beta scale. */
    private double betaScale;

    /** The sigma scale. */
    private double sigmaScale;

    /** The type i error. */
    private double typeIError;

    /** The sample size. */
    private int sampleSize;

    /** The quantile. */
    private double quantile;

    /*--------------------
     * Constructors
     *--------------------*/   
    /**
     * Instantiates a new power curve description.
     */
    public PowerCurveDescription() {
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the id.
     * 
     * @return the id
     */
    public final int getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public final void setId(final int id) {
        this.id = id;
    }

    /**
     * Gets the power curve description.
     * 
     * @return the power curve description
     */
    public final String getPowerCurveDescription() {
        return powerCurveDescription;
    }

    /**
     * Sets the power curve description.
     * 
     * @param powerCurveDescription
     *            the new power curve description
     */
    public final void setPowerCurveDescription(final String powerCurveDescription) {
        this.powerCurveDescription = powerCurveDescription;
    }

    /**
     * Gets the power method enum.
     * 
     * @return the power method enum
     */
    public final PowerMethodEnum getPowerMethodEnum() {
        return powerMethodEnum;
    }

    /**
     * Sets the power method enum.
     * 
     * @param powerMethodEnum
     *            the new power method enum
     */
    public final void setPowerMethodEnum(final PowerMethodEnum powerMethodEnum) {
        this.powerMethodEnum = powerMethodEnum;
    }

    /**
     * Gets the horizontal axis label enum.
     * 
     * @return the horizontal axis label enum
     */
    public final HorizontalAxisLabelEnum getHorizontalAxisLabelEnum() {
        return horizontalAxisLabelEnum;
    }

    /**
     * Sets the horizontal axis label enum.
     * 
     * @param horizontalAxisLabelEnum
     *            the new horizontal axis label enum
     */
    public final void setHorizontalAxisLabelEnum(final
            HorizontalAxisLabelEnum horizontalAxisLabelEnum) {
        this.horizontalAxisLabelEnum = horizontalAxisLabelEnum;
    }

    /**
     * Gets the stratification var enum.
     * 
     * @return the stratification var enum
     */
    public final StratificationVariableEnum getStratificationVarEnum() {
        return stratificationVarEnum;
    }

    /**
     * Sets the stratification var enum.
     * 
     * @param stratificationVarEnum
     *            the new stratification var enum
     */
    public final void setStratificationVarEnum(final
            StratificationVariableEnum stratificationVarEnum) {
        this.stratificationVarEnum = stratificationVarEnum;
    }

    /**
     * Gets the statistical test type enum.
     * 
     * @return the statistical test type enum
     */
    public final StatisticalTestTypeEnum getStatisticalTestTypeEnum() {
        return statisticalTestTypeEnum;
    }

    /**
     * Sets the statistical test type enum.
     * 
     * @param statisticalTestTypeEnum
     *            the new statistical test type enum
     */
    public final void setStatisticalTestTypeEnum(final
            StatisticalTestTypeEnum statisticalTestTypeEnum) {
        this.statisticalTestTypeEnum = statisticalTestTypeEnum;
    }

    /**
     * Gets the beta scale.
     * 
     * @return the beta scale
     */
    public final double getBetaScale() {
        return betaScale;
    }

    /**
     * Sets the beta scale.
     * 
     * @param betaScale
     *            the new beta scale
     */
    public final void setBetaScale(final double betaScale) {
        this.betaScale = betaScale;
    }

    /**
     * Gets the sigma scale.
     * 
     * @return the sigma scale
     */
    public final double getSigmaScale() {
        return sigmaScale;
    }

    /**
     * Sets the sigma scale.
     * 
     * @param sigmaScale
     *            the new sigma scale
     */
    public final void setSigmaScale(final double sigmaScale) {
        this.sigmaScale = sigmaScale;
    }

    /**
     * Gets the type i error.
     * 
     * @return the type i error
     */
    public final double getTypeIError() {
        return typeIError;
    }

    /**
     * Sets the type i error.
     * 
     * @param typeIError
     *            the new type i error
     */
    public final void setTypeIError(final double typeIError) {
        this.typeIError = typeIError;
    }

    /**
     * Gets the sample size.
     * 
     * @return the sample size
     */
    public final int getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the sample size.
     * 
     * @param sampleSize
     *            the new sample size
     */
    public final void setSampleSize(final int sampleSize) {
        this.sampleSize = sampleSize;
    }

    /**
     * Gets the quantile.
     * 
     * @return the quantile
     */
    public final double getQuantile() {
        return quantile;
    }

    /**
     * Sets the quantile.
     * 
     * @param quantile
     *            the new quantile
     */
    public final void setQuantile(final double quantile) {
        this.quantile = quantile;
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
    public final String toString() {
        return "PowerCurveDescription [id=" + id + ", powerCurveDescription="
                + powerCurveDescription + ", powerMethodEnum="
                + powerMethodEnum + ", horizontalAxisLabelEnum="
                + horizontalAxisLabelEnum + ", stratificationVarEnum="
                + stratificationVarEnum + ", statisticalTestTypeEnum="
                + statisticalTestTypeEnum + ", betaScale=" + betaScale
                + ", sigmaScale=" + sigmaScale + ", typeIError=" + typeIError
                + ", sampleSize=" + sampleSize + ", quantile=" + quantile + "]";
    }

}
