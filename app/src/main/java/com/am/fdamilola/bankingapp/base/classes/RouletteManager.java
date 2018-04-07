package com.am.fdamilola.bankingapp.base.classes;

import android.os.CountDownTimer;

import com.am.fdamilola.bankingapp.debug.utils.DebugLog;
import com.am.fdamilola.bankingapp.viewmodels.vm.firstactivity.CountingCallback;

import java.util.Random;

public class RouletteManager extends CountDownTimer {

    private String[] array;
    private CountingCallback callback;
    private Random random;
    private int length;

    private RouletteManager(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    public RouletteManager(String[] array, long millisInFuture, long countDownInterval, CountingCallback callback) {
        this(millisInFuture, countDownInterval);
        this.array = array;
        this.callback = callback;
        this.random = new Random();
        this.length = this.array.length;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        String colorOne = this.array[random.nextInt(length)];
        String colorTwo = this.array[random.nextInt(length)];
        this.callback.onNewColor(colorOne, colorTwo);
    }

    @Override
    public void onFinish() {
        onTick(0);
        this.callback.onCountComplete();
    }

    public void startCountDown() {
        DebugLog.logMessage("Starting countdown...");
        this.start();
    }
}
