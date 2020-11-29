package com.example.registerlogin;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText username=(EditText)findViewById(R.id.etUsername);
        final EditText password=(EditText)findViewById(R.id.etPassword);
        final EditText rtpass=(EditText)findViewById(R.id.rtPass);
        Button register=(Button) findViewById(R.id.reg);




        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                String newUser = username.getText().toString();
                String newPass = password.getText().toString();
                String rtPass = rtpass.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(newUser + newPass +"data", newUser + "\n" + rtPass);
                editor.commit();

                Toast.makeText(getApplicationContext(), "You are Registered! Welcome!", Toast.LENGTH_SHORT).show();

                Intent intent3=new Intent(register.this,MainActivity.class);
                startActivity(intent3);
            }
        });




    }
}
