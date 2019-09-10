package com.example.hp.syndicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity
{
    Button b30, b33;
    TextView t13;
    RadioButton r9, r10, r11, r12;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        b30=(Button)findViewById(R.id.button30);
        b33=(Button)findViewById(R.id.button33);
        t13=(TextView)findViewById(R.id.textView13);
        r9=(RadioButton)findViewById(R.id.radioButton9);
        r10=(RadioButton)findViewById(R.id.radioButton10);
        r11=(RadioButton)findViewById(R.id.radioButton11);
        r12=(RadioButton)findViewById(R.id.radioButton12);
        b30.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(Quiz3.this,Quiz2.class);
                startActivity(i);
                finish();
            }
        });
        b33.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(r11.isChecked())
                {
                    ++Quiz1.score;
                }
                Intent j=new Intent(Quiz3.this, Quiz4.class);
                startActivity(j);
                finish();
            }
        });
    }
}
