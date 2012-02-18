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
package edu.ucdenver.bios.webservice.common.domain.test;

import com.google.gson.Gson;

import edu.ucdenver.bios.webservice.common.domain.BetweenParticipantFactor;
import edu.ucdenver.bios.webservice.common.domain.NamedMatrix;
import junit.framework.TestCase;

/**
 * Not so much a test case, as a convenient way to view the JSON representation of
 * domain layer objects
 *  
 * @author Sarah Kreidler
 *
 */
public class TestJSONRepresentation extends TestCase
{
    public void testNamedMatrixToJSON()
    {
        double data[][] = {{1,2},{3,4},{5,6}};
        NamedMatrix obj = new NamedMatrix("My Matrix", 3, 2, data);

        Gson gson = new Gson();
        String json = gson.toJson(obj);  
        System.out.println(json);
        assertTrue(true);
    }
    
    public void testBetweenParticipantFactorToJSON()
    {
        BetweenParticipantFactor obj = new BetweenParticipantFactor();
        obj.setPredictorName("drug");
        obj.addCategory("placebo");
        obj.addCategory("Atorvastatin");
        obj.addCategory("Lovastatin");

        Gson gson = new Gson();
        String json = gson.toJson(obj);  
        System.out.println(json);
        assertTrue(true);
    }
}
