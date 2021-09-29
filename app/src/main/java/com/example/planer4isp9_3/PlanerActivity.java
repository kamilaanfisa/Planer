package com.example.planer4isp9_3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlanerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planerlayout);
    }

    public  void  btnAddClick(View view){
        TextView textView= new TextView(PlanerActivity.this);
        textView.setBackgroundResource(R.drawable.zametka);
        
    }

}
