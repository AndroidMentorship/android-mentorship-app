package com.am.fdamilola.bankingapp.coordinator;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.am.fdamilola.bankingapp.activities.menu.GameLevelActivity;

public class MasterCoordinator {

    public static void singlePlayerClicked(Context context, @Nullable Object data){
        Intent intent = new Intent(context, GameLevelActivity.class);
        //intent.putExtra(DATA, Gson.to(data))
        context.startActivity(intent);
    }

    public static void multiPlayerClicked(Context context, @Nullable Object data){
        Toast.makeText(context, "This is an empty method", Toast.LENGTH_LONG).show();
    }

    public static void easyLevelClicked(Context context, @Nullable Object data){
        Toast.makeText(context, "This is an empty method", Toast.LENGTH_LONG).show();
    }

    public static void mediumLevelClicked(Context context, @Nullable Object data){
        Toast.makeText(context, "This is an empty method", Toast.LENGTH_LONG).show();
    }

    public static void hardLevelClicked(Context context, @Nullable Object data){
        Toast.makeText(context, "This is an empty method", Toast.LENGTH_LONG).show();
    }
}
