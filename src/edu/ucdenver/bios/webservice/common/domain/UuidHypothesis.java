package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;
import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * This is a wrapper for the Hypothesis object.
 *
 * When user requests create/update a Hypothesis, this wrapper class serves the
 * purpose. User can pass Uuid and Hypothesis object through this wrapper.
 *
 * @author Uttara Sakhadeo .
 */
public class UuidHypothesis implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The uuid. */
    private byte[] uuid;

    /** The hypothesis. */
    private Hypothesis hypothesis;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new uuid hypothesis.
     */
    public UuidHypothesis() {
        super();
    }

    /**
     * Instantiates a new uuid hypothesis.
     *
     * @param uuid
     *            the uuid
     */
    public UuidHypothesis(final byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid hypothesis.
     *
     * @param hypothesis
     *            the hypothesis
     */
    public UuidHypothesis(final Hypothesis hypothesis) {
        super();
        this.hypothesis = hypothesis;
    }

    /**
     * Instantiates a new uuid hypothesis.
     *
     * @param uuid
     *            the uuid
     * @param hypothesis
     *            the hypothesis
     */
    public UuidHypothesis(final byte[] uuid, final Hypothesis hypothesis) {
        super();
        this.uuid = uuid;
        this.hypothesis = hypothesis;
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
     * Gets the hypothesis.
     *
     * @return the hypothesis
     */
    public final Hypothesis getHypothesis() {
        return hypothesis;
    }

    /**
     * Sets the hypothesis.
     *
     * @param hypothesis
     *            the new hypothesis
     */
    public final void setHypothesis(final Hypothesis hypothesis) {
        this.hypothesis = hypothesis;
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
    public final String toString() {
        return "UuidHypothesis [uuid=" + Arrays.toString(uuid)
                + ", hypothesis=" + hypothesis + "]";
    }
}
