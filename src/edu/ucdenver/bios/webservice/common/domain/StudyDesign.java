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

import edu.ucdenver.bios.webservice.common.enums.PowerMethodEnum;
import edu.ucdenver.bios.webservice.common.enums.SolutionTypeEnum;


/**
 * Main Study Design object which holds
 * all lists, matrices etc.
 * 
 * @author Uttara Sakhadeo
 */
@Entity
@Table(name="STUDY_DESIGN")
public class StudyDesign
{	
	/*--------------------
	 * Member Variables
	 *--------------------*/
	// UUID for the study design.  Main unique identifier for the design
	@Id
	@Column(name="uuid")
	private byte[] uuid = null;
	@Column(name="name")
	private String name = null;		
	@Column(name="gaussianCovariate")
	private boolean gaussianCovariate = false;
	@Column(name="powerMethod")
	private PowerMethodEnum powerMethodEnum;
	@Column(name="solutionType")
	private SolutionTypeEnum solutionTypeEnum;
	
	@OneToOne
	private Set<ConfidenceIntervalDescription> confidenceIntervalDescriptions = new HashSet<ConfidenceIntervalDescription>();
	@OneToOne
	private Set<PowerCurveDescription> powerCurveDescriptions = new HashSet<PowerCurveDescription>();		
	@OneToMany
    private List<ClusterNode> clusteringTree;        
	
	/* separate sets for list objects */
	@OneToMany
	private List<TypeIError> alphaList;
	@OneToMany
	private List<BetaScale> betaScaleList;
	@OneToMany
	private List<SigmaScale> sigmaScaleList;
	@OneToMany
	private List<RelativeGroupSize> relativeGroupSizeList;
	@OneToMany
	private List<Test> testList;
	@OneToMany
	private List<PowerMethod> powerMethodList;
	@OneToMany
	private List<Quantile> quantileList;
	@OneToMany
	private List<NominalPower> nominalPower;
	
	private List<String> responseList;	
	private List<Double> perGroupSampleSizeList;
		
	// fixed between subject effects
    private Set<BetweenParticipantFactor> betweenParticipantFactorSet = new HashSet<BetweenParticipantFactor>();   
    //	private Set<NamedList> listSet = new HashSet<NamedList>();
	// Instead of Set -> HashMap() .... for matrices,
	private Set<StudyDesignNamedMatrix> matrixSet = new HashSet<StudyDesignNamedMatrix>();
	@OneToMany
	private List<RepeatedMeasuresNode> repeatedMeasuresTree;
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
	public List<String> getResponseList() {
		return responseList;
	}
	public void setResponseList(List<String> responseList) {
		this.responseList = responseList;
	}
	/*public List<PowerMethod> getPowerMethodList() {
		return powerMethodList;
	}
	public void setPowerMethodList(List<PowerMethod> powerMethodList) {
		this.powerMethodList = powerMethodList;
	}*/	
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
	public List<ClusterNode> getClusteringTree() {
		return clusteringTree;
	}
	public void setClusteringTree(List<ClusterNode> clusteringTree) {
		this.clusteringTree = clusteringTree;
	}
	public PowerMethodEnum getPowerMethodEnum() {
		return powerMethodEnum;
	}
	public void setPowerMethodEnum(PowerMethodEnum powerMethodEnum) {
		this.powerMethodEnum = powerMethodEnum;
	}
	public SolutionTypeEnum getSolutionTypeEnum() {
		return solutionTypeEnum;
	}
	public void setSolutionTypeEnum(SolutionTypeEnum solutionTypeEnum) {
		this.solutionTypeEnum = solutionTypeEnum;
	}
	public List<BetaScale> getBetaScaleList() {
		return betaScaleList;
	}
	public void setBetaScaleList(List<BetaScale> betaScaleList) {
		this.betaScaleList = betaScaleList;
	}
	public List<SigmaScale> getSigmaScaleList() {
		return sigmaScaleList;
	}
	public void setSigmaScaleList(List<SigmaScale> sigmaScaleList) {
		this.sigmaScaleList = sigmaScaleList;
	}
	public List<RelativeGroupSize> getRelativeGroupSizeList() {
		return relativeGroupSizeList;
	}
	public void setRelativeGroupSizeList(
			List<RelativeGroupSize> relativeGroupSizeList) {
		this.relativeGroupSizeList = relativeGroupSizeList;
	}
	public List<Test> getTestList() {
		return testList;
	}
	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}
	public List<PowerMethod> getPowerMethodList() {
		return powerMethodList;
	}
	public void setPowerMethodList(List<PowerMethod> powerMethodList) {
		this.powerMethodList = powerMethodList;
	}
	public List<Quantile> getQuantileList() {
		return quantileList;
	}
	public void setQuantileList(List<Quantile> quantileList) {
		this.quantileList = quantileList;
	}
	public List<Double> getPerGroupSampleSizeList() {
		return perGroupSampleSizeList;
	}
	public void setPerGroupSampleSizeList(List<Double> perGroupSampleSizeList) {
		this.perGroupSampleSizeList = perGroupSampleSizeList;
	}
	public List<NominalPower> getNominalPower() {
		return nominalPower;
	}
	public void setNominalPower(List<NominalPower> nominalPower) {
		this.nominalPower = nominalPower;
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