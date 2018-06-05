package com.am.fdamilola.bankingapp.activities.menu;

import android.content.Context;
import android.widget.Button;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.activities.menu.presenters.QuoteScreenActivityPresenterImpl;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuoteScreenActivity extends TinyGameAppBaseActivity {
    @BindView(R.id.splash_screen_2_top_quote) public TextView sscreen2_Top_quote;
    @BindView(R.id.splash_screen_2_bottom_quote) public TextView sscreen2TextViewBottom;
    @BindView(R.id.splash_screen_2_button) public Button sscreen2Button;

    private QuoteScreenActivityPresenterImpl presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_2);
        this.presenter = new QuoteScreenActivityPresenterImpl(this);

        Typeface getfont= Typeface.createFromAsset(getAssets(),
                "fonts/nats-regular.ttf");
        sscreen2_Top_quote.setTypeface(getfont);
        sscreen2TextViewBottom.setTypeface(getfont);
        sscreen2Button.setText("Guess");
        sscreen2Button.setTypeface(getfont);
    }


    @OnClick(R.id.splash_screen_2_button)
    protected void guessButtonClicked(){
        this.presenter.guessButtonClicked();
    }

}
