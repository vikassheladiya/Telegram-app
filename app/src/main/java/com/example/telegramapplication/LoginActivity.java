package com.example.telegramapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    AppCompatButton loginbtn;
    String[]contry={"india","Afghanistan","Brazil","Canada","Denmark","Egypt","France"};
    Spinner spinner;
    EditText numberedt;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initview();
        spinn();
    }

    private void spinn() {
        spinner=findViewById(R.id.spinner);
        ContryAdepter contryAdepter=new ContryAdepter(getApplicationContext(),contry);
        spinner.setAdapter(contryAdepter);
    }

    private void initview() {

        numberedt=findViewById(R.id.numberedt);

        loginbtn=findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    number=numberedt.getText().toString();


                Intent i=new Intent(LoginActivity.this,ScreenActivity.class);



                if(number.isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "please enter phone number", Toast.LENGTH_SHORT).show();
                }
                else if(number.length()<10){
                    Toast.makeText(LoginActivity.this, "please enter 10 number", Toast.LENGTH_SHORT).show();
                }
                else if(number.length()>10){
                    Toast.makeText(LoginActivity.this, "please enter 10 number", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(i);
                }

            }
        });
    }
}