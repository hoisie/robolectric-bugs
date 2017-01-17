package com.hoisie.robobugs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ViewPagerFragment extends Fragment {
    public static ViewPagerFragment newInstance(int num) {
        ViewPagerFragment f = new ViewPagerFragment();
        Bundle args = new Bundle();
        args.putInt("num", num);
        f.setArguments(args);
        return f;
    }

    public ViewPagerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_pager, container, false);
        int num = getArguments().getInt("num");
        ((TextView) view.findViewById(R.id.fragment_title)).setText("Page " + num);
        return view;
    }
}
