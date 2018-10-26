package com.hugh.animotiontest;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.animation.DynamicAnimation;
import android.support.animation.SpringAnimation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View Btn = findViewById(R.id.btn1);
        final View Btn2 =findViewById(R.id.btn2);
        final View Btn3 =findViewById(R.id.btn3);
        final View Btn4 = findViewById(R.id.btn4);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AnimActivity1.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,Btn,"robot");
//                startActivity(intent,options.toBundle());
                startActivity(intent);
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AnimActivity2.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,Btn2,"robot");
                startActivity(intent,options.toBundle());
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AnimActivity3.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,Btn3,"robot");
                startActivity(intent,options.toBundle());
            }
        });
    }


}


