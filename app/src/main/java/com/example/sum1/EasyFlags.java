package com.example.sum1;

import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.String.valueOf;

public class EasyFlags extends Easy {
    Button b1;
    Button b2;
    Button b3;
    TextView tv;
    Button b4;
    String FinBut;
    String RightAns;
    ArrayList<String> ArrayOfBut = new ArrayList<>();
    Button RightBut;
    ArrayList<String> array_1=new ArrayList<>();
    String RanFlag;
    EditText counter;
    String[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_flags);
        counter = findViewById(R.id.editText);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        tv =findViewById(R.id.tv);
        ArrayOfBut.add("b1");
        ArrayOfBut.add("b2");
        ArrayOfBut.add("b3");
        ArrayOfBut.add("b4");
        arr=getResources().getStringArray(R.array.easy_countries);

        Collections.addAll(array_1, arr);
        MakeRandFlags();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void MakeRandFlags(){
    //   int[] arrflags= getResources().getIntArray(R.array.flags);
        ArrayList<String> array=new ArrayList<>();
        Collections.addAll(array, arr);
        RightAns = array_1.get(new Random().nextInt(array_1.size()));
        Collections.shuffle(ArrayOfBut);
        FinBut =ArrayOfBut.get(0);
        tv.setText(RightAns);
//         String newright=valueOf(RightAns);
//        String[] mas=newright.split(".");
//
    //    switch (RightAns){
//            case "katar":im1.setImageResource(R.drawable.katar);break;
//            case "georgia":im1.setImageResource(R.drawable.georgia);break;
//            case "madagaskar":im1.setImageResource(R.drawable.madagaskar);break;
//            case "france":im1.setImageResource(R.drawable.france);break;
//            case "italy":im1.setImageResource(R.drawable.italy);break;
      //  }
        int resID = this.getResources().getIdentifier(RightAns, "drawable", this.getPackageName());
        b1.setForeground(getDrawable(resID));
        switch (FinBut){
            case "b1":
                RightBut=b1;
                b1.setForeground(getDrawable(resID));
                array.remove(RightAns);
                array_1.remove(RightAns);
                RanFlag= array.get(new Random().nextInt(array.size()));
                b2.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));
                array.remove(RanFlag);
                RanFlag= (array.get(new Random().nextInt(array.size())));
                b3.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));
                array.remove(RanFlag);
                RanFlag= (array.get(new Random().nextInt(array.size())));
                b4.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));; break;


            case "b2":
                RightBut=b2;
                b2.setForeground(getDrawable(resID));
                array_1.remove(RightAns);
                RanFlag= array.get(new Random().nextInt(array.size()));
                b1.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));
                array.remove(RanFlag);
                RanFlag=array.get(new Random().nextInt(array.size()));
                b3.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));
                array.remove(RanFlag);
                RanFlag= (array.get(new Random().nextInt(array.size())));
                b4.setBackground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName()))); break;


            case "b3":
                RightBut=b3;
                b3.setForeground(getDrawable(resID));
                array.remove(RightAns);
                array_1.remove(RightAns);
                RanFlag= array.get(new Random().nextInt(array.size()));
                b2.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));
                array.remove(RanFlag);
                RanFlag= (array.get(new Random().nextInt(array.size())));
                b1.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));
                array.remove(RanFlag);
                RanFlag= (array.get(new Random().nextInt(array.size())));
                b4.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName()))); break;


            case "b4":
                RightBut=b4;
                b4.setForeground(getDrawable(resID));
                array.remove(RightAns);
                array_1.remove(RightAns);
                RanFlag= array.get(new Random().nextInt(array.size()));
                b2.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));
                array.remove(RanFlag);
                RanFlag= (array.get(new Random().nextInt(array.size())));
                b1.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName())));
                array.remove(RanFlag);
                RanFlag= (array.get(new Random().nextInt(array.size())));
                b3.setForeground(getDrawable(this.getResources().getIdentifier(RanFlag, "drawable", this.getPackageName()))); break;


        }


    }




    public void onClick(View view) {
        if(!array_1.isEmpty()){
            Button but = (Button)view;
          Drawable buttonText =but.getForeground();
           int a =(this.getResources().getIdentifier(RightAns, "drawable", this.getPackageName()));
            if(but==RightBut){
              but.setForeground(getDrawable(R.drawable.all_countries_right_button));

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
                MakeRandFlags();
                b1.setBackground(getDrawable(R.drawable.all_buttons));
                b2.setBackground(getDrawable(R.drawable.all_buttons));
                b3.setBackground(getDrawable(R.drawable.all_buttons));
                b4.setBackground(getDrawable(R.drawable.all_buttons));
            }
            else{
                but.setForeground(getDrawable(R.drawable.all_countries_false_button));


            }}
        else{   Toast toast = Toast.makeText(getApplicationContext(),
                "the end", Toast.LENGTH_SHORT);
            toast.show();

        }
    }}

