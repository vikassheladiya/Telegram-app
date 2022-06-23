package com.example.telegramapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class NewNumberActivity extends AppCompatActivity {
    String[] contry = {"india", "Afghanistan", "Brazil", "Canada", "Denmark", "Egypt", "France"};
    Spinner spinner;
    EditText numberedt;
    ImageView yasimg;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_number);
        spinn();
        numberchek();
    }


    private void spinn() {
        spinner = findViewById(R.id.spinner);
        ContryAdepter contryAdepter = new ContryAdepter(getApplicationContext(), contry);
        spinner.setAdapter(contryAdepter);
    }

    private void numberchek() {
        yasimg = findViewById(R.id.yasimg);
        numberedt = findViewById(R.id.numberedt);
        yasimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = numberedt.getText().toString();
                if (number.isEmpty()) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(NewNumberActivity.this);
                    builder.setTitle("sorry");
                    builder.setMessage("Invalid phone number.Please check the number and try again.");
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(NewNumberActivity.this, SettingActivity.class);
                            startActivity(i);
                        }
                    });
                    builder.setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent(NewNumberActivity.this,NewNumberActivity.class);
                            startActivity(i);
                        }
                    });
                    AlertDialog b = builder.create();
                    b.setCancelable(false);
                    b.show();
                } else if (number.length() < 10) {
                    Toast.makeText(NewNumberActivity.this, "please Enter the 10 number", Toast.LENGTH_SHORT).show();
                } else if (number.length() > 10) {
                    Toast.makeText(NewNumberActivity.this, "please Enter the 10 number", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}