package com.example.cardiacrecorder;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomePageActivity extends AppCompatActivity {
CardView add,history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        add= findViewById(R.id.firstCard);
        history= findViewById(R.id.secondCard);
        add.setOnClickListener(v -> {

            Intent intent = new Intent(HomePageActivity.this, RecordActivity.class);
            intent.putExtra("check","1");
            startActivity(intent);
        }
        );
        history.setOnClickListener(view -> {
            Intent intent = new Intent(HomePageActivity.this, listofRecord.class);
            intent.putExtra("check","2");
            startActivity(intent);
            finish();
        });
}}
