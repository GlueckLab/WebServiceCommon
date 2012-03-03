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

/**
 * Matrix which contains fixed and random components.  The combined
 * matrix may be produced by concatenating the fixed and random
 * submatrices either vertically or horizontally.
 * 
 * @author Sarah Kreidler
 *
 */
public class StudyDesignFixedRandomMatrix extends FixedRandomMatrix
{
    private static final long serialVersionUID = -7365369949623340929L;
    
    protected StudyDesign studyDesign;

    /**
     * Constructor, create a fixed/random matrix from the specified data arrays
     */
    public StudyDesignFixedRandomMatrix(StudyDesign design, String name,
    		NamedMatrix fixedMatrix, NamedMatrix randomMatrix, boolean combineHorizontal) 
    throws IllegalArgumentException
    {
    	super(name, fixedMatrix, randomMatrix, combineHorizontal);
    	this.studyDesign = studyDesign;
    }

}
