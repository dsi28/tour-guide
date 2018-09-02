package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class food_Eat_Adapter extends RecyclerView.Adapter<food_Eat_Adapter.FoodEatViewHolder>{
    Context mContext;
    ArrayList<Eat> eatList;

    public food_Eat_Adapter(Context mContext, ArrayList<Eat> eatList) {
        this.mContext = mContext;
        this.eatList = eatList;
    }

    @NonNull
    @Override
    public FoodEatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.food_fragment_eat_item,parent,false);
        FoodEatViewHolder vHolder = new FoodEatViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(FoodEatViewHolder holder, int position) {
        holder.mEatName.setText(eatList.get(position).getName());
        holder.mEatRating.setText(eatList.get(position).getRating());
        if(holder.mEatNotFav.getVisibility()==View.VISIBLE){
            eatList.get(position).setFav(false);
            Toast.makeText(mContext,"false",Toast.LENGTH_SHORT);
        } else {
            eatList.get(position).setFav(false);
            Toast.makeText(mContext,"true",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public int getItemCount() {
        return eatList.size();
    }


    public static class FoodEatViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mEatName;
        private TextView mEatRating;
        private ImageView mEatFav;
        private ImageView mEatNotFav;

        public FoodEatViewHolder(View itemView){
            super(itemView);
            mEatName =(TextView) itemView.findViewById(R.id.food_eat_name_tv);
            mEatRating=(TextView) itemView.findViewById(R.id.food_eat_rating_tv);
            mEatFav= (ImageView) itemView.findViewById(R.id.food_eat_fav_iv);
            mEatNotFav= (ImageView) itemView.findViewById(R.id.food_eat_notFav_iv);

            mEatNotFav.setOnClickListener(this);
            mEatFav.setOnClickListener(this);
        }
        @Override
        public void onClick(View view){
            if(view.getId()==mEatNotFav.getId()){
                mEatNotFav.setVisibility(View.INVISIBLE);
                mEatFav.setVisibility(View.VISIBLE);
            } else if(view.getId()==mEatFav.getId() ){
                mEatFav.setVisibility(View.INVISIBLE);
                mEatNotFav.setVisibility(View.VISIBLE);
            }
        }
    }
}
