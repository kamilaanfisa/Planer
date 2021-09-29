package com.example.planer4isp9_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AutoActivity extends AppCompatActivity {
    Button btnLogin;
    Button btnReg;
    TextView login;
    TextView password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autolayout);

        btnLogin=findViewById(R.id.button);
        btnReg = findViewById(R.id.button2);
        login=findViewById(R.id.etLogin);
        password=findViewById(R.id.etPassword);
    }
    public void BtnClickLogin(View view){
        if (login.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(),"Готово!",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(AutoActivity.this,PlanerActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Неверно!!!",Toast.LENGTH_SHORT).show();
        }

    }
    public void  BtnClickReg(View view2){
        Intent intent=new Intent(AutoActivity.this,RegActivity.class);
        startActivity(intent);
    }
}
