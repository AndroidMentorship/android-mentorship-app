package com.am.fdamilola.bankingapp.base.classes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.am.fdamilola.bankingapp.debug.utils.DebugLog;


public abstract class BankingAppBaseActivity extends AppCompatActivity {

    private String className = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.logMessage(" onCreate -> ".concat(this.getClassName()));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        className = null;
        this.logMessage(" onDestroy -> ". concat(this.getClassName()));
    }

    protected String getClassName() {
        if  (className != null) {
            return className;
        }
        className = this.getLocalClassName();
        return className;
    }

    protected void logMessage(@Nullable String message) {
        DebugLog.logMessage(message);
    }
}
