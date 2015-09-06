package com.learnstore.learnstore.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class Splash extends Activity {

    protected Intent menuIntent = new Intent("com.learnstore.learnstore.myapplication.MAINMENU");
    protected boolean tStop = true;
    Thread splashTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashTimer = new Thread() {
            public void run() {
                try {
                    synchronized (this) {
                        wait(3000);
                    }

                } catch (Exception e) {

                } finally {
                    startActivity(menuIntent);
                    finish();
                }
            }
        };

        splashTimer.start();
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            synchronized (splashTimer) {
                splashTimer.notify();
            }

        } return true;
    }

}