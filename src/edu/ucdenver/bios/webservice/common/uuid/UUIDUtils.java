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
package edu.ucdenver.bios.webservice.common.uuid;

import java.util.UUID;

/**
 * Convenience routines for handling UUID's.
 */
public final class UUIDUtils {

    /**
     * Instantiates a new uUID utils.
     */
    private UUIDUtils() {
    }

    /**
     * Return a java.util.UUID as a byte array.
     *
     * @param uuid
     *            the uuid
     * @return byte array
     */
    public static byte[] asByteArray(final UUID uuid) {
        long msb = uuid.getMostSignificantBits();
        long lsb = uuid.getLeastSignificantBits();
        byte[] buffer = new byte[16];

        for (int i = 0; i < 8; i++) {
            buffer[i] = (byte) (msb >>> 8 * (7 - i));
        }
        for (int i = 8; i < 16; i++) {
            buffer[i] = (byte) (lsb >>> 8 * (7 - i));
        }
        return buffer;
    }

    /*
     * public static byte[] hexToBytes(String uuid) { int len = uuid.length();
     * byte[] data = new byte[len / 2]; for (int i = 0; i < len; i += 2) {
     * data[i / 2] = (byte) ((Character.digit(uuid.charAt(i), 16) << 4) +
     * Character.digit(uuid.charAt(i+1), 16)); } return data;
     *
     * }
     *
     * public static String bytesToHex(byte[] uuid) { StringBuffer strbuf = new
     * StringBuffer(uuid.length * 2);
     *
     * for(int i=0; i< uuid.length; i++) { if(((int) uuid[i] & 0xff) < 0x10)
     * strbuf.append("0"); strbuf.append(Long.toString((int) uuid[i] & 0xff,
     * 16)); } return strbuf.toString(); }
     */
}
