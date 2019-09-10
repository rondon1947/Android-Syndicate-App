package com.example.hp.syndicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz4 extends AppCompatActivity
{
    Button b32, b35;
    TextView t14;
    RadioButton r13, r14, r15, r16;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        b32=(Button)findViewById(R.id.button32);
        b35=(Button)findViewById(R.id.button35);
        t14=(TextView)findViewById(R.id.textView14);
        r13=(RadioButton)findViewById(R.id.radioButton13);
        r14=(RadioButton)findViewById(R.id.radioButton14);
        r15=(RadioButton)findViewById(R.id.radioButton15);
        r16=(RadioButton)findViewById(R.id.radioButton16);
        b32.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(Quiz4.this,Quiz3.class);
                startActivity(i);
                finish();
            }
        });
        b35.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(r16.isChecked())
                {
                    ++Quiz1.score;
                }
                Intent j=new Intent(Quiz4.this, Quiz5.class);
                startActivity(j);
                finish();
            }
        });
    }
}
