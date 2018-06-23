package com.am.fdamilola.bankingapp.coordinator;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.Toast;

import com.am.fdamilola.bankingapp.activities.menu.GameLevelActivity;
import com.am.fdamilola.bankingapp.activities.menu.GameTypeActivity;
import com.am.fdamilola.bankingapp.activities.singleplayer.activity.SinglePlayerEasyActivity;

public class MasterCoordinator {



    public static void guessButtonClicked(Context context){
        Intent intent = new Intent(context, GameTypeActivity.class);
        context.startActivity(intent);
    }

    public static void singlePlayerClicked(Context context, @Nullable Object data){
        Intent intent = new Intent(context, GameLevelActivity.class);
        //intent.putExtra(DATA, Gson.to(data))
        context.startActivity(intent);
    }

    public static void multiPlayerClicked(Context context, @Nullable Object data){
        Toast.makeText(context, "This is an empty method", Toast.LENGTH_LONG).show();
    }

    public static void easyLevelClicked(Context context, @Nullable Object data){
       // Toast.makeText(context, "This is an empty method", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(context, SinglePlayerEasyActivity.class);
        context.startActivity(intent);
    }

    public static void mediumLevelClicked(Context context, @Nullable Object data){
        Toast.makeText(context, "This is an empty method", Toast.LENGTH_LONG).show();
    }

    public static void hardLevelClicked(Context context, @Nullable Object data){
        Toast.makeText(context, "This is an empty method", Toast.LENGTH_LONG).show();
    }
}
