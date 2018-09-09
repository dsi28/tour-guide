package com.example.android.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
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
        Food_Items_Fragment goFood= Food_Items_Fragment.newInstance(position);
        return goFood;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return contx.getString(R.string.tab_eat);
        } else if (position == 1) {
            return contx.getString(R.string.tab_bar);
        } else {
            return contx.getString(R.string.tab_fav);
        }
    }
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}