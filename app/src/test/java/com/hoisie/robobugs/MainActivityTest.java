package com.hoisie.robobugs;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    @Test
    public void testMainActivity() throws Exception {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        assertEquals("Hello World!", ((TextView)activity.findViewById(R.id.main_text)).getText());
    }
}