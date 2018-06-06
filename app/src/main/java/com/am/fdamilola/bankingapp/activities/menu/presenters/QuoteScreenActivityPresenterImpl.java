package com.am.fdamilola.bankingapp.activities.menu.presenters;

import com.am.fdamilola.bankingapp.activities.menu.QuoteScreenActivity;
import com.am.fdamilola.bankingapp.coordinator.MasterCoordinator;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class QuoteScreenActivityPresenterImpl implements  QuoteScreenActivityPresenter{

    private QuoteScreenActivity activity;
    private Unbinder unbinder;

    public  QuoteScreenActivityPresenterImpl(QuoteScreenActivity activity){
        this.activity=activity;
        this.unbinder= ButterKnife.bind(this.activity);
    }

    @Override
    public void guessButtonClicked(){
        MasterCoordinator.guessButtonClicked(this.activity);
    }



    @Override
    public void onDestroy() {
        if (this.unbinder != null) {
            this.unbinder.unbind();
        }
}

}