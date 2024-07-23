package com.example.articleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ArticleDetailActivity extends AppCompatActivity {

    private ImageView detailImage;
    private TextView detailTitle;
    private TextView detailDate;
    private TextView detailDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        detailImage = findViewById(R.id.detail_image);
        detailTitle = findViewById(R.id.detail_title);
        detailDate = findViewById(R.id.detail_date);
        detailDescription = findViewById(R.id.detail_description);

        // Get data from the intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String imageUrl = intent.getStringExtra("imageUrl");
        String date = intent.getStringExtra("date");
        String description = intent.getStringExtra("description");

        // Set data to views
        detailTitle.setText(title);
        detailDate.setText(date);
        detailDescription.setText(description);

        Glide.with(this)
                .load(imageUrl)
                .into(detailImage);
    }
}
