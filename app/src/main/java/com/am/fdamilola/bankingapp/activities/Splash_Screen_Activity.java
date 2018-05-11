package com.am.fdamilola.bankingapp.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;

public class Splash_Screen_Activity  extends TinyGameAppBaseActivity {

    // Splash screen timer'
    private TextView mSplashText ;
    private static int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        mSplashText = (TextView) findViewById(R.id.splash_text_id);
        Typeface getfont= Typeface.createFromAsset(getAssets(),
                "fonts/Candr___.ttf");
        mSplashText.setTypeface(getfont);



        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */




            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash_Screen_Activity.this, MenuActivity .class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
