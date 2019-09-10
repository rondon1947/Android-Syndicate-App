package com.example.hp.syndicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz5 extends AppCompatActivity
{
    Button b34,b36;
    TextView t15;
    RadioButton r17, r18, r19, r20;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        b34=(Button)findViewById(R.id.button34);
        b36=(Button)findViewById(R.id.button36);
        t15=(TextView)findViewById(R.id.textView15);
        r17=(RadioButton)findViewById(R.id.radioButton17);
        r18=(RadioButton)findViewById(R.id.radioButton18);
        r19=(RadioButton)findViewById(R.id.radioButton19);
        r20=(RadioButton)findViewById(R.id.radioButton20);
        b34.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(Quiz5.this,Quiz4.class);
                startActivity(i);
                finish();
            }
        });
        b36.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(r17.isChecked())
                {
                    ++Quiz1.score;
                }
                Intent j=new Intent(Quiz5.this, Score.class);
                startActivity(j);
                finish();
            }
        });
    }
}
