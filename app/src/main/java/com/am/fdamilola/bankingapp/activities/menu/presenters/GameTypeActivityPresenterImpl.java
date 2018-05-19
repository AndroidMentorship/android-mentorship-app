package com.am.fdamilola.bankingapp.activities.menu.presenters;


import com.am.fdamilola.bankingapp.activities.menu.GameTypeActivity;
import com.am.fdamilola.bankingapp.coordinator.MasterCoordinator;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class GameTypeActivityPresenterImpl implements GameTypeActivityPresenter {

    private GameTypeActivity activity;
    private Unbinder unbinder;

    public GameTypeActivityPresenterImpl(GameTypeActivity activity) {
        this.activity = activity;
        this.unbinder = ButterKnife.bind(this.activity);
    }

    @Override
    public void singlePlayerClicked() {
        MasterCoordinator.singlePlayerClicked(this.activity, null);
    }

    @Override
    public void multiPlayerClicked() {
        MasterCoordinator.multiPlayerClicked(this.activity, null);
    }

    @Override
    public void onDestroy() {
        if (this.unbinder != null) {
            this.unbinder.unbind();
        }
    }
}
