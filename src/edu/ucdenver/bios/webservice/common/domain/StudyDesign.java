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
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.ucdenver.bios.webservice.common.enumclasses.HorizontalAxisLabel;


/**
 * Main Study Design object which holds
 * all lists, matrices etc.
 * 
 * @author Uttara Sakhadeo
 */
@Entity
@Table(name="tablestudydesign")
public class StudyDesign
{
	public enum SolutionType
	{
		POWER("1"),
		SAMPLE_SIZE("2"),
		DETECTABLE_DIFFERENCE("3");
		
		final String id;
		
		SolutionType(String id){
			//System.out.println("HorizontalAxisLabel Enum Constructor : "+id);
			this.id=id;}

		public String getId() {
			System.out.println("getId()"+id);
			return id;
		}
		
		public static SolutionType parseId(String id)
		{					 			
			System.out.println("parseId() "+id);			
			SolutionType solutionType = null;			
			for (SolutionType b : SolutionType.values()) 
			{				
		        if (id.equalsIgnoreCase(b.id)) {
		        	solutionType = b;
		        }		
			}
			System.out.println(solutionType.id);
			return solutionType;
		}		
	};	
	public enum PowerMethod
	{
		CONDITIONAL("1"),
		UNCONDITIONAL("2"),
		QUANTILE("3");
		
		final String id;
		
		PowerMethod(String id){
			//System.out.println("HorizontalAxisLabel Enum Constructor : "+id);
			this.id=id;}

		public String getId() {
			System.out.println("getId()"+id);
			return id;
		}
		
		public static PowerMethod parseId(String id)
		{					 			
			System.out.println("parseId() "+id);			
			PowerMethod powerMethod = null;			
			for (PowerMethod b : PowerMethod.values()) 
			{				
		        if (id.equalsIgnoreCase(b.id)) {
		        	powerMethod = b;
		        }		
			}
			System.out.println(powerMethod.id);
			return powerMethod;
		}
	};

	/*--------------------
	 * Member Variables
	 *--------------------*/
	// UUID for the study design.  Main unique identifier for the design
	@Id
	@Column(name="uuid")
	private byte[] uuid = null;
	@Column(name="name")
	private String name = null;	
	@Column
	private SolutionType solutionType = null;	
	@Column(name="gaussianCovariate")
	private boolean gaussianCovariate = false;
	
	/* separate sets for list objects */
	private List<TypeIError> alphaList;
	private List<Double> betaScaleList;
	private List<Double> sigmaScaleList;
	private List<Double> powerList;
	private List<Integer> perGroupSampleSizeList;
	private List<Integer> relativeGroupSizeList;
	private List<StatisticalTest> testList;
	private List<String> responseList;
	private List<PowerMethod> powerMethodList;
	private List<Double> quantileList;
	// clustering information
    @OneToMany
	private List<ClusterNode> clusteringTree;
    // repeated measures
    @OneToMany
	private List<RepeatedMeasuresNode> repeatedMeasuresTree;
	
	// fixed between subject effects
    private Set<BetweenParticipantFactor> betweenParticipantFactorSet = new HashSet<BetweenParticipantFactor>();   
    //	private Set<NamedList> listSet = new HashSet<NamedList>();
	// Instead of Set -> HashMap() .... for matrices,
	private Set<StudyDesignNamedMatrix> matrixSet = new HashSet<StudyDesignNamedMatrix>();
	@OneToOne
	private Set<ConfidenceIntervalDescription> confidenceIntervalDescriptions = new HashSet<ConfidenceIntervalDescription>();
	@OneToOne
	private Set<PowerCurveDescription> powerCurveDescriptions = new HashSet<PowerCurveDescription>();
	// primary study hypothesis
	@OneToOne
	private Set<Hypothesis> hypotheses;
	/*--------------------
	 * Constructors
	 *--------------------*/
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
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/
	public byte[] getUuid() {
		return uuid;
	}
	public void setUuid(byte[] uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SolutionType getSolutionType() {
		return solutionType;
	}
	public void setSolutionType(SolutionType solutionType) {
		this.solutionType = solutionType;
	}
	public boolean isGaussianCovariate() {
		return gaussianCovariate;
	}
	public void setGaussianCovariate(boolean gaussianCovariate) {
		this.gaussianCovariate = gaussianCovariate;
	}
	public List<TypeIError> getAlphaList() {
		return alphaList;
	}
	public void setAlphaList(List<TypeIError> alphaList) {
		this.alphaList = alphaList;
	}
	public List<Double> getBetaScaleList() {
		return betaScaleList;
	}
	public void setBetaScaleList(List<Double> betaScaleList) {
		this.betaScaleList = betaScaleList;
	}
	public List<Double> getSigmaScaleList() {
		return sigmaScaleList;
	}
	public void setSigmaScaleList(List<Double> sigmaScaleList) {
		this.sigmaScaleList = sigmaScaleList;
	}
	public List<Double> getPowerList() {
		return powerList;
	}
	public void setPowerList(List<Double> powerList) {
		this.powerList = powerList;
	}
	public List<Integer> getPerGroupSampleSizeList() {
		return perGroupSampleSizeList;
	}
	public void setPerGroupSampleSizeList(List<Integer> perGroupSampleSizeList) {
		this.perGroupSampleSizeList = perGroupSampleSizeList;
	}
	public List<Integer> getRelativeGroupSizeList() {
		return relativeGroupSizeList;
	}
	public void setRelativeGroupSizeList(List<Integer> relativeGroupSizeList) {
		this.relativeGroupSizeList = relativeGroupSizeList;
	}
	public List<StatisticalTest> getTestList() {
		return testList;
	}
	public void setTestList(List<StatisticalTest> testList) {
		this.testList = testList;
	}
	public List<String> getResponseList() {
		return responseList;
	}
	public void setResponseList(List<String> responseList) {
		this.responseList = responseList;
	}
	public List<PowerMethod> getPowerMethodList() {
		return powerMethodList;
	}
	public void setPowerMethodList(List<PowerMethod> powerMethodList) {
		this.powerMethodList = powerMethodList;
	}
	public List<Double> getQuantileList() {
		return quantileList;
	}
	public void setQuantileList(List<Double> quantileList) {
		this.quantileList = quantileList;
	}
	public List<ClusterNode> getClusteringTree() {
		return clusteringTree;
	}
	public void setClusteringTree(List<ClusterNode> clusteringTree) {
		this.clusteringTree = clusteringTree;
	}
	public List<RepeatedMeasuresNode> getRepeatedMeasuresTree() {
		return repeatedMeasuresTree;
	}
	public void setRepeatedMeasuresTree(
			List<RepeatedMeasuresNode> repeatedMeasuresTree) {
		this.repeatedMeasuresTree = repeatedMeasuresTree;
	}
	public Set<BetweenParticipantFactor> getBetweenParticipantFactorSet() {
		return betweenParticipantFactorSet;
	}
	public void setBetweenParticipantFactorSet(
			Set<BetweenParticipantFactor> betweenParticipantFactorSet) {
		this.betweenParticipantFactorSet = betweenParticipantFactorSet;
	}
	public Set<StudyDesignNamedMatrix> getMatrixSet() {
		return matrixSet;
	}
	public void setMatrixSet(Set<StudyDesignNamedMatrix> matrixSet) {
		this.matrixSet = matrixSet;
	}
	public Set<ConfidenceIntervalDescription> getConfidenceIntervalDescriptions() {
		return confidenceIntervalDescriptions;
	}
	public void setConfidenceIntervalDescriptions(
			Set<ConfidenceIntervalDescription> confidenceIntervalDescriptions) {
		this.confidenceIntervalDescriptions = confidenceIntervalDescriptions;
	}
	public Set<PowerCurveDescription> getPowerCurveDescriptions() {
		return powerCurveDescriptions;
	}
	public void setPowerCurveDescriptions(
			Set<PowerCurveDescription> powerCurveDescriptions) {
		this.powerCurveDescriptions = powerCurveDescriptions;
	}
	public Set<Hypothesis> getHypotheses() {
		return hypotheses;
	}
	public void setHypotheses(Set<Hypothesis> hypotheses) {
		this.hypotheses = hypotheses;
	}		
		
}
/*{

// UUID for the study design.  Main unique identifier for the design
@Id
@Column(name="uuid")
private byte[] uuid = null;
private UUID studyUUID = null;
// name of the study design
@Column(name="name")
private String name = null;	
// flag indicating whether we are solving for power or sample size	
//private SolvingFor flagSolveFor = null;
@Column(name="flagSolveFor")
private String flagSolveFor =null;
// flag indicating if the design includes a baseline covariate
@Column(name="hasGaussianCovariate")
private boolean hasGaussianCovariate = false;
//private ConfidenceInterval confidenceIntervalDescription = null;
private Set<ConfidenceInterval> confidenceIntervalDescriptions = new HashSet<ConfidenceInterval>();

public StudyDesign() 
{}	


public StudyDesign(UUID studyUUID) 
{
	this.studyUUID = studyUUID;
	this.uuid = UUIDConversion.asByteArray(studyUUID);
}

public UUID getStudyUUID() 
{
	return studyUUID;
}
	
public byte[] getUuid() 
{
	return uuid;
}

   public void setUuid(byte [] uuid) 
    {
        this.uuid = uuid;
    }

public void setStudyUUID(UUID studyUuid) 
{
	this.studyUUID = studyUuid;
	this.uuid = UUIDConversion.asByteArray(studyUUID);
}
	
public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}
	
public boolean isHasGaussianCovariate() {
	return hasGaussianCovariate;
}

public void setHasGaussianCovariate(boolean hasGaussianCovariate) {
	this.hasGaussianCovariate = hasGaussianCovariate;
}

public SolvingFor getFlagSolvingFor() {
	return SolvingFor.fromValue(this.flagSolveFor);
}

public void setFlagSolvingFor(SolvingFor flagSolvingFor) {
	this.flagSolveFor = flagSolvingFor.toValue();
}

public Set<ConfidenceInterval> getConfidenceIntervalDescriptions() {
	return confidenceIntervalDescriptions;
}

public void setConfidenceIntervalDescriptions(
		Set<ConfidenceInterval> confidenceIntervalDescriptions) {
	this.confidenceIntervalDescriptions = confidenceIntervalDescriptions;
}

public ConfidenceInterval getConfidenceIntervalDescription() {
	return confidenceIntervalDescription;
}

public void setConfidenceIntervalDescription(
		ConfidenceInterval confidenceIntervalDescription) {
	this.confidenceIntervalDescription = confidenceIntervalDescription;
}

}*/