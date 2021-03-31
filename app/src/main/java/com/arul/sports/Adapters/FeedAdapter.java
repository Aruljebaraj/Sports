package com.arul.sports.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.arul.sports.FeedDetails;
import com.arul.sports.Model.Feeds;
import com.arul.sports.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.MyViewHolder> {

    private List<Feeds> FeedList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView TxtName, TxtType, TxtTime;
        ImageView ImgFeed;
        RelativeLayout LnMain;

        public MyViewHolder(View view) {
            super(view);
            TxtName = (TextView) view.findViewById(R.id.TxtName);
            TxtType = (TextView) view.findViewById(R.id.TxtType);
            TxtTime = (TextView) view.findViewById(R.id.TxtTime);

            ImgFeed = (ImageView) view.findViewById(R.id.ImgFeed);
            LnMain = (RelativeLayout) view.findViewById(R.id.LnMain);


        }
    }

    public FeedAdapter(List<Feeds> moviesList) {
        this.FeedList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Feeds Matches = FeedList.get(position);

        Glide.with(holder.itemView.getContext()).load(Matches.getImageUrl()).into(holder.ImgFeed);
        holder.TxtName.setText(Matches.getName());
        holder.TxtTime.setText(Matches.getTime());
        holder.TxtType.setText(Matches.getType());

        holder.LnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mItemClickListener != null) {
                    mItemClickListener.onItemClickListener(v,position, FeedList.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return FeedList.size();
    }
    private onItemClickListener mItemClickListener;

    public void setOnItemClickListener(onItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public interface onItemClickListener {
        void onItemClickListener(View view, int position, Feeds myData);
    }
}