package com.example.sum1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class All extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
    }
    public void onClick(View view){
       Intent e = new Intent(All.this, AllCommon.class);
        startActivity(e);
    }
}
