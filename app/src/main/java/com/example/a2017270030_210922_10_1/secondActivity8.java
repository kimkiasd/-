package com.example.a2017270030_210922_10_1;

import android.app.Activity;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;



public class secondActivity8 extends Activity implements SensorEventListener {

    TextView tv_sensor;
    Button mbtn, mbtn2;
    SensorManager sm;
    Sensor sensor_step_detector;
    Chronometer chrono;

    int steps = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second8);




            chrono = (Chronometer) findViewById(R.id.chronometer1);
            mbtn = findViewById(R.id.mbtn);
            mbtn2 = findViewById(R.id.mbtn2);
            tv_sensor = findViewById(R.id.sensor);
            tv_sensor.setText("0");

            sm = (SensorManager) getSystemService(SENSOR_SERVICE);
            sensor_step_detector = sm.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR);

            mbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    chrono.setBase(SystemClock.elapsedRealtime());
                    chrono.start();
                    chrono.setTextColor(Color.RED);
                }
            });
            mbtn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    chrono.stop();
                    chrono.setTextColor(Color.BLUE);
                }
            });

        }
        protected void onResume () {
            super.onResume();

            sm.registerListener(this, sensor_step_detector, SensorManager.SENSOR_DELAY_NORMAL);
        }
        protected void onPause () {
            super.onPause();
            sm.unregisterListener(this);
        }


        @Override
        public void onAccuracyChanged(Sensor sensor,int accuracy){

        }
        @Override
        public void onSensorChanged(SensorEvent sensorEvent){

            switch (sensorEvent.sensor.getType()) {
                case Sensor.TYPE_STEP_DETECTOR:
                    tv_sensor.setText("" + (++steps));
                    break;
            }

        }


    }