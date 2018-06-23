package com.am.fdamilola.bankingapp.activities.menu.presenters;

import com.am.fdamilola.bankingapp.activities.menu.GameLevelActivity;
import com.am.fdamilola.bankingapp.activities.menu.GameTypeActivity;
import com.am.fdamilola.bankingapp.coordinator.MasterCoordinator;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class    GameLevelActivityPresenterImpl implements GameLevelActivityPresenter {

    private GameLevelActivity activity;
    private Unbinder unbinder;

    public GameLevelActivityPresenterImpl(GameLevelActivity activity) {
        this.activity = activity;
        this.unbinder = ButterKnife.bind(this.activity);
    }

    @Override
    public void easyClicked() {
        //Insert MasterCoordinator
        MasterCoordinator.easyLevelClicked(this.activity, null);
    }

    @Override
    public void mediumClicked() {
        MasterCoordinator.mediumLevelClicked(this.activity, null);
    }

    @Override
    public void hardClicked() {
        MasterCoordinator.hardLevelClicked(this.activity, null);
    }

    @Override
    public void onDestroy() {
        if (this.unbinder != null) {
            this.unbinder.unbind();
        }
    }
}
