package com.akshay.eventica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form extends AppCompatActivity {

    private Button submit;
    private EditText eName, eDate, eTime, eDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        submit = findViewById(R.id.submit);
        eName = findViewById(R.id.eName);
        eDate = findViewById(R.id.eDate);
        eTime = findViewById(R.id.eTime);
        eDetails = findViewById(R.id.eDetails);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EName = eName.getText().toString();
                String EDate = eDate.getText().toString();
                String ETime = eTime.getText().toString();
                String EDetails = eDetails.getText().toString();
                if(TextUtils.isEmpty(EName) || TextUtils.isEmpty(EDate) || TextUtils.isEmpty(ETime) || TextUtils.isEmpty(EDetails))
                    Toast.makeText(Form.this, "Empty Credentials", Toast.LENGTH_SHORT).show();
                else{
                    Toast.makeText(Form.this, "Events Updated", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}
