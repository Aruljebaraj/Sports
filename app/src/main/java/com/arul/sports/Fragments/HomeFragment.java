package com.arul.sports.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arul.sports.Adapters.FeedAdapter;
import com.arul.sports.Adapters.HorizontalAdapter;
import com.arul.sports.FeedDetails;
import com.arul.sports.Model.Feeds;
import com.arul.sports.Model.HorizontalViewModel;
import com.arul.sports.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
ArrayList<HorizontalViewModel>HorizontalList;
ArrayList<Feeds>FeedsList;
    RecyclerView HorizontalRecyclerView,FeedRecyclerView;
    FeedAdapter feedAdapter;
    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_home,null);
         HorizontalRecyclerView = (RecyclerView) view.findViewById(R.id.HorizontalRecyclerView);
        FeedRecyclerView = (RecyclerView) view.findViewById(R.id.FeedRecyclerView);
        HorizontalData();
        FeedData();
        return view;
    }
    public void HorizontalData(){
        HorizontalViewModel dto;
        HorizontalList =new ArrayList<>();
        dto =new HorizontalViewModel();
        dto.setTeam1("IND");
        dto.setTeam2("AUS");
        dto.setResultType("India Won by 6 Wicket");
        dto.setType("Schedule");
        dto.setScore("40/2 (10.5 ov)");
        HorizontalList.add(dto);

        dto =new HorizontalViewModel();
        dto.setTeam1("WIN");
        dto.setTeam2("ENG");
        dto.setResultType("ONGoing");
        dto.setType("POINT TABLE");
        dto.setScore("112/2 (25.5 ov)");

        HorizontalList.add(dto);
        HorizontalRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        HorizontalRecyclerView.setAdapter(new HorizontalAdapter(HorizontalList));
    }
    public void FeedData(){
        Feeds dto;
        FeedsList =new ArrayList<>();
        dto =new Feeds();
        dto.setName("IND vs ENG, 2nd ODI Live Score: KL Rahul Departs, Rishabh Pant Key As India Eye Big Finish");
        dto.setAuthor("Neelav Chakravarti");
        dto.setImageUrl("https://c.ndtvimg.com/2021-03/fn24q1f8_rahul-pant-bcci_625x300_26_March_21.jpg?output-quality=60&output-format=webp&downsize=555:*");
        dto.setType("Schedule");
        dto.setTime("20 mins ago");
        dto.setDesc("Three wickets down, India have crossed the 250-run mark in opposition to England, within the second ODI of the continued three-match sequence, on the MCA Stadium in Pune on Friday. Presently, KL Rahul and Rishabh Pant are batting for India, and the duo are including extra runs to the scoreboard. Rahul has registered a century, and Pant has additionally scored a half-century. Captain Virat Kohli additionally registered a century earlier than his dismissal. Reece Topley, Sam Curran, Adil Rashid have taken a wicket every for England. The hosts can be aiming to increase their lead within the ongoing sequence, after successful the primary ODI by 66 runs. India can be with out Shreyas Iyer, who has been changed by Rishabh Pant. Iyer suffered an harm within the earlier match, and has been dominated out of the remaining matches and likewise the whole lot of Indian Premier League (IPL) 2021. England are additionally with out captain Eoin Morgan, who obtained an harm within the earlier match. He has been changed by Dawid Malan. In the meantime, Liam Livingstone has changed Sam Billings and Reece Topley can be taking part in as an alternative of Mark Wooden.");
        FeedsList.add(dto);

        FeedRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
         feedAdapter =new FeedAdapter(FeedsList);
        FeedRecyclerView.setAdapter(feedAdapter);
        feedAdapter.setOnItemClickListener(new FeedAdapter.onItemClickListener() {
            @Override
            public void onItemClickListener(View view, int position, Feeds myData) {
                startActivity(new Intent(getActivity(),FeedDetails.class).putExtra("Data", myData));
            }
        });
    }


}
