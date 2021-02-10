package com.akshay.eventica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubEvent extends AppCompatActivity {

    private Button clubInfo ;
    private String tag;
    private ImageView clubLogo;
    private TextView eventName, eventDate, eventTime, eventDetails;
    public static final String MSG2 = "com.akshay.eventica.MSG2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_event);

        eventName = findViewById(R.id.eventName);
        eventDate = findViewById(R.id.eventDate);
        eventTime = findViewById(R.id.eventTime);
        eventDetails = findViewById(R.id.eventDetails);

        Intent intent1 = getIntent();
        tag = intent1.getStringExtra(Clubs.MSG1);
        clubLogo = findViewById(R.id.clubInfoLogo);

        switch (tag) {
            case "ie":
                clubLogo.setImageResource(R.drawable.ie);
                break;
            case "ieee":
                clubLogo.setImageResource(R.drawable.ieee);
                break;
            case "acm":
                clubLogo.setImageResource(R.drawable.acm);
                break;
            case "rotaract":
                clubLogo.setImageResource(R.drawable.rotaract);
                break;
            case "iste":
                clubLogo.setImageResource(R.drawable.iste);
                break;
            case "iet":
                clubLogo.setImageResource(R.drawable.iet);
                break;
        }

        clubInfo = findViewById(R.id.clubInfo);
        clubInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ClubEvent.this, ClubInfo.class);
                intent2.putExtra(MSG2,tag);
                startActivity(intent2);
            }
        });
    }
}
