package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;
import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class UuidCovariance.
 */
public class UuidCovariance implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The uuid. */
    private byte[] uuid;

    /** The covariance. */
    private Covariance covariance;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new uuid covariance.
     */
    public UuidCovariance() {
        super();
    }

    /**
     * Instantiates a new uuid covariance.
     * 
     * @param uuid
     *            the uuid
     */
    public UuidCovariance(byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid covariance.
     * 
     * @param covariance
     *            the covariance
     */
    public UuidCovariance(Covariance covariance) {
        super();
        this.covariance = covariance;
    }

    /**
     * Instantiates a new uuid covariance.
     * 
     * @param uuid
     *            the uuid
     * @param covariance
     *            the covariance
     */
    public UuidCovariance(byte[] uuid, Covariance covariance) {
        super();
        this.uuid = uuid;
        this.covariance = covariance;
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
     * Gets the covariance.
     * 
     * @return the covariance
     */
    public Covariance getCovariance() {
        return covariance;
    }

    /**
     * Sets the covariance.
     * 
     * @param covariance
     *            the new covariance
     */
    public void setCovariance(Covariance covariance) {
        this.covariance = covariance;
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
        return "UuidCovariance [uuid=" + Arrays.toString(uuid)
                + ", covariance=" + covariance + "]";
    }
}
