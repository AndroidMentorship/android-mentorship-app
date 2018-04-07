package com.am.fdamilola.bankingapp;

import com.am.fdamilola.bankingapp.activities.FirstActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;


@RunWith(RobolectricTestRunner.class)
public class FirstActivitySampleTest {

    @Test
    public void sampleTest() {
        FirstActivity activity = Robolectric.setupActivity(FirstActivity.class);
        assertTrue(activity.isReady);
    }

}