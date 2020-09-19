package com.example.countdounttimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnStart;
    ImageView mImgView;
    boolean mIsrunning = false;
    int mArrayImage[];
    int mCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStart = findViewById(R.id.btnStart);
        mImgView = findViewById(R.id.imgView);
        mArrayImage = new int[]{
                        R.drawable.h1,
                        R.drawable.h2,
                        R.drawable.h3,
                        R.drawable.h4,
                        R.drawable.h5,
                        R.drawable.h6
                };
        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mIsrunning)
                {
                    CountDownTimer countDownTimer = new CountDownTimer(6100,1000) {
                        @Override
                        public void onTick(long l) {
                          if (l>1000)
                          {
                                 mImgView.setImageResource(mArrayImage[mCount++]);
                          }
                        }
                        @Override
                        public void onFinish() {

                        }
                    };
                    countDownTimer.start();
                }
            }
        });

    }
}