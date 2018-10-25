package com.hugh.animotiontest;

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

        final View img = findViewById(R.id.iv_round);
        final View Btn = findViewById(R.id.btn1);
        final SpringAnimation springAnimation = new SpringAnimation(img, DynamicAnimation.TRANSLATION_X,0);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AnimActivity1.class);
                startActivity(intent);
            }
        });
    }


}


