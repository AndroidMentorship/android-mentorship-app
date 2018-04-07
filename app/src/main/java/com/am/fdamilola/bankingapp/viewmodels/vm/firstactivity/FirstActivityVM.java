package com.am.fdamilola.bankingapp.viewmodels.vm.firstactivity;

import android.graphics.Color;
import android.support.annotation.Nullable;

import com.am.fdamilola.bankingapp.activities.FirstActivity;
import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.base.classes.ViewModelInterface;
import com.am.fdamilola.bankingapp.debug.utils.DebugLog;
import com.am.fdamilola.bankingapp.base.classes.RouletteManager;

public class FirstActivityVM implements ViewModelInterface, CountingCallback {

    private FirstActivity activity;
    private RouletteManager rouletteManager;

    public FirstActivityVM(FirstActivity activity, @Nullable Object data) {
        this.activity = activity;
        final String[] allColors = this.activity.getResources().getStringArray(R.array.colors);
        this.rouletteManager = new RouletteManager(allColors, 20000, 500, this);
    }

    //Private methods
    private void animateViews() {
        activity.colorViewOne.setAlpha(0f);
        activity.colorViewTwo.setAlpha(0f);

        activity.colorViewOne.animate().alpha(1f).setDuration(5000);
        activity.colorViewTwo.animate().alpha(1f).setDuration(5000);
    }


    //Public Methods
    public FirstActivity getActivity() {
        return activity;
    }

    public void playRoulette() {
        this.rouletteManager.startCountDown();
    }

    @Override
    public void destroyView() {
        this.activity = null;
        this.rouletteManager = null;
    }

    @Override
    public void onNewColor(String colorOneCode, String colorTwoCode) {
        this.activity.colorViewOne.setBackgroundColor(Color.parseColor(colorOneCode));
        this.activity.colorViewTwo.setBackgroundColor(Color.parseColor(colorTwoCode));
    }

    @Override
    public void onCountComplete() {
        DebugLog.logMessage("Count complete");
        this.animateViews();
    }
}
