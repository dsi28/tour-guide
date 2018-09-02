package com.example.android.tourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class Food_Items_Fragment extends Fragment {
    private static final String ARG_POS = "argPos";
    private int position;
    private ArrayList<Eat> eatList;
    private ArrayList<Eat> displayEatList;

    public static Food_Items_Fragment newInstance(int pos){
        Food_Items_Fragment fragment = new Food_Items_Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POS, pos);
        fragment.setArguments(args);
        return fragment;
    }

    public Food_Items_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_fav,container,false);
        if(getArguments() !=null){
            position = getArguments().getInt(ARG_POS);
            setEatList();
            displayEatItems();
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.food_fav_rv);
        food_Eat_Adapter recyclerAdapter =  new food_Eat_Adapter(getContext(), displayEatList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerAdapter);
        return view;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //displayEatItems();
    }

    private void setEatList(){
        eatList= new ArrayList<>();
        eatList.add(new Eat(0, "Res 1", 10, false));
        eatList.add(new Eat(1, "Bar 1", 10, false));
        eatList.add(new Eat(0, "Res 2", 10, false));
        eatList.add(new Eat(1, "Bar 2", 10, false));
        eatList.add(new Eat(0, "Res 3", 10, false));
        eatList.add(new Eat(0, "Res 4", 10, false));
        eatList.add(new Eat(0, "Res 5", 10, false));
        eatList.add(new Eat(1, "Bar 3", 10, false));
        eatList.add(new Eat(1, "Bar 4", 10, false));
        eatList.add(new Eat(1, "Bar 5", 10, false));
        eatList.add(new Eat(0, "Res 6", 10, false));
        eatList.add(new Eat(1, "Bar 6", 10, true));
    }
    private void displayEatItems(){
        displayEatList=new ArrayList<>();
        for (Eat e: eatList) {
            if(position==2 && e.getFav()){
                displayEatList.add(e);
            }else if(position != 2 && e.getType()== position){
                displayEatList.add(e);
            }
        }
    }
}
