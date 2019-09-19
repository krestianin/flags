package com.example.sum1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hard extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
    }
    @Override
    public void onClick(View view) {
        Button but = (Button) view;
        String buttonText = but.getText().toString();
        switch (buttonText) {
            case "countries":
                Intent m = new Intent(Hard.this, HardCommon.class);
                startActivity(m);
                break;
            case "time":
                Intent e = new Intent(Hard.this, HardTime.class);
                startActivity(e);
                break;

            case "flags":
                Intent h = new Intent(Hard.this, HardFlags.class);
                startActivity(h);
                break;
        }
    }}
