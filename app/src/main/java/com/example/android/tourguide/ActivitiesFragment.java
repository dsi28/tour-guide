package com.example.android.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {
    ArrayList<Activ> acts;
    Context mContext;
    public ActivitiesFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activities, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.activity_rv);
        int numberOfColumns =2;
        activity_fragment_adapter recyclerAdpater = new activity_fragment_adapter(getContext(), acts);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));
        boolean includeEdge = true;
        recyclerView.setAdapter(recyclerAdpater);
        recyclerAdpater.setOnItemClickListener(new activity_fragment_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Activ_Info_Fragment nextFrag= new Activ_Info_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activ_rv, nextFrag,"findThisFragment")
                        .addToBackStack(null)
                        .commit();
                //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.activity_rv, new Activ_Info_Fragment()).commit();
            }
        });
        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acts= new ArrayList<>();
        acts.add(new Activ("Act 1", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 2", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 3", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 4", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 5", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 6", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 7", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 8", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 9", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 10", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 11", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 12", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 13", "This is Act 1", "Locat act1"));
        acts.add(new Activ("Act 14", "This is Act 1", "Locat act1"));
    }
}
