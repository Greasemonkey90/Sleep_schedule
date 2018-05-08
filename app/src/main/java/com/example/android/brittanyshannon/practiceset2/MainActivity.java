package com.example.android.brittanyshannon.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int weekdayHours = 6;
    int weekendHours= 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void display(String hours) {
        TextView wDay=  findViewById(R.id.results1);
        wDay.setText(hours);
    }

    public void display1(View view) {
        weekdayHours = 7;
        String converted = Integer.toString(weekdayHours);
        display(converted);
    }

    private void display2(String hours) {
        TextView wEnd = findViewById(R.id.results2);
        wEnd.setText(hours);
    }
    public void displayA(View view) {
        weekendHours = 10;
        String converted = Integer.toString(weekendHours);
        display2(converted);
    }

    private void display3(String total) {
        TextView finalResults =  findViewById(R.id.totalHours);
        finalResults.setText(total);
    }

    public void displayB(View view) {
        int wDayHours = weekdayHours * 5;
        int wEndHours = weekendHours *2;
        int totalHours = wDayHours + wEndHours;
        String finalShow = Integer.toString(totalHours);
        display3(finalShow);

    }

}
