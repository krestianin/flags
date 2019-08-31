package com.example.sum1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView flags;
public int countr=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // flags=findViewById(R.id.imageView5);
    }

    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, Flags.class);
        startActivity(i);
}}
