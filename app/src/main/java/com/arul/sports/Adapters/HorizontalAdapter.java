package com.arul.sports.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.arul.sports.Model.HorizontalViewModel;
import com.arul.sports.R;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {

    private List<HorizontalViewModel> MatchList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView TxtTeam1, TxtScore, TxtTeam2,TxtType,TxtResult;

        public MyViewHolder(View view) {
            super(view);
            TxtTeam1 = (TextView) view.findViewById(R.id.TxtTeam1);
            TxtScore = (TextView) view.findViewById(R.id.TxtScore);
            TxtTeam2 = (TextView) view.findViewById(R.id.TxtTeam2);
            TxtType = (TextView) view.findViewById(R.id.TxtType);
            TxtResult = (TextView) view.findViewById(R.id.TxtResult);
        }
    }

    public HorizontalAdapter(List<HorizontalViewModel> moviesList) {
        this.MatchList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.horizontal_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        HorizontalViewModel Matches = MatchList.get(position);
        holder.TxtTeam1.setText(Matches.getTeam1());
        holder.TxtScore.setText(Matches.getScore());
        holder.TxtTeam2.setText(Matches.getTeam2());
        holder.TxtType.setText(Matches.getType());
        holder.TxtResult.setText(Matches.getResultType());
    }

    @Override
    public int getItemCount() {
        return MatchList.size();
    }
}