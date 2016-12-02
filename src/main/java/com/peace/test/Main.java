package com.peace.test;

import org.springframework.security.crypto.codec.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by mind on 02/12/2016.
 */
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        System.out.println(String.valueOf(Hex.encode(md5.digest("test123测试".getBytes("GBK")))));
    }
}
