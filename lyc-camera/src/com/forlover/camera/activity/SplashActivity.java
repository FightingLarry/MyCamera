package com.forlover.camera.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;

import com.forlover.camera.R;

public class SplashActivity extends FragmentActivity {

    private static final long DELAYMILLIS = 1000;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, DELAYMILLIS);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
