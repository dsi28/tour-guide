package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FoodSimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    Context contx = null;

    public FoodSimpleFragmentPagerAdapter(FragmentManager fm, Context contx) {
        super(fm);
        this.contx=contx;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ItalianFragment();
        } else if (position == 1){
            return new LatinFragment();
        } else  {
            return new AmericanFragment();
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return contx.getString(R.string.tab_italian);
        } else if (position == 1) {
            return contx.getString(R.string.tab_latin);
        } else {
            return contx.getString(R.string.tab_American);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

}