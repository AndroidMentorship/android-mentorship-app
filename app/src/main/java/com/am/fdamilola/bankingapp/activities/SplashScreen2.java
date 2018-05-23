package com.am.fdamilola.bankingapp.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.activities.menu.GameTypeActivity;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class SplashScreen2 extends TinyGameAppBaseActivity {
    @BindView(R.id.splash_screen_2_textView_top) public TextView Sscreen2TextViewTop;
    @BindView(R.id.splash_screen_2_textView_bottom) public TextView Sscreen2TextViewBottom;
    @BindView(R.id.splash_screen_2_button) public Button Sscreen2Button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_2);


        Typeface getfont= Typeface.createFromAsset(getAssets(),
                             "fonts/nats-regular.ttf");
               Sscreen2TextViewTop.setTypeface(getfont);
               Sscreen2TextViewBottom.setTypeface(getfont);
               Sscreen2Button.setText("Guess");
               Sscreen2Button.setTypeface(getfont);
    }


    @OnClick(R.id.splash_screen_2_button)
    public void wakeButtonClick(View v) {
        Intent intent = new Intent(SplashScreen2.this, GameTypeActivity.class);
        startActivity(intent);
    }
}
