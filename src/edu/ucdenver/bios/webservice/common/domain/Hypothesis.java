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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.ucdenver.bios.webservice.common.enums.HypothesisTypeEnum;

// TODO: Auto-generated Javadoc
/**
 * This is a wrapper for the Hypothesis information.
 * 
 * @author Uttara Sakhadeo
 * 
 */
public class Hypothesis implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 570635778188633231L;

    /*--------------------
     * Member Variables
     *--------------------*/
    /** The id. */
    private int id;

    /** The type. */
    private HypothesisTypeEnum type;

    /** The between participant factor map list. */
    private List<HypothesisBetweenParticipantMapping> betweenParticipantFactorMapList = null;

    /** The repeated measures map tree. */
    private List<HypothesisRepeatedMeasuresMapping> repeatedMeasuresMapTree = null;

    /** The uuid. */
    private byte[] uuid = null;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new hypothesis.
     */
    public Hypothesis() {
    }

    /**
     * Instantiates a new hypothesis.
     * 
     * @param type
     *            the type
     * @param betweenParticipantFactorMapList
     *            the between participant factor map list
     * @param repeatedMeasuresMapTree
     *            the repeated measures map tree
     */
    public Hypothesis(
            HypothesisTypeEnum type,
            List<HypothesisBetweenParticipantMapping> betweenParticipantFactorMapList,
            List<HypothesisRepeatedMeasuresMapping> repeatedMeasuresMapTree) {
        super();
        this.type = type;
        this.betweenParticipantFactorMapList = betweenParticipantFactorMapList;
        this.repeatedMeasuresMapTree = repeatedMeasuresMapTree;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the id.
     * 
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public HypothesisTypeEnum getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public void setType(HypothesisTypeEnum type) {
        this.type = type;
    }

    /**
     * Gets the between participant factor map list.
     * 
     * @return the between participant factor map list
     */
    public List<HypothesisBetweenParticipantMapping> getBetweenParticipantFactorMapList() {
        return betweenParticipantFactorMapList;
    }

    /**
     * Sets the between participant factor map list.
     * 
     * @param betweenParticipantFactorMapList
     *            the new between participant factor map list
     */
    public void setBetweenParticipantFactorMapList(
            List<HypothesisBetweenParticipantMapping> betweenParticipantFactorMapList) {
        this.betweenParticipantFactorMapList = betweenParticipantFactorMapList;
    }

    /**
     * Gets the repeated measures map tree.
     * 
     * @return the repeated measures map tree
     */
    public List<HypothesisRepeatedMeasuresMapping> getRepeatedMeasuresMapTree() {
        return repeatedMeasuresMapTree;
    }

    /**
     * Sets the repeated measures map tree.
     * 
     * @param repeatedMeasuresMapTree
     *            the new repeated measures map tree
     */
    public void setRepeatedMeasuresMapTree(
            List<HypothesisRepeatedMeasuresMapping> repeatedMeasuresMapTree) {
        this.repeatedMeasuresMapTree = repeatedMeasuresMapTree;
    }

    /**
     * Gets the uuid.
     * 
     * @return the uuid
     */
    public byte[] getUuid() {
        return uuid;
    }

    /**
     * Sets the uuid.
     * 
     * @param uuid
     *            the new uuid
     */
    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
    }

    /*--------------------
     * Return BetweenParticipantFactor list
     *--------------------*/
    /**
     * Gets the between participant factor list.
     * 
     * @return the between participant factor list
     */
    public List<BetweenParticipantFactor> getBetweenParticipantFactorList() {
        List<HypothesisBetweenParticipantMapping> list = this
                .getBetweenParticipantFactorMapList();
        List<BetweenParticipantFactor> betweenParticipantFactorList = new ArrayList<BetweenParticipantFactor>();
        for (HypothesisBetweenParticipantMapping m : list) {
            betweenParticipantFactorList.add(m.getBetweenParticipantFactor());
        }
        return betweenParticipantFactorList;
    }

    /*--------------------
     * Return RepeatedMeasures list
     *--------------------*/
    /**
     * Gets the repeated measures list.
     * 
     * @return the repeated measures list
     */
    public List<RepeatedMeasuresNode> getRepeatedMeasuresList() {
        List<HypothesisRepeatedMeasuresMapping> list = this
                .getRepeatedMeasuresMapTree();
        List<RepeatedMeasuresNode> betweenParticipantFactorList = new ArrayList<RepeatedMeasuresNode>();
        for (HypothesisRepeatedMeasuresMapping m : list) {
            betweenParticipantFactorList.add(m.getRepeatedMeasuresNode());
        }
        return betweenParticipantFactorList;
    }

    /*--------------------
     * toString()
     *--------------------*/
    /**
     * Intended only for debugging.
     * 
     * <P>
     * Here, a generic implementation uses reflection to print names and values
     * of all fields <em>declared in this class</em>. Note that superclass
     * fields are left out of this implementation.
     * 
     * @return the string
     */
    @Override
    public String toString() {
        return "Hypothesis [id=" + id + ", type=" + type
                + ", betweenParticipantFactorMapList="
                + betweenParticipantFactorMapList
                + ", repeatedMeasuresMapTree=" + repeatedMeasuresMapTree
                + ", uuid=" + Arrays.toString(uuid) + "]";
    }
}
