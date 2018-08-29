package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    public void onBindViewHolder(ListViewHolder holder, int position) {
        //((ListViewHolder) holder).bindView(position);
        holder.mTextView.setText(newsList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTextView;
        ///private ImageView mImageView;

        public ListViewHolder(View itemView){
            super(itemView);
            mTextView=(TextView) itemView.findViewById(R.id.home_list_item_tv1);
            //mImageView=(ImageView) itemView.findViewById(R.id.home_list_item_iv1);
            itemView.setOnClickListener(this);
        }
        public void onClick(View view){

        }
    }
}
