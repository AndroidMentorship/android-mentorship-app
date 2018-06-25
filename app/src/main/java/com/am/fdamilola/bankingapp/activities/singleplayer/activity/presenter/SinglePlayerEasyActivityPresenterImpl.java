package com.am.fdamilola.bankingapp.activities.singleplayer.activity.presenter;


import com.am.fdamilola.bankingapp.activities.singleplayer.activity.vm.SinglePlayerEasyActivityVM;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class SinglePlayerEasyActivityPresenterImpl implements  SinglePlayerEasyActivityPresenter {


    private Unbinder unbinder;
    private SinglePlayerEasyActivityVM singlePlayerEasyActivityVM;


    public static SinglePlayerEasyActivityPresenterImpl createSingleInstance(SinglePlayerEasyActivityVM singlePlayerEasyActivityVM) {
        return new SinglePlayerEasyActivityPresenterImpl(singlePlayerEasyActivityVM);
    }

    private SinglePlayerEasyActivityPresenterImpl (SinglePlayerEasyActivityVM singlePlayerEasyActivityVM) {
        this.singlePlayerEasyActivityVM = singlePlayerEasyActivityVM;
        this.unbinder = ButterKnife.bind(this.singlePlayerEasyActivityVM.getActivity());
    }

    @Override
    public void playRoulette() {
        this.singlePlayerEasyActivityVM.playRoulette();
    }

    @Override
    public void setWhiteColor() {
        this.singlePlayerEasyActivityVM.setWhiteColor();
    }

    @Override
    public void onDestroy() {
        this.singlePlayerEasyActivityVM.destroyView();
        this.unbinder.unbind();
    }
}
