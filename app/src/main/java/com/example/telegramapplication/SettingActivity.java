package com.example.telegramapplication;

import static android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SettingActivity extends AppCompatActivity {
    LinearLayout account,none;
    int SELECT_PICTURE = 1;
    ImageView imagecircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        click();
        clicknone();
        gallary();
    }

    private void clicknone() {
        none=findViewById(R.id.none);
        none.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SettingActivity.this,NoneActivity.class);
                startActivity(i);
            }
        });
    }

    private void gallary() {
        imagecircle = findViewById(R.id.imagecircle);
        imagecircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengallary();
            }
        });
    }

    private void opengallary() {
        Intent i= new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);//open popop
        //i.setAction(Intent.ACTION_GET_CONTENT);  direct open in gallary no open poppop
        i.setType("image/*");

        startActivityForResult(Intent.createChooser(i, "Select Picture"), SELECT_PICTURE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == SELECT_PICTURE && resultCode == RESULT_OK) {

            Uri selectedImageUri = data.getData();
            if (null != selectedImageUri) {

                imagecircle.setImageURI(selectedImageUri);
            }
        }

    }


    private void click() {
        account = findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SettingActivity.this, AccountActivity.class);
                startActivity(i);
            }
        });
    }
}