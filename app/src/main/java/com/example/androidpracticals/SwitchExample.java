package com.example.androidpracticals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class SwitchExample extends AppCompatActivity {

    SwitchCompat switchCompat ;

    ImageView ledbulb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_example);

    switchCompat =  findViewById(R.id.switch1);
    ledbulb = findViewById(R.id.imageView);

    switchCompat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (switchCompat.isChecked()){

                ledbulb.setImageDrawable(getResources().getDrawable(R.drawable.light_on));

            }else{
                ledbulb.setImageDrawable(getResources().getDrawable(R.drawable.light_off));

            }
        }
    });
    }

}