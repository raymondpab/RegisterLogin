package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView Textuser=(TextView) findViewById(R.id.TextUser);
        SharedPreferences sharedPref=getSharedPreferences("MyPREF", MODE_PRIVATE);


        String name = sharedPref.getString("name","");
        Textuser.setText(name);

    }
}
