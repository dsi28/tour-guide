package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.ivbaranov.mli.MaterialLetterIcon;

import java.util.ArrayList;
import java.util.List;

public class home_fragment_list_adapter extends RecyclerView.Adapter<home_fragment_list_adapter.ListViewHolder> {

    Context mContext;
    ArrayList<News> newsList;

    public home_fragment_list_adapter(Context mContext, ArrayList<News> newsList) {
        this.mContext = mContext;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_fragment_list_item,parent,false);
        View view  = LayoutInflater.from(mContext).inflate(R.layout.home_fragment_list_item, parent,false);
        ListViewHolder vHolder = new ListViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, final int position) {
        //((ListViewHolder) holder).bindView(position);
        holder.mIcon.setLetter(newsList.get(position).getNewStation());
        holder.mTextView.setText(newsList.get(position).getTitle());
        holder.mStationTV.setText(newsList.get(position).getNewStation());
        //holder.mIconIV.setImageResource(newsList.get(position).getPic());
        holder.mDateTv.setText(newsList.get(position).getDisplayDate());

        holder.parentCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!newsList.get(position).getLinkURL().equals("")){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(newsList.get(position).getLinkURL()));
                    mContext.startActivity(browserIntent);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTextView;
        private TextView mStationTV;
        private com.github.ivbaranov.mli.MaterialLetterIcon mIcon;
        private TextView mDateTv;
        private ConstraintLayout parentCS;
        private Context context;
        ///private ImageView mImageView;

        public ListViewHolder(View itemView){
            super(itemView);
            mIcon = (com.github.ivbaranov.mli.MaterialLetterIcon) itemView.findViewById(R.id.materialLetterIcon);
            mTextView=(TextView) itemView.findViewById(R.id.home_list_item_tv1);
            mStationTV=(TextView) itemView.findViewById(R.id.home_list_item_tv2);
            //mIconIV=(ImageView) itemView.findViewById(R.id.home_list_item_iv1);
            mDateTv= (TextView) itemView.findViewById(R.id.home_list_item_date_tv3);
            parentCS=(ConstraintLayout) itemView.findViewById(R.id.home_fragment_list_item);
            //mImageView=(ImageView) itemView.findViewById(R.id.home_list_item_iv1);
            context=itemView.getContext();
            itemView.setOnClickListener(this);
        }
        public void onClick(View view){

        }
    }
}
