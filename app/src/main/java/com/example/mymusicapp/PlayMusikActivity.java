package com.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PlayMusikActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_play_musik);
        vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void adapadenganmu(View view){
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.peterpantwo);
        mediaPlayer.start();
        vibrator.vibrate(200);
    }

    public void dibalikawan(View view){
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.peterpanthree);
        mediaPlayer.start();
        vibrator.vibrate(200);
    }

    public void khayalantingkattinggi(View view){
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.peterpanone);
        mediaPlayer.start();
        vibrator.vibrate(200);
    }

    public void walauhabisterang(View view){
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.peterpanfive);
        mediaPlayer.start();
        vibrator.vibrate(200);
    }
}
