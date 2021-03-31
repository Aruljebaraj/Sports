package com.arul.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.arul.sports.Model.Feeds;
import com.bumptech.glide.Glide;

public class FeedDetails extends AppCompatActivity {
ImageView ImgBack,ImgFeed;
TextView TxtHeadlines,TxtAuthor,TxtTime,TxtType,TxtContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_details);
        Intent i = getIntent();
        Feeds model = (Feeds)i.getSerializableExtra("Data");
        ImgBack =findViewById(R.id.ImgBack);
        ImgFeed =findViewById(R.id.ImgFeed);
        Glide.with(this).load(model.getImageUrl()).into(ImgFeed);

        TxtHeadlines =findViewById(R.id.TxtHeadlines);
        TxtAuthor =findViewById(R.id.TxtAuthor);
        TxtTime =findViewById(R.id.TxtTime);
        TxtType =findViewById(R.id.TxtType);
        TxtContent =findViewById(R.id.TxtContent);

        TxtHeadlines.setText(model.getName());
        TxtAuthor.setText(model.getAuthor());
        TxtContent.setText(model.getDesc());
        TxtTime.setText("  |  "+model.getTime());
        TxtType.setText("  |  "+model.getType());
        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),MainActivity.class));
            }
        });
     //Toast.makeText(this, model.getName(), Toast.LENGTH_SHORT).show();
    }
}