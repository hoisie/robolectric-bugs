package com.hoisie.robobugs;

import static org.junit.Assert.assertEquals;

import android.app.Notification;
import android.support.v7.app.NotificationCompat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23)
public class MainActivityTest {
    @Test
    public void testMainActivity() throws Exception {
        Robolectric.setupActivity(MainActivity.class);
        Notification notification = new NotificationCompat.Builder(RuntimeEnvironment
                .application).addAction(android.R.drawable.ic_delete, "title", null).build();
        assertEquals(android.R.drawable.ic_delete, notification.actions[0].icon);
    }
}