package com.example.cipher1729.ndktest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.cipher1729.ndktest.mainNative;
import com.example.cipher1729.testndk.R;
/**
 * Created by cipher1729 on 8/15/2015.
 */
public class ndkCall extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d("retVal", Integer.toString(mainNative.callNativeMethod("nexus", 320, 240)));
    }
}
