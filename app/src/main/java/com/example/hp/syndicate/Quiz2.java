package com.example.hp.syndicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz2 extends AppCompatActivity
{
    Button b28, b31;
    TextView t12;
    RadioButton r5, r6, r7, r8;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        b28=(Button)findViewById(R.id.button28);
        b31=(Button)findViewById(R.id.button31);
        t12=(TextView)findViewById(R.id.textView12);
        r5=(RadioButton)findViewById(R.id.radioButton5);
        r6=(RadioButton)findViewById(R.id.radioButton6);
        r7=(RadioButton)findViewById(R.id.radioButton7);
        r8=(RadioButton)findViewById(R.id.radioButton8);
        b28.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(Quiz2.this,Quiz1.class);
                startActivity(i);
                finish();
            }
        });
        b31.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(r6.isChecked())
                {
                    ++Quiz1.score;
                }
                Intent j=new Intent(Quiz2.this, Quiz3.class);
                startActivity(j);
                finish();
            }
        });
    }
}
