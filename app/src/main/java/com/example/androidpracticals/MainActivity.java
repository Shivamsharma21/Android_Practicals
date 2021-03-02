package com.example.androidpracticals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Linearlayoutbtn,Relativelayoutbtn,_SeeToast,
            Switch,calenderexample,spinnerExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initiliaze();

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

        calenderexample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CalenderActivity.class);
                startActivity(intent);

            }
        });

        spinnerExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SpinnerExample.class);
                startActivity(intent);
            }
        });



    }

public void Initiliaze(){

    Linearlayoutbtn = findViewById(R.id.button);
    Relativelayoutbtn = findViewById(R.id.button2);
    _SeeToast = findViewById(R.id.button3);
    Switch = findViewById(R.id.button4);
    calenderexample = findViewById(R.id.button5);
    spinnerExample = findViewById(R.id.button6);

}



}