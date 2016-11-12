package com.hoisie.robobugs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23)
public class MainActivityTest {
    @Test
    public void testMainActivity() throws Exception {
        Robolectric.setupActivity(MainActivity.class);
    }
}