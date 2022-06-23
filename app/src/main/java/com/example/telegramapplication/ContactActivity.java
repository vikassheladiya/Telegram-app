package com.example.telegramapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContactActivity extends AppCompatActivity {
    CardView addcontactbtn;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        initview();
        bakebtn();

    }

    private void bakebtn() {
        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactActivity.this,ScreenActivity.class);
                startActivity(i);
            }
        });
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