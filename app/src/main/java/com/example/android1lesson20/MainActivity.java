package com.example.android1lesson20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class MainActivity extends AppCompatActivity {
        ImageView imageView;
        Button dog,cat,squirrel,btnB;
        boolean isDog,isCat,isSquirrel;
        CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initClickers();
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.Shake)
                        .duration(300)
                        .repeat(3)
                        .playOn(findViewById(R.id.btn_button));
                btnB.setBackgroundResource(R.drawable.correct);
            }
        });
    }

    private void initViews() {
        imageView = findViewById(R.id.image_animal);
        dog = findViewById(R.id.dog_btn);
        cat=findViewById(R.id.cat_btn);
        squirrel=findViewById(R.id.squirrel_btn);
        btnB = findViewById(R.id.btn_button);

    }


    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.change_image_btn1:
                imageView.setImageResource(R.drawable.dog);
                isDog=true;
                isCat=false;
                isSquirrel=false;
                break;
            case R.id.change_image_btn2:
                imageView.setImageResource(R.drawable.cat);
                isCat=true;
                isSquirrel=false;
                isDog=false;
                break;
            case R.id.change_image_btn3:
                imageView.setImageResource(R.drawable.squirrel);
                isSquirrel=true;
                isDog=false;
                isCat=false;
                break;
        }
    }

    private void initClickers() {
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDog){
                    countDownTimer = new CountDownTimer(5000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(700)
                                    .repeat(5)
                                    .playOn(findViewById(R.id.dog_btn));
                            dog.setBackgroundResource(R.drawable.correct);
                        }

                        @Override
                        public void onFinish() {
                            dog.setBackgroundResource(R.drawable.deffault);
                        }
                    }.start();

                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                }else {
                    countDownTimer = new CountDownTimer(5000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Shake)
                                    .duration(300)
                                    .repeat(3)
                                    .playOn(findViewById(R.id.dog_btn));
                            dog.setBackgroundResource(R.drawable.incorrect);
                        }
                        @Override
                        public void onFinish() {
                            cat.setBackgroundResource(R.drawable.deffault);
                        }
                    }.start();
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCat){
                    countDownTimer = new CountDownTimer(3000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(3)
                                    .playOn(findViewById(R.id.cat_btn));
                            cat.setBackgroundResource(R.drawable.correct);
                        }
                        @Override
                        public void onFinish() {
                            cat.setBackgroundResource(R.drawable.deffault);
                        }
                    }.start();
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                }else {
                    countDownTimer = new CountDownTimer(3000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Shake)
                                    .duration(300)
                                    .repeat(3)
                                    .playOn(findViewById(R.id.cat_btn));
                            cat.setBackgroundResource(R.drawable.incorrect);
                        }
                        @Override
                        public void onFinish() {
                            cat.setBackgroundResource(R.drawable.deffault);
                        }
                    }.start();
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        squirrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSquirrel){
                    countDownTimer = new CountDownTimer(3000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(3)
                                    .playOn(findViewById(R.id.squirrel_btn));
                            squirrel.setBackgroundResource(R.drawable.correct);
                        }
                        @Override
                        public void onFinish() {
                            squirrel.setBackgroundResource(R.drawable.deffault);
                        }
                    }.start();
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                }else {
                    countDownTimer = new CountDownTimer(3000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Shake)
                                    .duration(300)
                                    .repeat(3)
                                    .playOn(findViewById(R.id.squirrel_btn));
                            squirrel.setBackgroundResource(R.drawable.incorrect);
                        }
                        @Override
                        public void onFinish() {
                            squirrel.setBackgroundResource(R.drawable.deffault);
                        }
                    }.start();
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
