package com.hugh.animotiontest;

import android.animation.Animator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class AnimActivity2 extends AppCompatActivity{

    private View mContentView;
    private View mLoadingView;
    private int mShortAnimationDuration;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_anim1);

        mContentView= findViewById(R.id.content);
        mLoadingView= findViewById(R.id.loading_spinner);

        mContentView.setVisibility(View.GONE);

        mShortAnimationDuration = getResources().getInteger(android.R.integer.config_longAnimTime);

        crossfade();
    }

    private void crossfade(){
        mContentView.setAlpha(0f);
        mContentView.setVisibility(View.VISIBLE);

        mContentView.animate()
                .alpha(1f)
                .setDuration(1500)
                .setListener(null);

        mLoadingView.animate()
                .alpha(1f)   //  透明度控制动画效果 alpha 浮点型值：fromAlpha 属性为动画起始时透明度 toAlpha   属性为动画结束时透明度
//        说明:
//        0.0表示完全透明
//        1.0表示完全不透明
//        以上值取0.0-1.0之间的float数据类型的数字
                .setDuration(1500) //        duration  属性为动画持续时间
                .setListener(new Animator.AnimatorListener() {  //这边相应时间的回调
                    @Override
                    public void onAnimationStart(Animator animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        mLoadingView.setVisibility(View.GONE);
                        Log.e("ccc", "onAnimationEnd: 11111" );
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }
}
