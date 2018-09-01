package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Food_Items_Fragment extends Fragment {
    private int position;
    private ArrayList<Eat> eatList;
    public Food_Items_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_fav,container,false);
        if(getArguments() !=null){
            position = getArguments().getInt("argsPos");
        }
        switch (position){
            case 0:

                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }


        return view;
    }
}
