package com.example.androidpracticals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleAcitivity extends AppCompatActivity {

    String data;

    EditText username;

    Button seeToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_acitivity);

        seeToast = findViewById(R.id.toast_btn);
        username = findViewById(R.id.name_edittext);


        seeToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        data   = username.getText().toString();

                Toast.makeText(SimpleAcitivity.this,"Hello "+data , Toast.LENGTH_SHORT).show();

            }
        });
    }
}