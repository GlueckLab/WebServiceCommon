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

import java.util.HashSet;
import java.util.Set;

/**
 * Main Study Design object which holds
 * all lists, matrices etc.
 * 
 * @author Uttara Sakhadeo
 */
public class StudyDesign
{
	public enum SolutionType
	{
		POWER,
		SAMPLE_SIZE,
		DETECTABLE_DIFFERENCE
	};

	// UUID for the study design.  Main unique identifier for the design
	private byte[] uuid = null;
	// name of the study design
	private String name = null;	
	// flag indicating whether we are solving for power or sample size
	private SolutionType solutionType = null;
	// flag indicating if the design includes a baseline covariate
	private boolean gaussianCovariate = false;
	
    private Set<BetweenParticipantFactor> betweenParticipantFactorSet = new HashSet<BetweenParticipantFactor>();
	private Set<NamedList> listSet = new HashSet<NamedList>();
	private Set<StudyDesignNamedMatrix> matrixSet = new HashSet<StudyDesignNamedMatrix>();

	/**
	 * Create an empty study design without a UUID assigned
	 */
	public StudyDesign() 
	{}

	/**
	 * Create a study design object with the specified UUID
	 * @param studyUUID unique identifier for the study design
	 */
	public StudyDesign(byte[] uuid) 
	{
		this.uuid = uuid;
	}

	/**
	 * Get the uuid of the study design
	 * @return uuid
	 */
	public byte[] getUuid() 
	{
		return uuid;
	}

	/**
	 * Set the study design uuid
	 * @param uuid UUID object as byte array
	 */
	public void setUuid(byte [] uuid) 
	{
		this.uuid = uuid;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public SolutionType getSolvingFor() 
	{
		return solutionType;
	}

	public void setSolvingFor(SolutionType solutionType) 
	{
		this.solutionType = solutionType;
	}

	public boolean hasGaussianCovariate() 
	{
		return gaussianCovariate;
	}

	public void setIsGuassianSelection(boolean hasGaussianCovariate) 
	{
		this.gaussianCovariate = hasGaussianCovariate;
	}

	public SolutionType getSolutionType()
	{
		return solutionType;
	}

	public void setSolutionType(SolutionType solutionType)
	{
		this.solutionType = solutionType;
	}

	public boolean isGaussianCovariate()
	{
		return gaussianCovariate;
	}

	public void setGaussianCovariate(boolean gaussianCovariate)
	{
		this.gaussianCovariate = gaussianCovariate;
	}


	public void addList(NamedList list)
	{
		listSet.add(list);
	}
	
	public void getNamedList(String name)
	{

	}
	
	public void addMatrix(StudyDesignNamedMatrix matrix)
	{
		matrixSet.add(matrix);
	}
	
	
	
}
