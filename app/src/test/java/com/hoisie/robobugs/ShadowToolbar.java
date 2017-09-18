package com.hoisie.robobugs;

import android.support.v7.widget.Toolbar;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowViewGroup;

@Implements(value = Toolbar.class, inheritImplementationMethods = true)
public class ShadowToolbar extends ShadowViewGroup {
}