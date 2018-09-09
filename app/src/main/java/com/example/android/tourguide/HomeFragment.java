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
        homeNewsList.add(new News("Official: Mariano signs for Real Madrid", "https://en.as.com/en/2018/08/29/football/1535566126_578615.html", "AS English", "08/29/2018"));
        homeNewsList.add(new News("Microsoft’s GitHub acquisition now looks likely", "https://thestack.com/cloud/2018/06/04/microsofts-github-acquisition-likely/", "The Stack", "06/04/2018"));
        homeNewsList.add(new News("Thousands march in Barcelona against Catalan secession", "https://abcnews.go.com/International/wireStory/thousands-march-barcelona-catalan-secession-57705341", "ABC News", "09/09/2018"));
        homeNewsList.add(new News("Tourist crackdown backfires: Barcelona hotels in crisis as income plummets 20 PERCENT", "https://www.express.co.uk/news/world/1014399/barcelona-hotel-holiday-tourist-protest-crackdown-spain-news", "Express", "09/08/2018"));
        homeNewsList.add(new News("Pogba? De Jong? Barça need to focus on the academy", "https://www.sport-english.com/en/news/opinion/pogba-de-jong-barca-need-to-focus-on-the-academy-7024151", "Sport English", "09/08/2018"));
        homeNewsList.add(new News("Gaudi Basilica construction enters final stage","https://www.bbc.com/news/av/world-europe-34599879/gaudi-basilica-construction-enters-final-stage",  "BBC", "10/22/2015"));
        homeNewsList.add(new News("Don’t blame Airbnb for rise in rents", "https://www.theguardian.com/technology/2018/sep/04/dont-blame-airbnb-for-rise-in-rents","The Guardian", "09/04/2018"));
        homeNewsList.add(new News("NEWs 8",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 9",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 10",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 12",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 13",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 14",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 15",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 16",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 17",  "ABC", "08/29/2018"));
        homeNewsList.add(new News("NEWs 18",  "ABC", "08/29/2018"));
    }
}
