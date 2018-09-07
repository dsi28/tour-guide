package com.example.android.tourguide;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class Food_Items_Fragment extends Fragment {
    private static final String ARG_POS = "argPos";
    private int pagePosition;
    private ArrayList<Eat> eatList;

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
        ButterKnife.bind(this, view);
        if(getArguments() !=null){
            pagePosition = getArguments().getInt(ARG_POS);
            //setEatList();
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.food_fav_rv);
        final food_Eat_Adapter recyclerAdapter =  new food_Eat_Adapter(getContext(), eatList, pagePosition);
        recyclerAdapter.notifyDataSetChanged();
        final LinearLayoutManager myLayoutManager =new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(myLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), myLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.setOnItemClickListener(new food_Eat_Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                eatList.get(position).setName("yo, Adrian");
                eatList.get(position).setFav(true);
                recyclerAdapter.notifyItemChanged(position);
                recyclerAdapter.notifyItemChanged(position);
                Toast.makeText(getContext(),eatList.get(position).getName(),Toast.LENGTH_LONG).show();
            }
            @Override
            public void onStarClick(int position) {
                eatList.get(position).setFav(true);
                recyclerAdapter.notifyItemChanged(position);
                Toast.makeText(getContext(),eatList.get(position).getName()+"\n"+ eatList.get(position).getFav(),Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setEatList();
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
}
