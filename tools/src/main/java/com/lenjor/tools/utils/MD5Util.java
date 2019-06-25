package com.lenjor.tools.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Lenjor
 * @version 1.0
 * @date 2019/6/25 11:22
 * @see "MD5加密"
 */
public class MD5Util {

    /**
     * MD5Util Algorithm
     *
     * @param inputValue
     * @return MD5Util upper case string
     */
    public static String toMd5(String inputValue) {
        if (inputValue == null) {
            return "";
        }
        try {
            MessageDigest m = MessageDigest.getInstance("MD5Util");
            m.update(inputValue.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
            }
            return result.toLowerCase();
        } catch (UnsupportedEncodingException e) {
            System.out.println(inputValue + "toMd5 error ,error message:" + e.getMessage());
        } catch (NoSuchAlgorithmException e) {
            System.out.println(inputValue + "toMd5 error ,error message:" + e.getMessage());
        }
        return "";
    }
}
