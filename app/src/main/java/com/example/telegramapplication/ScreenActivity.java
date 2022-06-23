package com.example.telegramapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class ScreenActivity extends AppCompatActivity {

    NavigationView navigationbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        navigationbar = findViewById(R.id.navigationbar);
        navigationbar.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.group:
                        Intent i=new Intent(ScreenActivity.this,GroupActivity.class);
                        startActivity(i);
                        break;
                    case R.id.contact:
                        Intent ic=new Intent(ScreenActivity.this,ContactActivity.class);
                        startActivity(ic);
                        break;
                    case R.id.calls:
                        Intent ia=new Intent(ScreenActivity.this,CallsActivity.class);
                        startActivity(ia);
                        break;
                    case R.id.pepole:
                       Intent ip=new Intent(ScreenActivity.this,PeopleActivity.class);
                       startActivity(ip);
                        break;

                    case R.id.setting:
                        Intent is=new Intent(ScreenActivity.this,SettingActivity.class);
                        startActivity(is);
                        break;

                }
                return true;
            }

        });
    }
}