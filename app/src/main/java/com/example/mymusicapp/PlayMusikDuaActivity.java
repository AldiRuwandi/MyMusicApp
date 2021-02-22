package com.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PlayMusikDuaActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_play_musik_dua);
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void pejantantangguh(View view){
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.pejantantangguh);
        mediaPlayer.start();
        vibrator.vibrate(200);
    }

    public void anugrahterindah(View view){
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.anugrahterindah);
        mediaPlayer.start();
        vibrator.vibrate(200);
    }

    public void melompatlebihtinggi(View view){
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.melompatlebihtinggi);
        mediaPlayer.start();
        vibrator.vibrate(200);
    }

    public void sahabatsejati(View view){
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.sahabatsejati);
        mediaPlayer.start();
        vibrator.vibrate(200);
    }
}
