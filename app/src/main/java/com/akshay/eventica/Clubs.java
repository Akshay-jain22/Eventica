package com.akshay.eventica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clubs extends AppCompatActivity {

    private Button addEvent;
    private Intent intent2;
    public static final String MSG1 = "com.akshay.eventica.MSG1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        addEvent = findViewById(R.id.addEvent);
        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Clubs.this, Login.class);
                startActivity(intent1);
            }
        });
    }

    public void clubEvent(View view){
        intent2 = new Intent(Clubs.this, ClubEvent.class);
        String tag = view.getTag().toString();
        intent2.putExtra(MSG1, tag);
        startActivity(intent2);
    }
}
