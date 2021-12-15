package com.example.fortune;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
        final ViewFlipper vFlipper;

        btn1 = (ImageView) findViewById(R.id.fortune1);
        btn2 = (ImageView) findViewById(R.id.fortune2);
        btn3 = (ImageView) findViewById(R.id.fortune3);
        btn4 = (ImageView) findViewById(R.id.fortune4);
        btn5 = (ImageView) findViewById(R.id.fortune5);
        btn6 = (ImageView) findViewById(R.id.fortune6);
        btn7 = (ImageView) findViewById(R.id.fortune7);
        btn8 = (ImageView) findViewById(R.id.fortune8);
        vFlipper = (ViewFlipper) findViewById(R.id.ViewFlipper);

        TextView text1, text2, text3, text4;
        text1 = (TextView) findViewById(R.id.txt1);
        text2 = (TextView) findViewById(R.id.txt2);
        text3 = (TextView) findViewById(R.id.txt3);
        text4 = (TextView) findViewById(R.id.txt4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int red = 0;
                int blue = 0;
                int green = 0;

                red = (int)(Math.random()*255);
                blue = (int)(Math.random()*255);
                green = (int)(Math.random()*255);

                vFlipper.setBackgroundColor(Color.rgb(red, green, blue));


                text1.setText((int)(Math.random() * 100) + "점");
                text2.setText((int)(Math.random() * 100) + "점");
                text3.setText((int)(Math.random() * 100) + "점");
                text4.setText((int)(Math.random() * 100) + "점");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int red = 0;
                int blue = 0;
                int green = 0;

                red = (int)(Math.random()*255);
                blue = (int)(Math.random()*255);
                green = (int)(Math.random()*255);

                vFlipper.setBackgroundColor(Color.rgb(red, green, blue));


                text1.setText((int)(Math.random() * 100) + "점");
                text2.setText((int)(Math.random() * 100) + "점");
                text3.setText((int)(Math.random() * 100) + "점");
                text4.setText((int)(Math.random() * 100) + "점");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int red = 0;
                int blue = 0;
                int green = 0;

                red = (int)(Math.random()*255);
                blue = (int)(Math.random()*255);
                green = (int)(Math.random()*255);

                vFlipper.setBackgroundColor(Color.rgb(red, green, blue));


                text1.setText((int)(Math.random() * 100) + "점");
                text2.setText((int)(Math.random() * 100) + "점");
                text3.setText((int)(Math.random() * 100) + "점");
                text4.setText((int)(Math.random() * 100) + "점");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int red = 0;
                int blue = 0;
                int green = 0;

                red = (int)(Math.random()*255);
                blue = (int)(Math.random()*255);
                green = (int)(Math.random()*255);

                vFlipper.setBackgroundColor(Color.rgb(red, green, blue));


                text1.setText((int)(Math.random() * 100) + "점");
                text2.setText((int)(Math.random() * 100) + "점");
                text3.setText((int)(Math.random() * 100) + "점");
                text4.setText((int)(Math.random() * 100) + "점");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int red = 0;
                int blue = 0;
                int green = 0;

                red = (int)(Math.random()*255);
                blue = (int)(Math.random()*255);
                green = (int)(Math.random()*255);

                vFlipper.setBackgroundColor(Color.rgb(red, green, blue));


                text1.setText((int)(Math.random() * 100) + "점");
                text2.setText((int)(Math.random() * 100) + "점");
                text3.setText((int)(Math.random() * 100) + "점");
                text4.setText((int)(Math.random() * 100) + "점");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int red = 0;
                int blue = 0;
                int green = 0;

                red = (int)(Math.random()*255);
                blue = (int)(Math.random()*255);
                green = (int)(Math.random()*255);

                vFlipper.setBackgroundColor(Color.rgb(red, green, blue));


                text1.setText((int)(Math.random() * 100) + "점");
                text2.setText((int)(Math.random() * 100) + "점");
                text3.setText((int)(Math.random() * 100) + "점");
                text4.setText((int)(Math.random() * 100) + "점");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int red = 0;
                int blue = 0;
                int green = 0;

                red = (int)(Math.random()*255);
                blue = (int)(Math.random()*255);
                green = (int)(Math.random()*255);

                vFlipper.setBackgroundColor(Color.rgb(red, green, blue));


                text1.setText((int)(Math.random() * 100) + "점");
                text2.setText((int)(Math.random() * 100) + "점");
                text3.setText((int)(Math.random() * 100) + "점");
                text4.setText((int)(Math.random() * 100) + "점");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int red = 0;
                int blue = 0;
                int green = 0;

                red = (int)(Math.random()*255);
                blue = (int)(Math.random()*255);
                green = (int)(Math.random()*255);

                vFlipper.setBackgroundColor(Color.rgb(red, green, blue));


                text1.setText((int)(Math.random() * 100) + "점");
                text2.setText((int)(Math.random() * 100) + "점");
                text3.setText((int)(Math.random() * 100) + "점");
                text4.setText((int)(Math.random() * 100) + "점");

            }
        });
    }
}