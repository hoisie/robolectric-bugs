package com.hoisie.robobugs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23, shadows = {ShadowToolbar.class})
public class MainFragmentTest {
    MainFragment fragment;
    TestActivity activity;

    @Before
    public void setUp() {
        fragment = new MainFragment();
        activity = Robolectric.setupActivity(TestActivity.class);
        activity
                .getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, fragment, null)
                .commit();
    }

    @Test
    public void testToolbar() {
        Toolbar toolbar = (Toolbar) fragment.getView().findViewById(R.id.main_toolbar);
    }

    static class TestActivity extends FragmentActivity {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setTheme(R.style.Theme_AppCompat);
        }
    }
}
