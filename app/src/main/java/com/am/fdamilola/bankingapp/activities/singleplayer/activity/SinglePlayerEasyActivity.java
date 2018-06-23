package com.am.fdamilola.bankingapp.activities.singleplayer.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.activities.singleplayer.activity.presenter.SinglePlayerEasyActivityPresenterImpl;
import com.am.fdamilola.bankingapp.activities.singleplayer.activity.vm.SinglePlayerEasyActivityVM;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class SinglePlayerEasyActivity extends TinyGameAppBaseActivity {

    private static int  buttonCount = 0;

    @BindView(R.id.color_view_one) public View colorViewOne;
    @BindView(R.id.color_view_two) public View colorViewTwo;
    @BindView(R.id.color_view_three)public View colorViewThree;
    @BindView(R.id.button0_0) public Button buttonRow0col0;
    @BindView(R.id.button0_1) public Button buttonRow0col1;
    @BindView(R.id.button0_2) public Button buttonRow0col2;
    @BindView(R.id.button0_3) public Button buttonRow0col3;
    @BindView(R.id.button0_4) public Button buttonRow0col4;
    @BindView(R.id.button1_0) public Button buttonRow1col0;
    @BindView(R.id.button1_1) public Button buttonRow1col1;
    @BindView(R.id.button1_2) public Button buttonRow1col2;
    @BindView(R.id.button1_3) public Button buttonRow1col3;
    @BindView(R.id.button1_4) public Button buttonRow1col4;
    @BindView(R.id.button2_0) public Button buttonRow2col0;
    @BindView(R.id.button2_1) public Button buttonRow2col1;
    @BindView(R.id.button2_2) public Button buttonRow2col2;
    @BindView(R.id.button2_3) public Button buttonRow2col3;
    @BindView(R.id.button2_4) public Button buttonRow2col4;


    private SinglePlayerEasyActivityPresenterImpl  presenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player_easy);
        presenter = SinglePlayerEasyActivityPresenterImpl.createSingleInstance(new SinglePlayerEasyActivityVM(this, null));
        presenter.playRoulette();
       //presenter.setWhiteColor();
    }

    @OnClick(R.id.button0_0)
    public void checkButton(View view) {
        ColorDrawable buttonColor = (ColorDrawable) buttonRow0col0.getBackground();
        buttonCount +=1;
    }
}
