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

import edu.ucdenver.bios.webservice.common.enums.HorizontalAxisLabelEnum;
import edu.ucdenver.bios.webservice.common.enums.StratificationVariableEnum;

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

    /** The sample size. */
    private int sampleSize;

    /** The power curve description. */
    private String powerCurveDescription;

    /** The statistical test. */
    private String statisticalTest;

    /** The regression coeeficient scale factor. */
    private float regressionCoeeficientScaleFactor;

    /** The variability scale factor. */
    private float variabilityScaleFactor;

    /** The type i error. */
    private float typeIError;

    /** The study design. */
    private StudyDesign studyDesign;

    /** The horizontal axis label enum. */
    private HorizontalAxisLabelEnum horizontalAxisLabelEnum;

    /** The stratification var enum. */
    private StratificationVariableEnum stratificationVarEnum;

    /*--------------------
     * Constructors
     *--------------------*/
    /*
     * Create an empty Power Curve Description object
     */
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
    public final void setPowerCurveDescription(
            final String powerCurveDescription) {
        this.powerCurveDescription = powerCurveDescription;
    }

    /**
     * Gets the statistical test.
     *
     * @return the statistical test
     */
    public final String getStatisticalTest() {
        return statisticalTest;
    }

    /**
     * Sets the statistical test.
     *
     * @param statisticalTest
     *            the new statistical test
     */
    public final void setStatisticalTest(final String statisticalTest) {
        this.statisticalTest = statisticalTest;
    }

    /**
     * Gets the regression coeeficient scale factor.
     *
     * @return the regression coeeficient scale factor
     */
    public final float getRegressionCoeeficientScaleFactor() {
        return regressionCoeeficientScaleFactor;
    }

    /**
     * Sets the regression coeeficient scale factor.
     *
     * @param regressionCoeeficientScaleFactor
     *            the new regression coeeficient scale factor
     */
    public final void setRegressionCoeeficientScaleFactor(
            final float regressionCoeeficientScaleFactor) {
        this.regressionCoeeficientScaleFactor =
                regressionCoeeficientScaleFactor;
    }

    /**
     * Gets the variability scale factor.
     *
     * @return the variability scale factor
     */
    public final float getVariabilityScaleFactor() {
        return variabilityScaleFactor;
    }

    /**
     * Sets the variability scale factor.
     *
     * @param variabilityScaleFactor
     *            the new variability scale factor
     */
    public final void setVariabilityScaleFactor(
            final float variabilityScaleFactor) {
        this.variabilityScaleFactor = variabilityScaleFactor;
    }

    /**
     * Gets the type i error.
     *
     * @return the type i error
     */
    public final float getTypeIError() {
        return typeIError;
    }

    /**
     * Sets the type i error.
     *
     * @param typeIError
     *            the new type i error
     */
    public final void setTypeIError(final float typeIError) {
        this.typeIError = typeIError;
    }

    /**
     * Gets the study design.
     *
     * @return the study design
     */
    public final StudyDesign getStudyDesign() {
        return studyDesign;
    }

    /**
     * Sets the study design.
     *
     * @param studyDesign
     *            the new study design
     */
    public final void setStudyDesign(final StudyDesign studyDesign) {
        this.studyDesign = studyDesign;
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
    public final void setStratificationVarEnum(
            final StratificationVariableEnum stratificationVarEnum) {
        this.stratificationVarEnum = stratificationVarEnum;
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
    public final void setHorizontalAxisLabelEnum(
            final HorizontalAxisLabelEnum horizontalAxisLabelEnum) {
        this.horizontalAxisLabelEnum = horizontalAxisLabelEnum;
    }

    /*--------------------
     * toString()
     *--------------------*/
     /**
     * Intended only for debugging.
     *
     * <P>Here, a generic implementation uses reflection to print
     * names and values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     */
    @Override
    public final String toString() {
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
