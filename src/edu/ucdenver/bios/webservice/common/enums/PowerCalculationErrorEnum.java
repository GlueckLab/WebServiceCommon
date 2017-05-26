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
package edu.ucdenver.bios.webservice.common.enums;

public enum PowerCalculationErrorEnum {
    // all possible errors from the
    SAMPLE_SIZE_UNDEFINED("SAMPLE_SIZE_UNDEFINED"),
    MAX_SAMPLE_SIZE_EXCEEDED("MAX_SAMPLE_SIZE_EXCEEDED"),
    BETA_SCALE_UNDEFINED("BETA_SCALE_UNDEFINED"),
    MAX_BETA_SCALE_EXCEEDED("MAX_BETA_SCALE_EXCEEDED"),
    POWER_CI_UNKNOWN_TYPE("POWER_CI_UNKNOWN_TYPE"),
    POWER_CI_MULTIVARIATE_BETA_SIGMA_ESTIMATED("POWER_CI_MULTIVARIATE_BETA_SIGMA_ESTIMATED"),
    POWER_METHOD_UNKNOWN("POWER_METHOD_UNKNOWN"),
    MISSING_MATRIX_DESIGN("MISSING_MATRIX_DESIGN"),
    MISSING_MATRIX_BETA("MISSING_MATRIX_BETA"),
    MISSING_MATRIX_BETA_RANDOM("MISSING_MATRIX_BETA_RANDOM"),
    MISSING_MATRIX_C("MISSING_MATRIX_C"),
    MISSING_MATRIX_C_RANDOM("MISSING_MATRIX_C_RANDOM"),
    MISSING_MATRIX_U("MISSING_MATRIX_U"),
    MISSING_MATRIX_THETA_NULL("MISSING_MATRIX_THETA_NULL"),
    MISSING_MATRIX_SIGMA_E("MISSING_MATRIX_SIGMA_E"),
    MISSING_MATRIX_SIGMA_G("MISSING_MATRIX_SIGMA_G"),
    MISSING_MATRIX_SIGMA_YG("MISSING_MATRIX_SIGMA_YG"),
    MISSING_MATRIX_SIGMA_Y("MISSING_MATRIX_SIGMA_Y"),
    MATRIX_NONSQUARE_SIGMA_E("MATRIX_NONSQUARE_SIGMA_E"),
    MATRIX_NONSQUARE_SIGMA_Y("MATRIX_NONSQUARE_SIGMA_Y"),
    MATRIX_NONSQUARE_SIGMA_G("MATRIX_NONSQUARE_SIGMA_G"),
    MATRIX_CONFORMANCE_C_BETA("MATRIX_CONFORMANCE_C_BETA"),
    MATRIX_CONFORMANCE_BETA_U("MATRIX_CONFORMANCE_BETA_U"),
    MATRIX_CONFORMANCE_X_BETA("MATRIX_CONFORMANCE_X_BETA"),
    MATRIX_CONFORMANCE_C_THETA_NULL("MATRIX_CONFORMANCE_C_THETA_NULL"),
    MATRIX_CONFORMANCE_U_THETA_NULL("MATRIX_CONFORMANCE_U_THETA_NULL"),
    MATRIX_CONFORMANCE_U_SIGMA_E("MATRIX_CONFORMANCE_U_SIGMA_E"),
    MATRIX_CONFORMANCE_U_SIGMA_Y("MATRIX_CONFORMANCE_U_SIGMA_Y"),
    MATRIX_CONFORMANCE_SIGMA_G_SIGMA_YG("MATRIX_CONFORMANCE_SIGMA_G_SIGMA_YG"),
    MATRIX_DIMENSION_C_TOO_MANY_ROWS("MATRIX_DIMENSION_C_TOO_MANY_ROWS"),
    MATRIX_DIMENSION_U_TOO_MANY_COLUMNS("MATRIX_DIMENSION_U_TOO_MANY_COLUMNS"),
    MATRIX_RANK_DESIGN_LTFR("MATRIX_RANK_DESIGN_LTFR"),
    UNKNOWN_TEST_REQUESTED("UNKNOWN_TEST_REQUESTED"),
    UNKNOWN_TEST_REQUESTED_RANDOM("UNKNOWN_TEST_REQUESTED_RANDOM"),
    INVALID_DISTRIBUTION_NONCENTRALITY_PARAMETER("INVALID_DISTRIBUTION_NONCENTRALITY_PARAMETER"),
    INVALID_DISTRIBUTION_NONCENTRAL_F("INVALID_DISTRIBUTION_NONCENTRAL_F"),
    DISTRIBUTION_NONCENTRALITY_PARAMETER_CDF_FAILED("DISTRIBUTION_NONCENTRALITY_PARAMETER_CDF_FAILED"),
    MAX_RANDOM_PREDICTORS_EXCEEDED("MAX_RANDOM_PREDICTORS_EXCEEDED"),
    INTEGRATION_OVER_DISTRIBUTION_NONCENTRALITY_PARAMETER_FAILED("INTEGRATION_OVER_DISTRIBUTION_NONCENTRALITY_PARAMETER_FAILED"),
    GLMMTEST_CONSTRUCTION_FAILED("GLMMTEST_CONSTRUCTION_FAILED");

    /** The idx. */
    private final String idx;

    /**
     * Instantiates a new power calculation error enum.
     *
     * @param idx
     *            the idx
     */
    PowerCalculationErrorEnum(final String idx) {
        this.idx = idx;
    }

    /**
     * Gets the idx.
     *
     * @return the idx
     */
    public String getId() {
        return idx;
    }

    /**
     * Parses the idx.
     *
     * @param idx
     *            the idx
     * @return the power calculation error enum
     */
    public static PowerCalculationErrorEnum parseId(final String idx) {
        PowerCalculationErrorEnum powerCalculationErrorEnum = null;
        for (PowerCalculationErrorEnum b : PowerCalculationErrorEnum.values()) {
            if (idx.equalsIgnoreCase(b.idx)) {
                powerCalculationErrorEnum = b;
            }
        }
        return powerCalculationErrorEnum;
    }



}
