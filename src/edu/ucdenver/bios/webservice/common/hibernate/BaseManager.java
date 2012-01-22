/*
 * Study Design Service for the GLIMMPSE Software System.  
 * This service stores study design definitions for users of the GLIMMSE interface.
 * Service contain all information related to a power or sample size calculation.  
 * The Study Design Service simplifies communication between different screens in the user interface.
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
package edu.ucdenver.bios.webservice.common.hibernate;

import org.hibernate.Session;

/**
 * Base class for interacting with a database through hibernate.
 * The BaseManager is a wrapper class on standard hibernate
 * calls for managing transactions, commit/rollback, etc.
 * 
 * @author Uttara Sakhadeo
 *
 */
public class BaseManager 
{
	protected Session session = null;
	protected boolean transactionStarted = false;

	/**
	 * Create a new hibernate manager
	 * 
	 * @throws BaseManagerException
	 */
	public BaseManager() throws BaseManagerException
	{
		try
		{        	
			session = SessionContext.getInstance().getCurrentSession();        	
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new BaseManagerException("Failed to get database session: " + e.getMessage());
		}
	}

	/**
	 * Start a new transaction with the database
	 * 
	 * @throws BaseManagerException
	 */
	public void beginTransaction() throws BaseManagerException
	{
		try
		{
			if (session != null)
			{
				session.beginTransaction();
				transactionStarted = true;
			}
		}
		catch (Exception e)
		{
			throw new BaseManagerException("Failed to get database session: " + e.getMessage());
		}
	}

	/**
	 * Commit changes to the database
	 * 
	 * @throws BaseManagerException
	 */
	public void commit() throws BaseManagerException
	{
		try
		{
			if (session != null) session.getTransaction().commit();
			transactionStarted = false;
		}
		catch (Exception e)
		{
			throw new BaseManagerException("Failed to commit transaction: " + e.getMessage());
		}
	}

	/**
	 * Rollback database changes
	 * 
	 * @throws BaseManagerException
	 */
	public void rollback() throws BaseManagerException
	{
		try
		{
			if (session != null) session.getTransaction().rollback();
			transactionStarted = false;
		}
		catch (Exception e)
		{
			throw new BaseManagerException("Failed to rollback transaction: " + e.getMessage());
		}
	}
}
