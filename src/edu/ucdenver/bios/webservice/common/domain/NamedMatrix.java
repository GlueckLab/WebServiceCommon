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

public class NamedMatrix
{
    protected String name;
    protected int rows;
    protected int columns;
    protected double[][] data;

    public NamedMatrix(String name, int rows, int columns)
    {
        this.name = name;
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    public NamedMatrix(String name, int rows, int columns, double[][] data)
    {
        this.name = name;
        this.rows = rows;
        this.columns = columns;
        this.data = data;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRows()
    {
        return rows;
    }

    public int getColumns()
    {
        return columns;
    }

    public void setCellData(int row, int column, double value)
    {
        if (row >= 0 && row < rows && 
                column >= 0 && column < columns)
        {
            data[row][column] = value;
        }
    }

    public Double getCellData(int row, int column)
    {
        return data[row][column];
    }

}
