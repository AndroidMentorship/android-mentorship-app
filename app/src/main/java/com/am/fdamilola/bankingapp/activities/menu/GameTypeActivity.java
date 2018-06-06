package com.am.fdamilola.bankingapp.activities.menu;

import android.os.Bundle;

import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;
import com.am.fdamilola.bankingapp.activities.menu.presenters.GameTypeActivityPresenterImpl;

import butterknife.OnClick;

public class GameTypeActivity extends TinyGameAppBaseActivity {

    private GameTypeActivityPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.presenter = new GameTypeActivityPresenterImpl(this);
    }

    @OnClick(R.id.single_player_button)
    protected void onSinglePlayerClick(){
        this.presenter.singlePlayerClicked();
    }

    @OnClick(R.id.multi_player_button)
    protected void onMultiPlayerClick() {
        this.presenter.multiPlayerClicked();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
        this.presenter = null;
    }
}
