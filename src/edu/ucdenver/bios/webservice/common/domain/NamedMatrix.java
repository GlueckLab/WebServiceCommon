package edu.ucdenver.bios.webservice.common.domain;

public class NamedMatrix
{
	protected String name;
	protected int rows;
	protected int columns;
	protected double[][] data;
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
	public void setRows(int rows)
	{
		this.rows = rows;
	}
	public int getColumns()
	{
		return columns;
	}
	public void setColumns(int columns)
	{
		this.columns = columns;
	}
	public double[][] getData()
	{
		return data;
	}
	public void setData(double[][] data)
	{
		this.data = data;
	} 
	
	
	
}
