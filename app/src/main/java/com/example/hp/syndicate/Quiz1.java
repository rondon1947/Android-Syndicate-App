package com.example.hp.syndicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz1 extends AppCompatActivity
{
    Button b26, b27;
    TextView t11;
    RadioButton r1, r2, r3, r4;
    static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        b26=(Button)findViewById(R.id.button26);
        b27=(Button)findViewById(R.id.button27);
        t11=(TextView)findViewById(R.id.textView11);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        b26.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(Quiz1.this,Activities.class);
                startActivity(i);
                finish();
            }
        });
        b27.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                score=0;
                if(r1.isChecked())
                {
                    ++score;
                }
                Intent j=new Intent(Quiz1.this, Quiz2.class);
                startActivity(j);
                finish();
            }
        });
    }
}
