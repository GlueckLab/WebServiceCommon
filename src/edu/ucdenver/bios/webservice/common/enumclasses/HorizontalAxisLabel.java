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
package edu.ucdenver.bios.webservice.common.enumclasses;

public enum HorizontalAxisLabel {	
	VARIABILITY_SCALE_FACTOR("1"),
	TOTAL_SAMPLE_SIZE("2"),
	REGRESSION_COEEFICIENT_SCALE_FACTOR("3");
		/*VARIABILITY_SCALE_FACTOR("Variability Scale Factor"),
		TOTAL_SAMPLE_SIZE("Total Sample Size"),
		REGRESSION_COEEFICIENT_SCALE_FACTOR("Regression Coeeficient Scale Factor");*/
		
		final String id;
		
		HorizontalAxisLabel(String id){
			//System.out.println("HorizontalAxisLabel Enum Constructor : "+id);
			this.id=id;}

		public String getId() {			
			return id;
		}
		
		public static HorizontalAxisLabel parseId(String id)
		{					 								
			HorizontalAxisLabel horizontalAxisLabel = null;			
			for (HorizontalAxisLabel b : HorizontalAxisLabel.values()) 
			{				
		        if (id.equalsIgnoreCase(b.id)) {
		        	horizontalAxisLabel = b;
		        }		
			}
			return horizontalAxisLabel;
		}
}
