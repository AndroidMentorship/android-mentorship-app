/**package com.am.fdamilola.bankingapp.activities.firstactivity.presenter;

import com.am.fdamilola.bankingapp.activities.firstactivity.vm.FirstActivityVM;

import butterknife.ButterKnife;
import butterknife.Unbinder;


// * Created by fdamilola on 07/04/2018.

public class FirstActivityPresenterImpl implements FirstActivityPresenter {

    private Unbinder unbinder;
    private FirstActivityVM firstActivityVM;

    public static FirstActivityPresenterImpl createSingleInstance(FirstActivityVM firstActivityVM) {
        return new FirstActivityPresenterImpl(firstActivityVM);
    }

    private FirstActivityPresenterImpl(FirstActivityVM firstActivityVM) {
        this.firstActivityVM = firstActivityVM;
        this.unbinder = ButterKnife.bind(this.firstActivityVM.getActivity());
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
 */