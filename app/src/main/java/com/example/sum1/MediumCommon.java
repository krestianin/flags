package com.example.sum1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.String.valueOf;

public class MediumCommon extends MainActivity {
Button b1;
Button b2;
Button b3;
Button b4;
String FinBut;
String RightAns;
ArrayList<String> ArrayOfBut = new ArrayList<>();

ArrayList<String> array_1=new ArrayList<>();
ImageView im1;
String RanText;
EditText counter;
    String[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediumcommon);
        im1 = findViewById(R.id.imageView3);
        counter = findViewById(R.id.editText);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        ArrayOfBut.add("b1");
        ArrayOfBut.add("b2");
        ArrayOfBut.add("b3");
        ArrayOfBut.add("b4");
        arr=getResources().getStringArray(R.array.easy_countries);

        Collections.addAll(array_1, arr);
        MakeRandCountries();
    }

    public void MakeRandCountries(){
//        ArrayList<String> arrayOfFlags=new ArrayList<>();
//       String[] flags=getResources().getStringArray(R.array.flags);
//        Collections.addAll(arrayOfFlags,flags);
//        int[] arr=getResources().getIntArray(R.array.flags);
        ArrayList<String> array=new ArrayList<>();
        arr=getResources().getStringArray(R.array.easy_countries);
        Collections.addAll(array, arr);
       String f="france";
        RightAns = (array_1.get(new Random().nextInt(array_1.size())));

        switch (RightAns){
            case "russia":im1.setImageResource(R.drawable.russia);break;
            case "katar":im1.setImageResource(R.drawable.katar);break;
            case "georgia":im1.setImageResource(R.drawable.georgia);break;
            case "madagaskar":im1.setImageResource(R.drawable.madagaskar);break;
            case "france":im1.setImageResource(R.drawable.france);break;
            case "italy":im1.setImageResource(R.drawable.italy);break;
        }


         Collections.shuffle(ArrayOfBut);
        FinBut =ArrayOfBut.get(0);

        switch (FinBut){
            case "b1":
            b1.setText(RightAns);
            array.remove(RightAns);
            array_1.remove(RightAns);
            RanText= array.get(new Random().nextInt(array.size()));
            b2.setText(RanText);
             array.remove(RanText);
             RanText= valueOf(array.get(new Random().nextInt(array.size())));
            b3.setText(RanText);
                array.remove(RanText);
                RanText= valueOf(array.get(new Random().nextInt(array.size())));
            b4.setText(RanText);  break;


            case "b2": b2.setText(RightAns);
                array.remove(RightAns);
                array_1.remove(RightAns);
                RanText= array.get(new Random().nextInt(array.size()));
                b1.setText(RanText);
                array.remove(RanText);
                RanText= (String) valueOf(array.get(new Random().nextInt(array.size())));
                b3.setText(RanText);
                array.remove(RanText);
                RanText= (String) valueOf(array.get(new Random().nextInt(array.size())));
                b4.setText(RanText);  break;

            case "b3": b3.setText(RightAns);
                array.remove(RightAns);
                array_1.remove(RightAns);
                RanText= valueOf(array.get(new Random().nextInt(array.size())));
                b1.setText(RanText);
                array.remove(RanText);
                RanText= valueOf(array.get(new Random().nextInt(array.size())));
                b2.setText(RanText);
                array.remove(RanText);
                RanText= valueOf(array.get(new Random().nextInt(array.size())));
                b4.setText(RanText);  break;

            case "b4": b4.setText(RightAns);
                array.remove(RightAns);
                array_1.remove(RightAns);
                RanText= valueOf(array.get(new Random().nextInt(array.size())));
                b1.setText(RanText);
                array.remove(RanText);
                RanText= valueOf(array.get(new Random().nextInt(array.size())));
                b3.setText(RanText);
                array.remove(RanText);
                RanText= valueOf(array.get(new Random().nextInt(array.size())));
                b2.setText(RanText);  break;

        }


    }




    public void onClick(View view) {
        if(!array_1.isEmpty()){
        final Button but = (Button)view;
        String buttonText = but.getText().toString();
        if(buttonText.equals(RightAns)){
            but.setBackground(getDrawable(R.drawable.all_countries_right_button));

//        if(but.getBackground().equals(R.drawable.all_countries_right_button)){
//             Thread t= new Thread
//            (new Runnable() {
//                @Override
//                public void run() {
//                    but.setBackground(getDrawable(R.drawable.all_countries_right_button));
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            t.start();
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            MakeRandCountries();
            b1.setBackground(getDrawable(R.drawable.all_buttons));
            b2.setBackground(getDrawable(R.drawable.all_buttons));
               b3.setBackground(getDrawable(R.drawable.all_buttons));
               b4.setBackground(getDrawable(R.drawable.all_buttons));
        }
    else{
        but.setBackground(getDrawable(R.drawable.all_countries_false_button));


        }}
else{   Toast toast = Toast.makeText(getApplicationContext(),
               "the end", Toast.LENGTH_SHORT);
            toast.show();

        }
    }}
