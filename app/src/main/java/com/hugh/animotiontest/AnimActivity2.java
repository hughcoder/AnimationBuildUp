package com.hugh.animotiontest;

import android.animation.Animator;
import android.os.Bundle;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnimActivity2 extends AppCompatActivity{

   private Button button;
   private TextView textView;


    /**
     * setDampingRatio(float dampingRatio)方法设置弹性阻尼，dampingRatio越大，
     * 摆动次数越少，当到1的时候完全不摆动，注意它体验出来的最明显的特征是摆动次数这个概念，SpringForce类中预定义了几个dampingRatio常量：
     *
     *
     * setStiffness(float stiffness)方法设置弹性的生硬度，stiffness值越小，弹簧越容易摆动，摆动的时间越长，
     * 反之摆动时间越短，注意它体验出来的最明显的特征是摆动时间这个概念。
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_anim2);

        button=findViewById(R.id.btn_ha);


        final SpringAnimation springAnimation = new SpringAnimation(button,SpringAnimation.TRANSLATION_Y,0);
        springAnimation.getSpring().setStiffness(SpringForce.STIFFNESS_LOW);
        springAnimation.getSpring().setDampingRatio(SpringForce.DAMPING_RATIO_MEDIUM_BOUNCY);
        springAnimation.setStartVelocity(-2000);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                springAnimation.cancel();
                springAnimation.setStartValue(-700);
                springAnimation.start();

            }
        });
    }


}
