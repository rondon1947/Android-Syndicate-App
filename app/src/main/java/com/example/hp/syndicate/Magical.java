package com.example.hp.syndicate;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Magical extends AppCompatActivity implements SensorEventListener
{
    MediaPlayer mp;
    SensorManager sm;
    Sensor s;
    Button b25;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magical);
        b25=(Button)findViewById(R.id.button25);
        mp=MediaPlayer.create(this, R.raw.g);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b25.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mp.stop();
                Intent i = new Intent(Magical.this, Activities.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent)
    {
        if(sensorEvent.values[0]>3)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i)
    {

    }
}
