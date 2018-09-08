package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Activ_Info_Fragment extends Fragment{
    private static final String ARG_ACTIV="argActiv";
    private Activ act;
    private TextView name;
    private TextView desc;
    private TextView addy;

    public static Activ_Info_Fragment newInstance(Activ act){
        Activ_Info_Fragment fragment = new Activ_Info_Fragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_ACTIV,act);
        fragment.setArguments(args);
        return fragment;
    }

    public Activ_Info_Fragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activ_info, container, false);
        if(getArguments() !=null){
            name = (TextView) view.findViewById(R.id.activ_info_name_tv);
            desc = (TextView) view.findViewById(R.id.activ_info_desc_tv);
            addy = (TextView) view.findViewById(R.id.activ_info_addy_tv);
            act= getArguments().getParcelable(ARG_ACTIV);
            name.setText(act.getName());
            desc.setText(act.getDesc());
            addy.setText(act.getAddress());
        }
        return view;
    }


    private void linkViews(){

    }
}
