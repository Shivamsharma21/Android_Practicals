package com.example.androidpracticals;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalenderActivity extends AppCompatActivity {


    CalendarView calendarView ;

    TextView savedate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
     calendarView = findViewById(R.id.calendarView2);
        savedate = findViewById(R.id.showsavedate);
     calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
         @Override
         public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
             String date = dayOfMonth+" / "+month+""+" / "+year;
             savedate.setText(date);
         }
     });

    }
}