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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.OneToOne;

import edu.ucdenver.bios.webservice.common.enums.SolutionTypeEnum;


/**
 * Main Study Design object which holds
 * all lists, matrices etc.
 * 
 * @author Uttara Sakhadeo
 */
public class StudyDesign implements Serializable
{	
    private static final long serialVersionUID = -2761124691778704875L;
    /*--------------------
	 * Member Variables
	 *--------------------*/
	// UUID for the study design.  Main unique identifier for the design
	private byte[] uuid = null;
	private String name = null;		
	private boolean gaussianCovariate = false;	
	private SolutionTypeEnum solutionTypeEnum;
	private String participantLabel = null;
		
	private ConfidenceIntervalDescription confidenceIntervalDescriptions = null;	
	private PowerCurveDescription powerCurveDescriptions = null;
	
	/* separate sets for list objects */	
	private List<TypeIError> alphaList = null;
	private List<BetaScale> betaScaleList = null;
	private List<SigmaScale> sigmaScaleList = null;
	private List<RelativeGroupSize> relativeGroupSizeList = null;
	private List<StatisticalTest> statisticalTestList = null;
	private List<PowerMethod> powerMethodList = null;
	private List<Quantile> quantileList = null;
	private List<NominalPower> nominalPower = null;	
	private List<ResponseNode> responseList = null;	
	private List<Double> perGroupSampleSizeList = null;
		
	/*private Map<String,NamedMatrix> matrixMap = new HashMap<String,NamedMatrix>();*/
	private Map<String,NamedMatrix> matrixMap = null;
		
    private List<BetweenParticipantFactor> betweenParticipantFactorList = null;   
   		
    //private Set<StudyDesignNamedMatrix> matrixSet = null;
	private List<RepeatedMeasuresNode> repeatedMeasuresTree = null;
	private List<ClusterNode> clusteringTree = null; 
	
	private Set<Hypothesis> hypotheses = null;	
	private Set<Covariance> covariance = null;
		
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
	public List<RepeatedMeasuresNode> getRepeatedMeasuresTree() {
		return repeatedMeasuresTree;
	}
	public void setRepeatedMeasuresTree(
			List<RepeatedMeasuresNode> repeatedMeasuresTree) {
		this.repeatedMeasuresTree = repeatedMeasuresTree;
	}			
	public ConfidenceIntervalDescription getConfidenceIntervalDescriptions() {
		return confidenceIntervalDescriptions;
	}
	public void setConfidenceIntervalDescriptions(
			ConfidenceIntervalDescription confidenceIntervalDescriptions) {
		this.confidenceIntervalDescriptions = confidenceIntervalDescriptions;
	}	
	public PowerCurveDescription getPowerCurveDescriptions() {
		return powerCurveDescriptions;
	}
	public void setPowerCurveDescriptions(
			PowerCurveDescription powerCurveDescriptions) {
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
	public List<StatisticalTest> getStatisticalTestList() {
		return statisticalTestList;
	}
	public void setStatisticalTestList(List<StatisticalTest> statisticalTestList) {
		this.statisticalTestList = statisticalTestList;
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
	public Set<Covariance> getCovariance() {
		return covariance;
	}
	public void setCovariance(Set<Covariance> covariance) {
		this.covariance = covariance;
	}	
	/*--------------------
	 * Return/Store ResponseList names
	 *--------------------*/
	public List<String> getResponseListNames() 
	{
		List<String> responses = new ArrayList<String>(this.getResponseList().size());
		for(ResponseNode node: this.getResponseList())
		{
			responses.add(node.getName());
		}
		return responses;
	}
	public void setResponseListNames(List<String> responseList) 
	{
		this.responseList = new ArrayList<ResponseNode>(responseList.size());
		for(String name : responseList)
		{
			this.responseList.add(new ResponseNode(name));
		}
		
	}	
	/*--------------------
	 * toString()
	 *--------------------*/
	@Override
	public String toString() {
		return "StudyDesign [\nuuid=" + Arrays.toString(uuid) + ", name=" + name
				+ ", gaussianCovariate=" + gaussianCovariate
				+ ", solutionTypeEnum=" + solutionTypeEnum
				+ ", participantLabel=" + participantLabel
				+ ", \nconfidenceIntervalDescriptions="
				+ confidenceIntervalDescriptions + ", \npowerCurveDescriptions="
				+ powerCurveDescriptions + ", \nalphaList=" + alphaList
				+ ", \nbetaScaleList=" + betaScaleList + ", \nsigmaScaleList="
				+ sigmaScaleList + ", \nrelativeGroupSizeList="
				+ relativeGroupSizeList + ", \nstatisticalTestList=" + statisticalTestList
				+ ", \npowerMethodList=" + powerMethodList + ", \nquantileList="
				+ quantileList + ", \nnominalPower=" + nominalPower
				+ ", \nresponseList=" + responseList
				+ ", \nperGroupSampleSizeList=" + perGroupSampleSizeList
				+ ", \nmatrixMap=" + matrixMap
				+ ", \nbetweenParticipantFactorList="
				+ betweenParticipantFactorList + ", \nrepeatedMeasuresTree="
				+ repeatedMeasuresTree + ", \nclusteringTree=" + clusteringTree
				+ ", \nhypotheses=" + hypotheses + ", \ncovariance=" + covariance
				+ "\n]";
	}	
}