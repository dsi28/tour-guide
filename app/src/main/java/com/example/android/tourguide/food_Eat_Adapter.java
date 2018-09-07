package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class food_Eat_Adapter extends RecyclerView.Adapter<food_Eat_Adapter.FoodEatViewHolder>{
    Context mContext;
    public static ArrayList<Eat> eatList;
    private OnItemClickListener mListener;
    private int pagePos;

    public interface OnItemClickListener{
        void onItemClick(int position);
        void onStarClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener= listener;
    }

    public food_Eat_Adapter(Context mContext, ArrayList<Eat> eatList, int pagePos) {
        this.mContext = mContext;
        this.eatList = eatList;
        this.pagePos=pagePos;
    }

    @NonNull
    @Override
    public FoodEatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.food_fragment_eat_item,parent,false);
        FoodEatViewHolder vHolder = new FoodEatViewHolder(view, mListener);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(final FoodEatViewHolder holder, int position) {
            if(eatList.get(position).getFav()){
                holder.mEatNotFav.setVisibility(View.GONE);
                holder.mEatFav.setVisibility(View.VISIBLE);
            } else {
                holder.mEatNotFav.setVisibility(View.VISIBLE);
                holder.mEatFav.setVisibility(View.GONE);
            }
        if(pagePos!=2 && pagePos==eatList.get(position).getType()){
            holder.mEatName.setText(eatList.get(position).getName());
            holder.mEatRating.setText(eatList.get(position).getRating());
        }else if(pagePos==2 && eatList.get(position).getFav()){
            holder.mEatName.setText(eatList.get(position).getName());
            holder.mEatRating.setText(eatList.get(position).getRating());
        }else {
            holder.itemView.setVisibility(View.GONE);
            holder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0,0));
        }
    }

    @Override
    public int getItemCount() {
        return eatList.size();
    }



    public static class FoodEatViewHolder extends RecyclerView.ViewHolder{
        public Context context;
        private TextView mEatName;
        private TextView mEatRating;
        private ImageView mEatFav;
        private ImageView mEatNotFav;

        public FoodEatViewHolder(View itemView, final OnItemClickListener listener){
            super(itemView);
            this.context= context;
            mEatName =(TextView) itemView.findViewById(R.id.food_eat_name_tv);
            mEatRating=(TextView) itemView.findViewById(R.id.food_eat_rating_tv);
            mEatFav= (ImageView) itemView.findViewById(R.id.food_eat_fav_iv);
            mEatNotFav= (ImageView) itemView.findViewById(R.id.food_eat_notFav_iv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int pos = getAdapterPosition();
                        if(pos!= RecyclerView.NO_POSITION){
                            listener.onItemClick(pos);
                        }
                    }
                }
            });

            mEatNotFav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int pos = getAdapterPosition();
                        if(pos!= RecyclerView.NO_POSITION){
                            mEatFav.setVisibility(View.VISIBLE);
                            mEatNotFav.setVisibility(View.INVISIBLE);
                            listener.onStarClick(pos);
                        }
                    }
                }
            });
        }


    }
}
