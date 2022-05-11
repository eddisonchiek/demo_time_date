package sg.edu.sg.c346.id21034014.demotimeanddateapp;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp =findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.btnDisplayDate);
        btnDisplayTime = findViewById(R.id.btnDisplayTime);
        tvDisplay = findViewById(R.id.tvDisplay);
        btnReset = findViewById(R.id.btnReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    tvDisplay.setText("Time is " + tp.getCurrentHour()+":"+tp.getCurrentMinute());



            }

            });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    int month = dp.getMonth() + 1;
                    tvDisplay.setText("Date is " + dp.getDayOfMonth()+"/"+month +"/"+dp.getYear());}


                });
                btnReset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                           tp.setCurrentHour(0);
                           tp.setCurrentMinute(0);


                           dp.updateDate(2020,0,01);
                        }




                });


        ;}}
