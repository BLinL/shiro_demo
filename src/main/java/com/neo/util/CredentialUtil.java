package com.neo.util;

import org.apache.shiro.crypto.hash.SimpleHash;

public class CredentialUtil {

  private static final String hashAlgorithmName = "MD5";
  private static final int hashIterations = 2;

  public static String hash(String password, String salt){
    return new SimpleHash(hashAlgorithmName,
        password,
        salt,
        hashIterations).toString();
  }

  public static String hash(String str){
    return new SimpleHash(hashAlgorithmName,str,null,hashIterations).toString();
  }

}
