package com.lenjor.tools.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class MD5UtilTest {
    @Test
    public void toMd5() {
        String encryptedPas = "e10adc3949ba59abbe56e057f20f883e";
        assertEquals(encryptedPas, MD5Util.toMd5("123456"));
    }

}