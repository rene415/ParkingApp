package com.rene.parkingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverSpotterActivity extends AppCompatActivity {
    private Button mDriver, mSpotter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_spotter);
        mDriver = (Button) findViewById(R.id.driver);
        mSpotter = (Button) findViewById(R.id.spotter);

        mDriver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(DriverSpotterActivity.this, DriverLocationActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mSpotter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(DriverSpotterActivity.this, SpotterLocationActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
