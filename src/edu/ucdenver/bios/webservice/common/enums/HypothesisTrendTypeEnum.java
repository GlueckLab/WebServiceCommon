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
package edu.ucdenver.bios.webservice.common.enums;

/**
 * Enum of available types of trends which can be tested in a
 * hypothesis.
 */
public enum HypothesisTrendTypeEnum
{
	NONE("None"),
	CHANGE_FROM_BASELINE("Change from baseline"),
	ALL_POYNOMIAL("All polynomial trends"),
	LINEAR("Linear trend"),
	QUADRATIC("Quadratic trend"),
	CUBIC("Cubic trend");
	
	final String id;
	
	HypothesisTrendTypeEnum(String id){this.id=id;}

	public String getId() {return id;}
	
	public static HypothesisTrendTypeEnum parseId(String id)
	{					 								
		HypothesisTrendTypeEnum hypothesisTrendType = null;			
		for (HypothesisTrendTypeEnum type : HypothesisTrendTypeEnum.values()) 
		{				
	        if (id.equalsIgnoreCase(type.id)) {
	        	hypothesisTrendType = type;
	        }		
		}
		return hypothesisTrendType;
	}
}
