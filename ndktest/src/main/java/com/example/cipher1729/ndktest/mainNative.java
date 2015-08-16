package com.example.cipher1729.ndktest;

/**
 * Created by cipher1729 on 8/15/2015.
 */
public class mainNative {

    private static final String TAG = "MainNative";
    private static native int callWithArguments(String deviceName, int width, int height);
    static{
        System.loadLibrary("ndktest");
    }
    public mainNative() {
//TODO implement a useful constructor
    }
    public static  int callNativeMethod(String deviceName, int width, int height) {
        return callWithArguments(deviceName, width, height);
    }
}
