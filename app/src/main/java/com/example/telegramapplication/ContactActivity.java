package com.example.telegramapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {
    CardView addcontactbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        initview();

    }

    private void initview() {
        addcontactbtn=findViewById(R.id.addcontactbtn);
        addcontactbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactActivity.this,AddContactActivity.class);
                startActivity(i);
            }
        });
    }
}