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

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MapKey;
import javax.persistence.MapKeyClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.ucdenver.bios.webservice.common.enums.SolutionTypeEnum;


/**
 * Main Study Design object which holds
 * all lists, matrices etc.
 * 
 * @author Uttara Sakhadeo
 */
@Entity
@Table(name="STUDY_DESIGN")
public class StudyDesign implements Serializable
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
	@Column(name="solutionType")
	private SolutionTypeEnum solutionTypeEnum;
	@Column(name="participantLabel")
	private String participantLabel = null;
	
	@OneToOne
	/*private Set<ConfidenceIntervalDescription> confidenceIntervalDescriptions = new HashSet<ConfidenceIntervalDescription>();*/
	private Set<ConfidenceIntervalDescription> confidenceIntervalDescriptions = null;
	@OneToOne
	/*private Set<PowerCurveDescription> powerCurveDescriptions = new HashSet<PowerCurveDescription>();*/
	private Set<PowerCurveDescription> powerCurveDescriptions = null;
	@OneToMany
    private List<ClusterNode> clusteringTree = null;        
	
	/* separate sets for list objects */
	@OneToMany
	//private List<TypeIError> alphaList;
	private List<TypeIError> alphaList = null;
	@OneToMany
	private List<BetaScale> betaScaleList = null;
	@OneToMany
	private List<SigmaScale> sigmaScaleList = null;
	@OneToMany
	private List<RelativeGroupSize> relativeGroupSizeList = null;
	@OneToMany
	private List<StatisticalTest> testList = null;
	@OneToMany
	private List<PowerMethod> powerMethodList = null;
	@OneToMany
	private List<Quantile> quantileList = null;
	@OneToMany
	private List<NominalPower> nominalPower = null;
	
	private List<ResponseNode> responseList = null;	
	private List<Double> perGroupSampleSizeList = null;
		
	@MapKey(name="name")
	@ManyToMany
	/*private Map<String,NamedMatrix> matrixMap = new HashMap<String,NamedMatrix>();*/
	private Map<String,NamedMatrix> matrixMap = null;
	
	// fixed between subject effects
    private List<BetweenParticipantFactor> betweenParticipantFactorList = null;   
    //	private Set<NamedList> listSet = new HashSet<NamedList>();
	// Instead of Set -> HashMap() .... for matrices,
	/*private Set<StudyDesignNamedMatrix> matrixSet = new HashSet<StudyDesignNamedMatrix>();*/
    private Set<StudyDesignNamedMatrix> matrixSet = null;
	@OneToMany
	private List<RepeatedMeasuresNode> repeatedMeasuresTree = null;
	// primary study hypothesis
	@OneToOne
	private Set<Hypothesis> hypotheses = null;	
		
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
	public List<ResponseNode> getResponseList() {
		return responseList;
	}
	public void setResponseList(List<ResponseNode> responseList) {
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
	public List<StatisticalTest> getTestList() {
		return testList;
	}
	public void setTestList(List<StatisticalTest> testList) {
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
	public List<TypeIError> getAlphaList() {
		return alphaList;
	}
	public void setAlphaList(List<TypeIError> alphaList) {
		this.alphaList = alphaList;
	}
	public Map<String, NamedMatrix> getMatrixMap() {
		return matrixMap;
	}
	public void setMatrixMap(Map<String, NamedMatrix> matrixMap) {
		this.matrixMap = matrixMap;
	}
	public List<BetweenParticipantFactor> getBetweenParticipantFactorList() {
		return betweenParticipantFactorList;
	}
	public void setBetweenParticipantFactorList(
			List<BetweenParticipantFactor> betweenParticipantFactorList) {
		this.betweenParticipantFactorList = betweenParticipantFactorList;
	}
	public String getParticipantLabel() {
		return participantLabel;
	}
	public void setParticipantLabel(String participantLabel) {
		this.participantLabel = participantLabel;
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