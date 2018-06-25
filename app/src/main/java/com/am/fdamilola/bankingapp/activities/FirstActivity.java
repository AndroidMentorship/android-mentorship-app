/**package com.am.fdamilola.bankingapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;
import com.am.fdamilola.bankingapp.activities.firstactivity.presenter.FirstActivityPresenterImpl;
import com.am.fdamilola.bankingapp.activities.firstactivity.vm.FirstActivityVM;

import butterknife.BindView;
import butterknife.OnClick;

public class FirstActivity extends TinyGameAppBaseActivity {

    @BindView(R.id.color_view_one) public View colorViewOne;
    @BindView(R.id.color_view_two) public View colorViewTwo;
    @BindView(R.id.button_change_color) public Button bCountDown;

    private FirstActivityPresenterImpl presenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        presenter = FirstActivityPresenterImpl.createSingleInstance(new FirstActivityVM(this, null));
    }

    @OnClick(R.id.button_change_color)
    protected void buttonClicked(){
        presenter.playRoulette();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
        presenter = null;
    }
}**/
