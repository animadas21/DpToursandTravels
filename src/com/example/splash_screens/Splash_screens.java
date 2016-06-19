package com.example.splash_screens;

import com.example.splash_screens.MainActivity;
import com.example.splash_screens.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash_screens extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
         
// METHOD 1     
         
         /****** Create Thread that will sleep for 5 seconds *************/        
        Thread background = new Thread() {
            public void run() {
                 
                try {
                    // Thread will sleep for 5 seconds
                    sleep(5*1000);
                     
                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);
                     
                    //Remove activity
                    finish();
                     
                } catch (Exception e) {
                 
                }
            }
        };
         
        // start thread
        background.start();
         
    }
     
    @Override
    protected void onDestroy() {
         
        super.onDestroy();
         
    }
}







