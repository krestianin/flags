package com.example.sum1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Flags extends MainActivity {
Button b1;
Button b2;
Button b3;
Button b4;
String RightAns="Мадагаскар";

EditText counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flags);
    counter=findViewById(R.id.editText);

    b1=findViewById(R.id.button);
    b2=findViewById(R.id.button2);
    b3=findViewById(R.id.button3);
    b4=findViewById(R.id.button4);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onClick(View view) {
        Button but = (Button)view;
        String buttonText = but.getText().toString();
        if(buttonText.equals(RightAns)){


         but.setBackgroundColor(getResources().getColor(R.color.greenColor, null));
//       c++;
//       Toast toast = Toast.makeText(getApplicationContext(),
//                    c, Toast.LENGTH_SHORT);
//            toast.show();
        }
    else{
            but.setBackgroundColor(getResources().getColor(R.color.redColor, null));

        }

    }}
