package com.example.atiqa.datetimepicker;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button buttonDate;
    private DatePickerDialog datePickerDialog;
    private int month;
    private int date;
    private Calendar calendar;
    private int year;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDate = findViewById(R.id.buttonDate);

        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(d);

        String[] array = formattedDate.split("-");
        Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT);



        buttonDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                date = calendar.get(Calendar.DATE);

                Date date = Calendar.getInstance().getTime();
                SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
                String formattedDate = df.format(date);

                String[] array = formattedDate.split("-");
                Toast.makeText(MainActivity.this, formattedDate, Toast.LENGTH_SHORT);

                //Toast.makeText(MainActivity.this," "+array[0]+" " + array[1] +" "+ array[2], Toast.LENGTH_SHORT);

                /*int todayDate = Integer.parseInt(array[0]);
                int todaysMonth = Integer.parseInt(array[1]);
                int todaysYear = Integer.parseInt(array[2]);*/


                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                                Toast.makeText(MainActivity.this, "hello ok ", Toast.LENGTH_SHORT);
                            }
                        }, 0, 0, 0);
                datePickerDialog.show();
            }
        });



            }



    }

