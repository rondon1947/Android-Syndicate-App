package com.example.hp.syndicate;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicPlayer extends AppCompatActivity
{
    Button b13,b14,b15;
    TextView t5;
    ImageView i1;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        t5=(TextView)findViewById(R.id.textView5);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        i1=(ImageView)findViewById(R.id.imageView3);
        mp=MediaPlayer.create(this,R.raw.a);
        b13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mp.pause();
                Intent i = new Intent(MusicPlayer.this, Activities.class);
                startActivity(i);
                finish();
            }
        });
        b14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mp.start();
            }
        });
        b15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mp.pause();
            }
        });
    }
}
