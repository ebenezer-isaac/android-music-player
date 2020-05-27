package com.musicplayer.slyneurons.bitamusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Timer;
import java.util.TimerTask;

public class player extends AppCompatActivity {
    ImageView img1 ;
    ImageButton ib1;
    ImageButton ib2;
    ImageButton ib3;
    SeekBar sb1;
    int flag = 0; int a = 1;
    MediaPlayer song;
    public void prevsong (View prev)
    {
        a--;
        if(a==0)
        {a = 10;}
        playmusic(a);
        song.start();
        ib2.setImageResource(R.drawable.stop);flag = 1;
    }
    public void playsong (View play)
    {
        if(flag == 0)
        {
            ib2.setImageResource(R.drawable.stop);
            song.start();flag = 1;
        }
        else
        {
            ib2.setImageResource(R.drawable.play);
            song.pause();flag = 0;
        }
    }
    public void nextsong (View next)
    {
        a++;
        if(a==11)
        {a = 1;}
        playmusic(a);
        song.start();
        ib2.setImageResource(R.drawable.stop);flag = 1;

    }
    public void playmusic(int x)
    {a=x;
        switch(a)
        {
            case 1: song.stop();song = MediaPlayer.create(player.this,R.raw.first);img1.setImageResource(R.drawable.first);break;
            case 2: song.stop();song = MediaPlayer.create(player.this,R.raw.second);img1.setImageResource(R.drawable.second);break;
            case 3: song.stop();song = MediaPlayer.create(player.this,R.raw.third);img1.setImageResource(R.drawable.third);break;
            case 4: song.stop();song = MediaPlayer.create(player.this,R.raw.fourth);img1.setImageResource(R.drawable.fourth);break;
            case 5: song.stop();song = MediaPlayer.create(player.this,R.raw.fifth);img1.setImageResource(R.drawable.fifth);break;
            case 6: song.stop();song = MediaPlayer.create(player.this,R.raw.six);img1.setImageResource(R.drawable.six);break;
            case 7: song.stop();song = MediaPlayer.create(player.this,R.raw.seven);img1.setImageResource(R.drawable.seven);break;
            case 8: song.stop();song = MediaPlayer.create(player.this,R.raw.eight);img1.setImageResource(R.drawable.eight);break;
            case 9: song.stop();song = MediaPlayer.create(player.this,R.raw.nine);img1.setImageResource(R.drawable.nine);break;
            case 10:song.stop();song = MediaPlayer.create(player.this,R.raw.ten);img1.setImageResource(R.drawable.ten);break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        img1 = findViewById(R.id.img2);
        ib1 = findViewById(R.id.ib1);
        ib2 = findViewById(R.id.ib2);
        ib3 = findViewById(R.id.ib3);
        sb1 = findViewById(R.id.sb1);
        song = MediaPlayer.create(player.this,R.raw.first);
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                sb1.setProgress(song.getCurrentPosition());
            }
        },0,100);
        sb1.setMax(song.getDuration());
    }
}
