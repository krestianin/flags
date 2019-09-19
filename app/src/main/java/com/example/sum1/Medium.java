package com.example.sum1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Medium extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
    }

    @Override
    public void onClick(View view) {
        Button but = (Button)view;
        String buttonText = but.getText().toString();
        switch ( buttonText){
            case "countries": Intent m = new Intent(Medium.this, MediumCommon.class);
                startActivity(m);break;
            case "time": Intent e = new Intent(Medium.this, MediumTime.class);
                startActivity(e);break;

            case "flags": Intent h = new Intent(Medium.this, MediumFlags.class);
                startActivity(h);break;
        }

}}
