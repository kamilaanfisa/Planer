package com.example.planer4isp9_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread= new Thread(){
            public void run(){
                try{
                    TimeUnit.SECONDS.sleep(8);
                    Intent intent=new Intent(MainActivity.this, AutoActivity.class);
                    startActivity(intent);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };thread.start();

    }
}