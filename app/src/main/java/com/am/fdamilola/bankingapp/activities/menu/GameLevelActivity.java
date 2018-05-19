package com.am.fdamilola.bankingapp.activities.menu;

import android.os.Bundle;
import butterknife.OnClick;
import com.am.fdamilola.bankingapp.R;
import com.am.fdamilola.bankingapp.activities.menu.presenters.GameLevelActivityPresenterImpl;
import com.am.fdamilola.bankingapp.base.classes.TinyGameAppBaseActivity;

public class GameLevelActivity extends TinyGameAppBaseActivity {

    private GameLevelActivityPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level);
        presenter = new GameLevelActivityPresenterImpl(this);
    }

    @OnClick(R.id.easy_level_button)
    protected void easyClicked() {
        presenter.easyClicked();
    }

    @OnClick(R.id.medium_level_button)
    protected void mediumClicked() {
        presenter.mediumClicked();
    }

    @OnClick(R.id.hard_level_button)
    protected void hardClicked() {
        presenter.hardClicked();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
        presenter = null;
    }
}
