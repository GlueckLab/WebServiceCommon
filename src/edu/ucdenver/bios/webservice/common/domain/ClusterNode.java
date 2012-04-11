/*
 *  Web service utility functions for managing hibernate, json, etc.
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

import java.io.Serializable;

/**
 * This is a wrapper for the clustering information.
 *
 * @author Uttara Sakhadeo
 *
 */
public class ClusterNode implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8859192442862759392L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** The group name. */
    private String groupName = null;

    /** The group size. */
    private Integer groupSize = null;

    /** The intra cluster correlation. */
    private Double intraClusterCorrelation = null;

    /** The node. */
    private Integer node;

    /** The parent. */
    private Integer parent;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new cluster node.
     */
    public ClusterNode() {
    }

    /**
     * Instantiates a new cluster node.
     *
     * @param groupNameValue
     *            the group name
     */
    public ClusterNode(final String groupNameValue) {
        this.groupName = groupNameValue;
    }

    /**
     * Instantiates a new cluster node.
     *
     * @param groupNameValue
     *            the group name
     * @param groupSizeValue
     *            the group size
     * @param nodeValue
     *            the node
     * @param parentValue
     *            the parent
     */
    public ClusterNode(final String groupNameValue,
            final Integer groupSizeValue, final Integer nodeValue,
            final Integer parentValue) {
        this.groupName = groupNameValue;
        this.groupSize = groupSizeValue;
        this.node = nodeValue;
        this.parent = parentValue;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the id.
     *
     * @return the id
     */
    public final int getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param idValue
     *            the new id
     */
    public final void setId(final int idValue) {
        this.id = idValue;
    }

    /**
     * Gets the group name.
     *
     * @return the group name
     */
    public final String getGroupName() {
        return groupName;
    }

    /**
     * Sets the group name.
     *
     * @param groupNameValue
     *            the new group name
     */
    public final void setGroupName(final String groupNameValue) {
        this.groupName = groupNameValue;
    }

    /**
     * Gets the group size.
     *
     * @return the group size
     */
    public final Integer getGroupSize() {
        return groupSize;
    }

    /**
     * Sets the group size.
     *
     * @param groupSizeValue
     *            the new group size
     */
    public final void setGroupSize(final Integer groupSizeValue) {
        this.groupSize = groupSizeValue;
    }

    /**
     * Gets the intra cluster correlation.
     *
     * @return the intra cluster correlation
     */
    public final Double getIntraClusterCorrelation() {
        return intraClusterCorrelation;
    }

    /**
     * Sets the intra cluster correlation.
     *
     * @param intraClusterCorrelationValue
     *            the new intra cluster correlation
     */
    public final void setIntraClusterCorrelation(
            final Double intraClusterCorrelationValue) {
        this.intraClusterCorrelation = intraClusterCorrelationValue;
    }

    /**
     * Gets the node.
     *
     * @return the node
     */
    public final Integer getNode() {
        return node;
    }

    /**
     * Sets the node.
     *
     * @param nodeValue
     *            the new node
     */
    public final void setNode(final Integer nodeValue) {
        this.node = nodeValue;
    }

    /**
     * Gets the parent.
     *
     * @return the parent
     */
    public final Integer getParent() {
        return parent;
    }

    /**
     * Sets the parent.
     *
     * @param parentValue
     *            the new parent
     */
    public final void setParent(final Integer parentValue) {
        this.parent = parentValue;
    }

    /*--------------------
     * toString()
     *--------------------*/
    /**
     * Intended only for debugging.
     *
     * <P>Here, a generic implementation uses reflection to print
     * names and values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     */
    @Override
    public final String toString() {
        return "ClusterNode [id=" + id + ", groupName=" + groupName
                + ", groupSize=" + groupSize + ", intraClusterCorrelation="
                + intraClusterCorrelation + ", node=" + node + ", parent="
                + parent + "]";
    }
}
