package com.example.sum1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Easy extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
    }
    public void onClick(View view){
        Button but = (Button)view;
        String buttonText = but.getText().toString();
        switch ( buttonText){
            case "countries": Intent c = new Intent(Easy.this, EasyCommon.class);
                startActivity(c);break;
            case "flags":   Intent  f= new Intent(Easy.this, EasyFlags.class);
                startActivity(f);break;
            case "time": Intent t = new Intent(Easy.this, EasyTime.class);
                startActivity(t);break;
        }



    }
}
