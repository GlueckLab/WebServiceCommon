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
 * Enum object referred in 'PowerMethod' class.
 * 
 * @author Uttara Sakhadeo
 */
public enum PowerMethodEnum
{
	CONDITIONAL("Conditional"),
	UNCONDITIONAL("Unconditional"),
	QUANTILE("Quantile");
	
	final String id;
	
	PowerMethodEnum(String id){		
		this.id=id;}

	public String getId() {		
		return id;
	}
	
	public static PowerMethodEnum parseId(String id)
	{					 						
		PowerMethodEnum powerMethodEnum = null;			
		for (PowerMethodEnum b : PowerMethodEnum.values()) 
		{				
	        if (id.equalsIgnoreCase(b.id)) {
	        	powerMethodEnum = b;
	        }		
		}		
		return powerMethodEnum;
	}
};
