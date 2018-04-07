package com.am.fdamilola.bankingapp.presenter;

import com.am.fdamilola.bankingapp.viewmodels.vm.firstactivity.FirstActivityVM;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by fdamilola on 07/04/2018.
 */
public class FirstActivityPresenterImpl implements FirstActivityPresenter {

    private Unbinder unbinder;
    private FirstActivityVM firstActivityVM;

    private FirstActivityPresenterImpl(FirstActivityVM firstActivityVM) {
        this.firstActivityVM = firstActivityVM;
        this.unbinder = ButterKnife.bind(this.firstActivityVM.getActivity());
    }

    public static FirstActivityPresenterImpl createSingleInstance(FirstActivityVM firstActivityVM) {
        return new FirstActivityPresenterImpl(firstActivityVM);
    }

    @Override
    public void onDestroy() {
        this.firstActivityVM.destroyView();
        this.unbinder.unbind();
    }

    @Override
    public void playRoulette() {
        this.firstActivityVM.playRoulette();
    }
}
