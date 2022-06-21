package com.kmitsolution.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btntranslate,btnscale,btnrotate,btnalpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.txt);
        btntranslate=findViewById(R.id.btntranslate);
        btnscale=findViewById(R.id.btnscale);
        btnalpha=findViewById(R.id.btnalpha);
        btnrotate=findViewById(R.id.btnrotate);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.move);
        Animation alpha= AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation scale= AnimationUtils.loadAnimation(this,R.anim.scale);
        Animation rotate= AnimationUtils.loadAnimation(this,R.anim.rotate);
        btntranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.startAnimation(anim);
            }
        });
        btnrotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.startAnimation(rotate);
            }
        });
        btnalpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.startAnimation(alpha);
            }
        });
        btnscale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.startAnimation(scale);
            }
        });
    }
}