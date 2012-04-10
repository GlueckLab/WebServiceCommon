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

/**
 * This is a wrapper for the Hypothesis information.
 * @author Uttara Sakhadeo
 *
 */
import java.io.Serializable;

import edu.ucdenver.bios.webservice.common.enums.HypothesisTrendTypeEnum;

/**
 * The Class HypothesisBetweenParticipantMapping.
 */
public class HypothesisBetweenParticipantMapping implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The type. */
    private HypothesisTrendTypeEnum type = null;

    /** The between participant factor. */
    private BetweenParticipantFactor betweenParticipantFactor = null;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new hypothesis between participant mapping.
     */
    public HypothesisBetweenParticipantMapping() {
    }

    /**
     * Instantiates a new hypothesis between participant mapping.
     *
     * @param type
     *            the type
     * @param betweenParticipantFactor
     *            the between participant factor
     */
    public HypothesisBetweenParticipantMapping(final HypothesisTrendTypeEnum type,
            final BetweenParticipantFactor betweenParticipantFactor) {
        super();
        this.type = type;
        this.betweenParticipantFactor = betweenParticipantFactor;
    }

    /*--------------------
     * Getter/Setter Methods
     *--------------------*/
    /**
     * Gets the type.
     *
     * @return the type
     */
    public final HypothesisTrendTypeEnum getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type
     *            the new type
     */
    public final void setType(final HypothesisTrendTypeEnum type) {
        this.type = type;
    }

    /**
     * Gets the between participant factor.
     *
     * @return the between participant factor
     */
    public final BetweenParticipantFactor getBetweenParticipantFactor() {
        return betweenParticipantFactor;
    }

    /**
     * Sets the between participant factor.
     *
     * @param betweenParticipantFactor
     *            the new between participant factor
     */
    public final void setBetweenParticipantFactor(
            final BetweenParticipantFactor betweenParticipantFactor) {
        this.betweenParticipantFactor = betweenParticipantFactor;
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
        return "HypothesisBetweenParticipantMapping [type=" + type
                + ", betweenParticipantFactor=" + betweenParticipantFactor
                + "]";
    }
}
