package com.am.fdamilola.bankingapp.activities.singleplayer.activity.vm;

import android.graphics.Color;
import android.support.annotation.Nullable;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.activities.firstactivity.vm.CountingCallback;
import com.am.fdamilola.bankingapp.activities.singleplayer.activity.SinglePlayerEasyActivity;
import com.am.fdamilola.bankingapp.base.classes.RouletteManager;
import com.am.fdamilola.bankingapp.base.classes.ViewModelInterface;
import com.am.fdamilola.bankingapp.utils.debug.DebugLog;

public class SinglePlayerEasyActivityVM implements ViewModelInterface,CountingCallback {

    private SinglePlayerEasyActivity activity;
    private RouletteManager rouletteManager;

    public SinglePlayerEasyActivityVM(SinglePlayerEasyActivity activity, @Nullable Object data) {
        this.activity = activity;
        final String[] allColors = this.activity.getResources().getStringArray(R.array.colors);
        this.rouletteManager = new RouletteManager(allColors, 20000, 500, this);
    }

    private void animateViews() {
       activity.colorViewOne.setAlpha(0f);
       activity.colorViewTwo.setAlpha(0f);
       activity.colorViewThree.setAlpha(0f);

       activity.colorViewOne.animate().alpha(1f).setDuration(5000);
       activity.colorViewTwo.animate().alpha(1f).setDuration(5000);
       activity.colorViewThree.animate().alpha(1f).setDuration(5000);
    }


    //Public Methods
    public SinglePlayerEasyActivity getActivity() {
        return activity;
    }

    public void playRoulette() {
        this.rouletteManager.startCountDown();
    }

    public void setWhiteColor(){
        this.activity.colorViewOne.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.activity.colorViewTwo.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.activity.colorViewThree.setBackgroundColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onNewColor(String colorOneCode, String colorTwoCode, String colorThreeCode) {
        this.activity.colorViewOne.setBackgroundColor(Color.parseColor(colorOneCode));
        this.activity.colorViewTwo.setBackgroundColor(Color.parseColor(colorTwoCode));
        this.activity.colorViewThree.setBackgroundColor(Color.parseColor(colorThreeCode));
    }




    @Override
    public void onCountComplete() {
        DebugLog.logMessage("Count complete");
        this.animateViews();
    }

    @Override
    public void destroyView() {
        this.activity = null;
        this.rouletteManager = null;
    }
}
