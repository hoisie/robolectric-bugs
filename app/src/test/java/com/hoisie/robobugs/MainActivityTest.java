package com.hoisie.robobugs;

import static com.google.common.truth.Truth.assertThat;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {
    @Test
    public void testMainActivity() throws Exception {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        Shadows.shadowOf(MainActivity.sHandler.getLooper()).runToEndOfTasks();
        assertThat(((TextView) activity.findViewById(R.id.fragment_title)).getText()).isEqualTo
                ("Page 0");
    }
}