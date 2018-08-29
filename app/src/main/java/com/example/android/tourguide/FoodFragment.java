package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FoodFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View restult= inflater.inflate(R.layout.fragment_food, container, false);
        TabLayout tabLayout = (TabLayout) restult.findViewById(R.id.sliding_tabs);
        ViewPager pager = (ViewPager)restult.findViewById(R.id.viewpager);

        //FoodSimpleFragmentPagerAdapter adapter = new FoodSimpleFragmentPagerAdapter(getSupportFragmentManager(), this);
        pager.setAdapter(buildAdapter());
        // Find the tab layout that shows the tabs
        tabLayout.setupWithViewPager(pager);


        return restult;
    }


    private PagerAdapter buildAdapter(){
        return (new FoodSimpleFragmentPagerAdapter(getChildFragmentManager(), getActivity()));
    }
}
