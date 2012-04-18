package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;
import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class UuidMatrix.
 */
public class UuidMatrix implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /*--------------------
     * Member Variables
     *--------------------*/
    /** The uuid. */
    private byte[] uuid;

    /** The matrix. */
    private NamedMatrix matrix;

    /*--------------------
     * Constructors
     *--------------------*/
    /**
     * Instantiates a new uuid matrix.
     */
    public UuidMatrix() {
        super();
    }

    /**
     * Instantiates a new uuid matrix.
     * 
     * @param uuid
     *            the uuid
     */
    public UuidMatrix(byte[] uuid) {
        super();
        this.uuid = uuid;
    }

    /**
     * Instantiates a new uuid matrix.
     * 
     * @param matrix
     *            the matrix
     */
    public UuidMatrix(NamedMatrix matrix) {
        super();
        this.matrix = matrix;
    }

    /**
     * Instantiates a new uuid matrix.
     * 
     * @param uuid
     *            the uuid
     * @param matrix
     *            the matrix
     */
    public UuidMatrix(byte[] uuid, NamedMatrix matrix) {
        super();
        this.uuid = uuid;
        this.matrix = matrix;
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
     * Gets the matrix.
     * 
     * @return the matrix
     */
    public NamedMatrix getMatrix() {
        return matrix;
    }

    /**
     * Sets the matrix.
     * 
     * @param matrix
     *            the new matrix
     */
    public void setMatrix(NamedMatrix matrix) {
        this.matrix = matrix;
    }

    /*--------------------
     * toString()
     *--------------------*/
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "UuidMatrix [uuid=" + Arrays.toString(uuid) + ", matrix="
                + matrix + "]";
    }
}
