package com.bliu.sd.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

public class SHAHelper {

    private SHAHelper(){}

    private static final String ALGORITH_NAME = "SHA-256";

    public static String encrypt(String string){
       return new SimpleHash(ALGORITH_NAME,string).toHex();
    }

    public static void main(String[] args) {
        System.out.println(SHAHelper.encrypt("123"));
    }
}
