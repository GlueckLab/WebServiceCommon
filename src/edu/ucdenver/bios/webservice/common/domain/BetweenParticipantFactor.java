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

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Uttara Sakhadeo
 *
 */
public class BetweenParticipantFactor
{
	private int id;
	private StudyDesign studyDesign;
	private String predictorName = null;
	private List<String> categoryList = null;
	
	public BetweenParticipantFactor() 
	{
		categoryList = new ArrayList<String>();
	}
	
	public BetweenParticipantFactor(String predictorName, List<String> categoryList)
	{
		this.predictorName = predictorName;
		this.categoryList = categoryList;
	}
	
	public StudyDesign getstudyDesign() {
		return studyDesign;
	}
	public void setstudyDesign(StudyDesign studyDesign) {
		this.studyDesign = studyDesign;
	}
	public String getPredictorName() {
		return predictorName;
	}
	public void setPredictorName(String predictorName) {
		this.predictorName = predictorName;
	}
	public List<String> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<String> dataList) {
		this.categoryList = dataList;
	}
	
	
}
