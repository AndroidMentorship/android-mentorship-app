package com.am.fdamilola.bankingapp.activities;

import android.os.Bundle;
import android.view.View;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.base.classes.BankingAppBaseActivity;
import com.am.fdamilola.bankingapp.presenter.FirstActivityPresenterImpl;
import com.am.fdamilola.bankingapp.viewmodels.vm.firstactivity.FirstActivityVM;

import butterknife.BindView;
import butterknife.OnClick;

public class FirstActivity extends BankingAppBaseActivity {

    @BindView(R.id.color_view_one) public View colorViewOne;
    @BindView(R.id.color_view_two) public View colorViewTwo;

    private FirstActivityPresenterImpl presenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        presenter = FirstActivityPresenterImpl.createSingleInstance(new FirstActivityVM(this, savedInstanceState));
    }

    @OnClick(R.id.button_change_color)
    protected void buttonClicked(){
        presenter.playRoulette();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
