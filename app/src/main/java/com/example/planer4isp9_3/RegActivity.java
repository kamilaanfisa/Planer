package com.example.planer4isp9_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reglayout);
    }
    public void BtnClickProd(View view){
        Intent intent=new Intent(RegActivity.this,PlanerActivity.class);
        startActivity(intent);
    }
    public void BtnClickBack(View view){
        Intent intent=new Intent(RegActivity.this,AutoActivity.class);
        startActivity(intent);
    }
}
