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

// TO-DO: Auto-generated Javadoc
/**
 * List of between participant factor objects to work around Jackson
 * serializaiton issues.
 *
 * @author Uttara Sakhadeo
 *
 */
public class BetweenParticipantFactorList {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The uuid. */
    private byte[] uuid = null;

    /** The between participant factor list. */
    private List<BetweenParticipantFactor> betweenParticipantFactorList = null;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new between participant factor list.
     */
    public BetweenParticipantFactorList() {
    }

    /**
     * Instantiates a new between participant factor list.
     *
     * @param uuid
     *            the uuid
     */
    public BetweenParticipantFactorList(final byte[] uuid) {
        this.uuid = uuid;
    }

    /**
     * Instantiates a new between participant factor list.
     *
     * @param size
     *            the size
     */
    public BetweenParticipantFactorList(final int size) {
        this.betweenParticipantFactorList =
                new ArrayList<BetweenParticipantFactor>(
                size);
    }

    /**
     * Instantiates a new between participant factor list.
     *
     * @param uuid
     *            the uuid
     * @param list
     *            the list
     */
    public BetweenParticipantFactorList(final byte[] uuid,
            final List<BetweenParticipantFactor> list) {
        this.uuid = uuid;
        this.betweenParticipantFactorList = list;
    }

    /**
     * Instantiates a new between participant factor list.
     *
     * @param list
     *            the list
     */
    public BetweenParticipantFactorList(
            final List<BetweenParticipantFactor> list) {
        this.betweenParticipantFactorList = list;
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
     * Gets the between participant factor list.
     *
     * @return the between participant factor list
     */
    public final List<BetweenParticipantFactor>
        getBetweenParticipantFactorList() {
        return betweenParticipantFactorList;
    }

    /**
     * Sets the between participant factor list.
     *
     * @param betweenParticipantFactorList
     *            the new between participant factor list
     */
    public final void setBetweenParticipantFactorList(
            final List<BetweenParticipantFactor> betweenParticipantFactorList) {
        this.betweenParticipantFactorList = betweenParticipantFactorList;
    }

}
