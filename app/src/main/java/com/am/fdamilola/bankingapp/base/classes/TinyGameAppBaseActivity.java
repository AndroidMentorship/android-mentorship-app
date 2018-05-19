package com.am.fdamilola.bankingapp.base.classes;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.am.fdamilola.bankingapp.utils.debug.DebugLog;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public abstract class TinyGameAppBaseActivity extends AppCompatActivity {

    private String className = null;

    public boolean isReady;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Enables full screen view
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        this.logMessage(" onCreate -> ".concat(this.getClassName()));
        this.isReady = true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        className = null;
        this.logMessage(" onDestroy -> ". concat(this.getClassName()));
        this.isReady = false;
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

    //Enable custom font
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
