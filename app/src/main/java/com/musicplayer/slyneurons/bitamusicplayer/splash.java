package com.musicplayer.slyneurons.bitamusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread a = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(6000);
                }
                catch(Exception e)
                {
                    Toast.makeText(splash.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                finally
                {
                    startActivity(new Intent(splash.this,login.class));
                }

            }
        });a.start();
    }
}
