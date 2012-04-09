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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 */
package edu.ucdenver.bios.webservice.common.domain;

import java.util.HashSet;
import java.util.Set;
/**
 * List of covariance objects to work around Jackson serializaiton issues.
 * @author Uttara Sakhadeo
 *
 */
public class CovarianceSet extends HashSet<Covariance> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public CovarianceSet(){
        
    }
    
    public CovarianceSet(int size){
        super(size);
    }
    
    public CovarianceSet(Set<Covariance> set){
        super(set);
    }
}
