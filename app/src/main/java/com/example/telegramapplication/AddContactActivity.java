package com.example.telegramapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AddContactActivity extends AppCompatActivity {
    ImageView yasimg;
    EditText firstedt, lastedt, numberedt;
    String first, last, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        yasbtn();
    }

    private void yasbtn() {
        firstedt = findViewById(R.id.firstedt);
        lastedt = findViewById(R.id.lastedt);
        numberedt = findViewById(R.id.numberedt);

        yasimg = findViewById(R.id.yasimg);
        yasimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = firstedt.getText().toString();
                last = lastedt.getText().toString();
                number = numberedt.getText().toString();

                Intent i = new Intent(AddContactActivity.this, ScreenActivity.class);
                if (first.isEmpty()) {
                    Toast.makeText(AddContactActivity.this, "Please Enter The First Name", Toast.LENGTH_SHORT).show();
                } else if (last.isEmpty()) {
                    Toast.makeText(AddContactActivity.this, "Please Enter The Last Name", Toast.LENGTH_SHORT).show();
                } else if (number.isEmpty()) {
                    Toast.makeText(AddContactActivity.this, "Please Enter The phone number", Toast.LENGTH_SHORT).show();
                } else if (number.length() < 10) {
                    Toast.makeText(AddContactActivity.this, "Please Enter The 10 number", Toast.LENGTH_SHORT).show();
                } else if (number.length() > 10) {
                    Toast.makeText(AddContactActivity.this, "Please Enter The 10 number", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(i);
                }

            }
        });
    }
}