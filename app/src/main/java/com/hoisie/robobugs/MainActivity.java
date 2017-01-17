package com.hoisie.robobugs;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    static final HandlerThread sHandlerThread = new HandlerThread("handlerThread");
    static final Handler sHandler;

    private MyAdapter mAdapter;
    private ViewPager mPager;

    static {
        sHandlerThread.start();
        sHandler = new Handler(sHandlerThread.getLooper());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MyAdapter(getSupportFragmentManager());
        sHandler.post(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mPager = (ViewPager) findViewById(R.id.view_pager);
                        mPager.setAdapter(mAdapter);
                        mPager.setCurrentItem(0);
                    }
                });
            }
        });
    }

    public static class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Fragment getItem(int position) {
            return ViewPagerFragment.newInstance(position);
        }
    }
}
