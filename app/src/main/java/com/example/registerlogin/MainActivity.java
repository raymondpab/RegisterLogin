package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button btnlogin;
    Button btnregister;
    SharedPreferences sharedpref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.passWord);
        btnlogin=(Button) findViewById(R.id.btnLogin);
        btnregister=(Button) findViewById(R.id.btnRegister);
        sharedpref=getSharedPreferences("MyPREF", MODE_PRIVATE);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().isEmpty()&&password.getText().toString().isEmpty()) {
                   Toast.makeText(MainActivity.this, "Welcome! Successfully Logged In!", Toast.LENGTH_SHORT).show();
                }else {
                    Intent loginScreen=new Intent(MainActivity.this,display.class);
                    startActivity(loginScreen);
                }
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen = new Intent(MainActivity.this, register.class);
                startActivity(loginScreen);
            }
        });




        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Intent registerScreen = new Intent(MainActivity.this,display.class);
              startActivity(registerScreen);
            }
        });




    }
}
