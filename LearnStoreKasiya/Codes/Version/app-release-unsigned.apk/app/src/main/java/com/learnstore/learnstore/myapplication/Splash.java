package com.learnstore.learnstore.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread splashTimer = new Thread(){
                   public void run(){
                       try{
                        sleep(3000);

                           Intent menuIntent = new Intent("com.learnstore.learnstore.myapplication.MAINMENU");
                           startActivity(menuIntent);
                       }catch(Exception e){

                       }finally {
                                 finish();
                       }
                   }
        };

               splashTimer.start();
    }


}
