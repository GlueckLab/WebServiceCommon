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
 * Pojo containing a description of the general linear model power result
 * 
 * @author Sarah Kreidler
 */
public class PowerResult implements Serializable
{
    private static final long serialVersionUID = -6289570391909037726L;
    // error/warning message associated with this result
    // TODO: private String errMsg = null; 
    // nominal power value - if solving for sample size, this is the target power
    // desired.  Otherwise, equals the actual power
    private NominalPower nominalPower;
    // calculated power
    private double actualPower; 
    // total sample size for all groups
    private int totalSampleSize;
    // Type I error rate
    private TypeIError alpha;
    // scale factor for beta matrix
    private BetaScale betaScale;
	// scale factor for the sigma error matrix
    private SigmaScale sigmaScale;
	// statistical test performed
    private StatisticalTest test;
	// power method used
    private PowerMethod powerMethod;
	// quantile if using quantile power, null otherwise
    private Quantile quantile;
	// confidence limits for power if requested
	// only available if solving for power in a random design
	ConfidenceInterval confidenceInterval = null;
	
	   /**
     * Create an empty Power result object.
     */
    public PowerResult() {}
	
	/**
	 * Create a new Power result object.
	 * 
	 * @param test the statistical test performed
	 * @param alpha the type I error rate
	 * @param nominalPower requested power (for sample size, detectable difference requests)
	 * @param actualPower calculated power
	 * @param sampleSize total sample size
	 * @param betaScale scale factor for beta matrix (roughly interpreted as detectable difference)
	 * @param sigmaScale scale factor for error covariance matrix
	 * @param method method used for power calculation
	 */
	public PowerResult(StatisticalTest test, TypeIError alpha, 
            NominalPower nominalPower, double actualPower, int sampleSize,
            BetaScale betaScale, SigmaScale sigmaScale, 
            PowerMethod method)
	{
		this(test, alpha, nominalPower,actualPower,sampleSize,
				betaScale, sigmaScale, method, null, null);
	}
	
	/**
	 * Create a new GLMMPower object.
	 * 
	 * @param test the statistical test performed
	 * @param alpha the type I error rate
	 * @param nominalPower requested power (for sample size, detectable difference requests)
	 * @param actualPower calculated power
	 * @param sampleSize total sample size
	 * @param betaScale scale factor for beta matrix (roughly interpreted as detectable difference)
	 * @param sigmaScale scale factor for error covariance matrix
	 * @param method method used for power calculation
	 * @param confidenceInterval confidence interval if requested
	 */
	public PowerResult(StatisticalTest test, TypeIError alpha, 
            NominalPower nominalPower, double actualPower, int sampleSize,
            BetaScale betaScale, SigmaScale sigmaScale, 
            PowerMethod method,
            ConfidenceInterval confidenceInterval)
	{
		this(test, alpha, nominalPower,actualPower,sampleSize,
				betaScale, sigmaScale, method, null, confidenceInterval);
	}
	
	/**
	 * Create a new GLMMPower object.
	 * 
	 * @param test the statistical test performed
	 * @param alpha the type I error rate
	 * @param nominalPower requested power (for sample size, detectable difference requests)
	 * @param actualPower calculated power
	 * @param sampleSize total sample size
	 * @param betaScale scale factor for beta matrix (roughly interpreted as detectable difference)
	 * @param sigmaScale scale factor for error covariance matrix
	 * @param method method used for power calculation
	 * @param quantile optional quantile value (for quantile power only)
	 */
	public PowerResult(StatisticalTest test, TypeIError alpha, 
            NominalPower nominalPower, double actualPower, int sampleSize,
            BetaScale betaScale, SigmaScale sigmaScale, 
            PowerMethod method,
            Quantile quantile)
	{
		this(test, alpha, nominalPower,actualPower,sampleSize,
				betaScale, sigmaScale, method, quantile, null);
	}
	
	/**
	 * Create a new GLMMPower object.
	 * 
	 * @param test the statistical test performed
	 * @param alpha the type I error rate
	 * @param nominalPower requested power (for sample size, detectable difference requests)
	 * @param actualPower calculated power
	 * @param sampleSize total sample size
	 * @param betaScale scale factor for beta matrix (roughly interpreted as detectable difference)
	 * @param sigmaScale scale factor for error covariance matrix
	 * @param method method used for power calculation
	 * @param quantile optional quantile value (for quantile power only)
	 * @param confidenceInterval confidence interval if requested
	 */
	public PowerResult(StatisticalTest test, TypeIError alpha, 
			NominalPower nominalPower, double actualPower, int sampleSize,
			BetaScale betaScale, SigmaScale sigmaScale, 
			PowerMethod method,
			Quantile quantile, ConfidenceInterval confidenceInterval)
	{
		this.nominalPower = nominalPower;
		this.actualPower = actualPower;
		this.totalSampleSize = sampleSize;
		this.alpha = alpha;
		this.test = test;
		this.betaScale = betaScale;
		this.sigmaScale = sigmaScale;
		this.powerMethod = method;
		this.quantile = quantile;
		this.confidenceInterval = confidenceInterval;
	}
	
	   /**
     * Get the nominal power value
     * @return nominal power
     */
    public NominalPower getNominalPower()
    {
        return nominalPower;
    }

    /**
     * Set the target or nominal power value
     * @param nominalPower
     */
    public void setNominalPower(NominalPower nominalPower)
    {
        this.nominalPower = nominalPower;
    }

    /**
     * Get the calculated power value
     * @return calculated power
     */
    public double getActualPower()
    {
        return actualPower;
    }

    /**
     * Set the calculated power value
     * @param actualPower
     */
    public void setActualPower(double actualPower)
    {
        this.actualPower = actualPower;
    }

    /**
     * Get the total sample size
     * @return total N
     */
    public int getTotalSampleSize()
    {
        return totalSampleSize;
    }

    /**
     * Set the total sample size
     * @param totalSampleSize
     */
    public void setTotalSampleSize(int totalSampleSize)
    {
        this.totalSampleSize = totalSampleSize;
    }

    /**
     * Get the type I error value
     * @return alpha
     */
    public TypeIError getAlpha()
    {
        return alpha;
    }

    /**
     * Set the type I error value
     * @param alpha
     */
    public void setAlpha(TypeIError alpha)
    {
        this.alpha = alpha;
    }
	
	
	/**
	 * Get the regression coefficient scale factor
	 * @return beta scale factor
	 */
	public BetaScale getBetaScale()
	{
		return betaScale;
	}

	/**
	 * Set the regression coefficient scale factor
	 * @param betaScale
	 */
	public void setBetaScale(BetaScale betaScale)
	{
		this.betaScale = betaScale;
	}

	/**
	 * Get the error covariance scale factor
	 * @return error covariance scale factor
	 */
	public SigmaScale getSigmaScale()
	{
		return sigmaScale;
	}

	/**
	 * Set error covariance scale factor
	 * 
	 * @param sigmaScale error covariance scale factor
	 */
	public void setSigmaScale(SigmaScale sigmaScale)
	{
		this.sigmaScale = sigmaScale;
	}
	
	/**
	 * Get the statistical test performed
	 * @return statistical test
	 */
	public StatisticalTest getTest()
	{
		return test;
	}

	/**
	 * Set the statistical test
	 * @param test the statistical test
	 * @see edu.cudenver.bios.power.parameters.GLMMPowerParameters.Test
	 */
	public void setTest(StatisticalTest test)
	{
		this.test = test;
	}
	
	/**
	 * Get the power calculation method
	 * @return power method
	 * @see edu.cudenver.bios.power.parameters.GLMMPowerParameters.PowerMethod 
	 */
	public PowerMethod getPowerMethod()
	{
		return powerMethod;
	}

	/**
	 * Set the power calculation method
	 * @param powerMethod
	 * 	@see edu.cudenver.bios.power.parameters.GLMMPowerParameters.PowerMethod 
	 */
	public void setPowerMethod(PowerMethod powerMethod)
	{
		this.powerMethod = powerMethod;
	}

	/**
	 * Get the quantile used for quantile power.  This will be set to NaN
	 * unless the current power method is quantile power.
	 * @return quantile
	 */
	public Quantile getQuantile()
	{
		return quantile;
	}

	/**
	 * Set the quantile.  This should only be set if the power method is
	 * set to quantile power.
	 * @param quantile the quantile of the non-centrality distribution
	 */
	public void setQuantile(Quantile quantile)
	{
		this.quantile = quantile;
	}

	/**
	 * Get the confidence interval associated with power	
	 * @return confidence interval
	 */
	public ConfidenceInterval getConfidenceInterval()
	{
		return confidenceInterval;
	}

	/**
	 * Set the confidence interval associated with power	
	 * @param confidenceInterval the power confidence interval
	 */
	public void setConfidenceInterval(ConfidenceInterval confidenceInterval)
	{
		this.confidenceInterval = confidenceInterval;
	}

	/**
	 * Output the object as XML
	 */
	public String toXML()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("<glmmPower");
		buffer.append(" alpha='");
		buffer.append(alpha);
		buffer.append("' nominalPower='");
		buffer.append(nominalPower);
		buffer.append("' actualPower='");
		buffer.append(actualPower);
		buffer.append("' sampleSize='");
		buffer.append(totalSampleSize);
		buffer.append("' betaScale='");
		buffer.append(betaScale);
		buffer.append("' sigmaScale='");
		buffer.append(sigmaScale);
		buffer.append("' test='");
		buffer.append(test);
		if (powerMethod != null)
		{
			buffer.append("' powerMethod='");
			buffer.append(powerMethod);
		}
		if (quantile != null && quantile.getValue() != Double.NaN)
		{
			buffer.append("' quantile='");
			buffer.append(quantile);
		}
		buffer.append("' />");
		return buffer.toString();

	}
}
