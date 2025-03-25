package com.hoisie.robobugs;

import static com.google.common.truth.Truth.assertThat;

import android.database.CursorWindow;
import android.widget.TextView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.annotation.SQLiteMode;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 35)
public class MainActivityTest {
  @Test
  public void testMainActivity() throws Exception {
    MainActivity activity = Robolectric.setupActivity(MainActivity.class);
    assertThat(((TextView) activity.findViewById(R.id.main_text)).getText())
        .isEqualTo("Hello World!");
  }

  @SQLiteMode(SQLiteMode.Mode.NATIVE)
  @Test
  public void testCursorWindow() {
    CursorWindow cursorWindow = new CursorWindow("test");
    cursorWindow.close();
  }
}
