package com.yyh.aescbcsucuritytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private AesEncryptionUtil aesEncryptionUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aesEncryptionUtil = new AesEncryptionUtil();
        String encode = aesEncryptionUtil.encrypt("wx1d0190758beb1b6f", "1234567890123456", "1234567890123456");
        Log.i("huige", "encode=" + encode);
        String decode = aesEncryptionUtil.decrypt(encode, "1234567890123456", "1234567890123456");
        Log.i("huige", "decode=" + decode);

    }
}
