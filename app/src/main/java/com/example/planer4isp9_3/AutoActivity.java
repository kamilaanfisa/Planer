package com.example.planer4isp9_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AutoActivity extends AppCompatActivity {
    Button btnLogin;
    Button btnReg;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autolayout);

        btnLogin=findViewById(R.id.button);
        btnReg = findViewById(R.id.button2);

    }
    public void BtnClickLogin(View view){
        Intent intent=new Intent(AutoActivity.this,PlanerActivity.class);
        startActivity(intent);
    }
    public void  BtnClickReg(View view2){
        Intent intent=new Intent(AutoActivity.this,RegActivity.class);
        startActivity(intent);
    }
}
