package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class activity_fragment_adapter extends RecyclerView.Adapter<activity_fragment_adapter.ActivViewHolder> {
    private Context mContext;
    private ArrayList<Activ> activList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener ){
        mListener =  listener;
    }

    public activity_fragment_adapter(Context mContext, ArrayList<Activ> activList) {
        this.mContext = mContext;
        this.activList = activList;
    }
    @NonNull
    @Override
    public ActivViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.activities_fragment_item, parent, false);
        ActivViewHolder vHolder= new ActivViewHolder(view, mListener);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(ActivViewHolder holder, int position) {
        holder.title.setText(activList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return activList.size();
    }

    public class ActivViewHolder extends RecyclerView.ViewHolder  {
        private TextView title;
        private ImageView pic;
        private ConstraintLayout item;
        public ActivViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.activ_tv);
            pic= (ImageView) itemView.findViewById(R.id.activ_iv);
            item= (ConstraintLayout) itemView.findViewById(R.id.activ_item_cv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int pos = getAdapterPosition();
                        if(pos != RecyclerView.NO_POSITION){
                            listener.onItemClick(pos);
                        }
                    }
                }
            });

        }
    }
}

