package com.akshay.eventica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubInfo extends AppCompatActivity {

    private String tag;
    private ImageView clubInfoLogo;
    private TextView clubInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_info);

        Intent intent = getIntent();
        tag = intent.getStringExtra(ClubEvent.MSG2);
        clubInfoLogo = findViewById(R.id.clubInfoLogo);
        clubInfo = findViewById(R.id.clubInfo);

        switch (tag) {
            case "ie":
                clubInfoLogo.setImageResource(R.drawable.ie);
                clubInfo.setText(R.string.ie_info);
                break;
            case "ieee":
                clubInfoLogo.setImageResource(R.drawable.ieee);
                clubInfo.setText(R.string.ieee_info);
                break;
            case "acm":
                clubInfoLogo.setImageResource(R.drawable.acm);
                clubInfo.setText(R.string.acm_info);
                break;
            case "rotaract":
                clubInfoLogo.setImageResource(R.drawable.rotaract);
                clubInfo.setText(R.string.rotaract_info);
                break;
            case "iste":
                clubInfoLogo.setImageResource(R.drawable.iste);
                clubInfo.setText(R.string.iste_info);
                break;
            case "iet":
                clubInfoLogo.setImageResource(R.drawable.iet);
                clubInfo.setText(R.string.iet_info);
                break;
        }

    }
}
