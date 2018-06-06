package com.am.fdamilola.bankingapp;

import com.am.fdamilola.bankingapp.activities.FirstActivity;
import com.am.fdamilola.bankingapp.activities.firstactivity.vm.FirstActivityVM;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class ViewModelTests {

    @Test
    public void testFirstActivityViewModelCreation() {
        FirstActivity activity = Robolectric.setupActivity(FirstActivity.class);
        FirstActivityVM vm = new FirstActivityVM(activity, null);
        assertTrue(vm.getActivity() != null);
    }


    @Test
    public void testViewModelDestruction() {
        FirstActivity activity = Robolectric.setupActivity(FirstActivity.class);
        FirstActivityVM vm = new FirstActivityVM(activity, null);
        vm.destroyView();
        assertTrue(vm.getActivity() == null);
    }
}
