package com.am.fdamilola.bankingapp.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.activities.menu.GameTypeActivity;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;

import butterknife.BindView;

public class Splash_Screen_Activity  extends TinyGameAppBaseActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
    private  final Handler handler = new Handler();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);





        handler.postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash_Screen_Activity.this, Splash_Screen_Activity_2.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //This resolves the memory leak by removing the handler references.

        handler.removeCallbacksAndMessages(null);
    }
}
