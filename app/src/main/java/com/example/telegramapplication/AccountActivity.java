package com.example.telegramapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {
    CardView changebtn;
    TextView keeobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        btnclick();
        keepclick();
    }

    private void keepclick() {

        keeobtn=findViewById(R.id.keeobtn);
        keeobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keep();
            }
        });
    }

    private void keep() {
        Intent i= new Intent(AccountActivity.this,SettingActivity.class);
        startActivity(i);
    }

    private void btnclick() {
        changebtn=findViewById(R.id.changebtn);
        changebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendialog();
            }
        });
    }

    private void opendialog() {
        AlertDialog.Builder builder=new AlertDialog.Builder(AccountActivity.this);
        builder.setTitle("Change number");
        builder.setMessage("are you sure change this number ?");
        builder.setPositiveButton("CHANGE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent in=new Intent(AccountActivity.this,NewNumberActivity.class);
                startActivity(in);
            }
        });
        builder.setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i=new Intent(AccountActivity.this,AccountActivity.class);
                startActivity(i);
            }
        });
        AlertDialog d= builder.create();
        d.setCancelable(false);
        d.show();
    }
}