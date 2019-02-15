package com.example.rahulkumar.mp3player;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.media.MediaPlayer;

public class MP3 extends AppCompatActivity {

    MediaPlayer mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3);
    }



    public void radioClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        ImageView image = (ImageView)findViewById(R.id.imageView);
        if(view.getId() == R.id.eevee){
          image.setImageResource(R.drawable.eevee);
          pause();
          mp3 = MediaPlayer.create(this, R.raw.creative);
          mp3.start();

        }
        else if(view.getId() == R.id.meowth){
            image.setImageResource(R.drawable.meowth);
            pause();
            mp3 = MediaPlayer.create(this, R.raw.cute);
            mp3.start();
        }
        else if(view.getId() == R.id.pikachu){
            image.setImageResource(R.drawable.pikachu);
            pause();
            mp3 = MediaPlayer.create(this, R.raw.ukulele);
            mp3.start();
        }
    }

    public void startPlay(View view) {
        mp3.start();
    }

    public void stopPlay(View view) {
        mp3.pause();
    }

    public void pause() {
        if (mp3 != null) {
            mp3.stop();
            mp3.release();
            mp3 = null;
        }
    }

}
