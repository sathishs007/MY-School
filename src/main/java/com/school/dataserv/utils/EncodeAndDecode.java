/**
 *
 */
package com.school.dataserv.utils;

import java.util.Base64;


/**
 * @author sathsubramanian
 */
public class EncodeAndDecode {
public static void main(String args[]) {
	System.out.println(encodePassword("test"));;
}
    public static String encodePassword(final String password) {
        final Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(password.getBytes());

    }

    public static String decodePassword(final String password) {
        final Base64.Decoder decoder = Base64.getUrlDecoder();
        return new String(decoder.decode(password));

    }
}
