package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;
import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class UuidHypothesis.
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
    public UuidHypothesis(byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid hypothesis.
     * 
     * @param hypothesis
     *            the hypothesis
     */
    public UuidHypothesis(Hypothesis hypothesis) {
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
    public UuidHypothesis(byte[] uuid, Hypothesis hypothesis) {
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

    /**
     * Gets the hypothesis.
     * 
     * @return the hypothesis
     */
    public Hypothesis getHypothesis() {
        return hypothesis;
    }

    /**
     * Sets the hypothesis.
     * 
     * @param hypothesis
     *            the new hypothesis
     */
    public void setHypothesis(Hypothesis hypothesis) {
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
    public String toString() {
        return "UuidHypothesis [uuid=" + Arrays.toString(uuid)
                + ", hypothesis=" + hypothesis + "]";
    }
}
