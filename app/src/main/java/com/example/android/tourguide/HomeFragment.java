package com.example.android.tourguide;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private  RecyclerView myRecyclerView;
    private ArrayList<News> homeNewsList;
    public HomeFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.home_fragment_list,container,false);
        myRecyclerView = (RecyclerView) view.findViewById(R.id.home_list_fragment_rv);
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(getActivity());
        home_fragment_list_adapter recyclerAdapter = new home_fragment_list_adapter(getContext(), homeNewsList);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(myRecyclerView.getContext(), myLayoutManager.getOrientation());
        myRecyclerView.addItemDecoration(dividerItemDecoration);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerAdapter);
        return view;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeNewsList = new ArrayList<>();
        homeNewsList.add(new News(R.drawable.as,"Official: Mariano signs for Real Madrid", "https://en.as.com/en/2018/08/29/football/1535566126_578615.html", "AS English", "08/29/2018"));
        homeNewsList.add(new News(0,"Microsoft’s GitHub acquisition now looks likely", "https://thestack.com/cloud/2018/06/04/microsofts-github-acquisition-likely/", "The Stack", "06/04/2018"));
        homeNewsList.add(new News(0,"NEWs 3", "", "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 4",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 5",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 6",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 7",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 8",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 9",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 10",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 12",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 13",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 14",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 15",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 16",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 17",  "ABC", "08/29/2018"));
        homeNewsList.add(new News(0,"NEWs 18",  "ABC", "08/29/2018"));
    }
}
