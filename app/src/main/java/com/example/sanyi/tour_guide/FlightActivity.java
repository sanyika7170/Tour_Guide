package com.example.sanyi.tour_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FlightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        getSupportFragmentManager().beginTransaction();
    }
}
