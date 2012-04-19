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

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * List of cluster node objects to work around Jackson serializaiton issues.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class ClusterNodeList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The cluster node list. */
    private List<ClusterNode> clusterNodeList = null;

    /*--------------------
     * Constructors
     *--------------------*/

    /**
     * Instantiates a new cluster node list.
     */
    public ClusterNodeList() {

    }

    /**
     * Instantiates a new cluster node list.
     * 
     * @param uuid
     *            the uuid
     */
    public ClusterNodeList(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new cluster node list.
     * 
     * @param uuid
     *            the uuid
     * @param list
     *            the list
     */
    public ClusterNodeList(final byte[] uuid, final List<ClusterNode> list) {
        this.uuid = uuid;
        this.clusterNodeList = list;
    }

    /**
     * Instantiates a new cluster node list.
     * 
     * @param size
     *            the size
     */
    public ClusterNodeList(final int size) {
        this.clusterNodeList = new ArrayList<ClusterNode>(size);
    }

    /**
     * Instantiates a new cluster node list.
     * 
     * @param list
     *            the list
     */
    public ClusterNodeList(final List<ClusterNode> list) {
        this.clusterNodeList = list;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the uuid.
     * 
     * @return the uuid
     */
    public final byte[] getUuid() {
        return uuid;
    }

    /**
     * Sets the uuid.
     * 
     * @param uuid
     *            the new uuid
     */
    public final void setUuid(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Gets the cluster node list.
     * 
     * @return the cluster node list
     */
    public final List<ClusterNode> getClusterNodeList() {
        return clusterNodeList;
    }

    /**
     * Sets the cluster node list.
     * 
     * @param clusterNodeList
     *            the new cluster node list
     */
    public final void setClusterNodeList(
            final List<ClusterNode> clusterNodeList) {
        this.clusterNodeList = clusterNodeList;
    }

}
