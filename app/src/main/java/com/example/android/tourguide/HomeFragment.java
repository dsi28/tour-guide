package com.example.android.tourguide;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        home_fragment_list_adapter recyclerAdapter = new home_fragment_list_adapter(getContext(), homeNewsList);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerAdapter);
        return view;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeNewsList = new ArrayList<>();
        homeNewsList.add(new News(0,"NEWs 1", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 2", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 3", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 4", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 5", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 6", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 7", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 8", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 9", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 10", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 12", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 13", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 14", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 15", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 16", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 17", "urls 1", "ABC"));
        homeNewsList.add(new News(0,"NEWs 18", "urls 1", "ABC"));
    }
}
