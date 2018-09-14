package com.test.robono;

import static org.junit.Assert.*;

import android.os.Handler;
import android.os.Messenger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class RoboTest {
  @Test
  public void testBinder() {
    Handler handler = new Handler();
    Messenger messenger = new Messenger(new Messenger(handler).getBinder());
  }
}
