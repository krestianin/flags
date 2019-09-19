package com.example.sum1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // flags=findViewById(R.id.imageView5);
    }

    public void onClick(View view) {
        Button but = (Button)view;

        String buttonText = but.getText().toString();
        switch ( buttonText){
            case "medium": Intent m = new Intent(MainActivity.this, Medium.class);
            startActivity(m);break;
            case "easy": Intent e = new Intent(MainActivity.this, Easy.class);
        startActivity(e);break;

            case "hard": Intent h = new Intent(MainActivity.this, Hard.class);
               startActivity(h);break;
           case "all countries": Intent all = new Intent(MainActivity.this, All.class);
               startActivity(all);break;
        }
}}
