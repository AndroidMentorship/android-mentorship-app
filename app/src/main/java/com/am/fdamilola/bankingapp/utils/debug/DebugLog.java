package com.am.fdamilola.bankingapp.utils.debug;

import android.support.annotation.Nullable;
import android.util.Log;

public class DebugLog {

    public static void logMessage(@Nullable String message) {
        //Why Log.e? You ask. Honestly? It's easier to read is all. The red makes it glaring
        if (message == null) { Log.e("BankingAppDebuglog", "message is null"); }
        Log.e("BankingAppDebuglog", message);
    }

}
