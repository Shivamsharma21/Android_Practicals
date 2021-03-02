package com.example.androidpracticals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Linearlayoutbtn,Relativelayoutbtn,_SeeToast,Switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Linearlayoutbtn = findViewById(R.id.button);
      Relativelayoutbtn = findViewById(R.id.button2);
      _SeeToast = findViewById(R.id.button3);
      Switch = findViewById(R.id.button4);

      Linearlayoutbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,LayoutExample.class);
              startActivity(intent);
          }
      });

      Relativelayoutbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,RelativeLayoutExample.class);
              startActivity(intent);
          }
      });

    _SeeToast.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MainActivity.this,SimpleAcitivity.class);
            startActivity(intent);

        }
    });

    Switch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,SwitchExample.class);
            startActivity(intent);
        }
    });

    }
}