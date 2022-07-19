package com.example.hazard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView tracker1,about,yt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tracker1=(CardView)findViewById(R.id.maps);
        about=(CardView)findViewById(R.id.about);
        yt=(CardView)findViewById(R.id.news);

        tracker1.setOnClickListener(this);
        about.setOnClickListener(this);
        yt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId())
        {
            case R.id.about:
                i=new Intent(this,About.class);
                startActivity(i);
                break;

            case R.id.maps:
                i=new Intent(this,MapsActivity.class);
                startActivity(i);
                break;

            case R.id.news:
                i=new Intent(this,NewsActivity.class);
                startActivity(i);
                break;
        }
    }
}