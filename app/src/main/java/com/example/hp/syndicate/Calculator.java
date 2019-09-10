package com.example.hp.syndicate;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Calculator extends AppCompatActivity
{
    Button b16,b17,b18,b19,b20,b21,b22;
    EditText e9,e10;
    TextView t7;
    TextToSpeech ts1;
    static float f3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b16 = (Button)findViewById(R.id.button16);
        b17 = (Button)findViewById(R.id.button17);
        b18 = (Button)findViewById(R.id.button18);
        b19 = (Button)findViewById(R.id.button19);
        b20 = (Button)findViewById(R.id.button20);
        b21 = (Button)findViewById(R.id.button21);
        b22 = (Button)findViewById(R.id.button22);
        e9 = (EditText)findViewById(R.id.editText9);
        e10 = (EditText)findViewById(R.id.editText10);
        t7 = (TextView)findViewById(R.id.textView7);
        b16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(Calculator.this, Activities.class);
                startActivity(i);
                finish();
            }
        });
        b17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String s1 = e9.getText().toString();
                String s2 = e10.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                f3 = f1 + f2;
            }
        });
        b19.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String s1 = e9.getText().toString();
                String s2 = e10.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                f3 = f1 - f2;
            }
        });
        b18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String s1 = e9.getText().toString();
                String s2 = e10.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                f3 = f1 * f2;
            }
        });
        b20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String s1 = e9.getText().toString();
                String s2 = e10.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                f3 = f1 / f2;
            }
        });
        b21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent j = new Intent(Calculator.this, Calculator.class);
                startActivity(j);
                finish();
            }
        });
        ts1=new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int i)
            {
                ts1.setLanguage(Locale.ENGLISH);
                ts1.setSpeechRate(0.8f);
            }
        });
        b22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                t7.setText(Float.toString(f3));
                ts1.speak(Float.toString(f3),TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}
