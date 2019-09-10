package com.example.hp.syndicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity
{
    Button b29, b37, b38, b39, b40;
    TextView t16;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        b29 = (Button)findViewById(R.id.button29);
        b37 = (Button)findViewById(R.id.button37);
        b38 = (Button)findViewById(R.id.button38);
        b39 = (Button)findViewById(R.id.button39);
        b40 = (Button)findViewById(R.id.button40);
        t16 = (TextView)findViewById(R.id.textView16);
        w1 = (WebView)findViewById(R.id.webView);
        t16.setText("Your score is = " + Integer.toString(Quiz1.score));
        b39.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(Score.this, Activities.class);
                startActivity(i);
                finish();
            }
        });
        b29.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                w1.loadUrl("https://www.facebook.com/netcamp.in/?ref=br_rs");
            }
        });
        b37.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                w1.loadUrl("https://twitter.com/santupurkait");
            }
        });
        b38.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                w1.loadUrl("https://www.netcamp.in/");
            }
        });
        b40.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent j = new Intent(Score.this, Login.class);
                startActivity(j);
                finish();
            }
        });
    }
}
