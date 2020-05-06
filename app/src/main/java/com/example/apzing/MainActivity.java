package com.example.apzing;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ImageView previous, pause, play, next, imageSong;
    private SeekBar seekBar;
    private TextView title, currentTime, totalTime;
    ArrayList<Song> song;
    int position = 0;
    MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        addSong();
        createMedia();
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    play.setImageResource(R.drawable.pause);
                }
                else {
                    mediaPlayer.start();
                    play.setImageResource(R.drawable.player);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                position = position + 1;
                if(position >= song.size()) {
                    position = 0;
                }
                createMedia();
                play.setImageResource(R.drawable.player);
                mediaPlayer.start();
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                position = position - 1;
                if(position < 0) {
                    position = song.size() - 1;
                }
                createMedia();
                play.setImageResource(R.drawable.player);
                mediaPlayer.start();
            }
        });
    }
    private  void createMedia() {
        mediaPlayer = MediaPlayer.create(MainActivity.this, song.get(position).getFile());
        title.setText(song.get(position).getTitle());
        imageSong.setImageResource(song.get(position).getImageSong());
    }
    private void findId() {
        previous = findViewById(R.id.previous);
//        pause = findViewById(R.id.pause);
        imageSong = findViewById(R.id.imageSong);
        play = findViewById(R.id.play);
        next = findViewById(R.id.next);
        seekBar = findViewById(R.id.seekBar);
        title = findViewById(R.id.title);
        currentTime = findViewById(R.id.currentTime);
        totalTime = findViewById(R.id.totalTime);
    }

    private void addSong() {
        song = new ArrayList<Song>();
        song.add(new Song("Thích thì đến", R.raw.thichthiden, R.drawable.thichthiden));
        song.add(new Song("Yêu vội vàng", R.raw.yeuvoivang, R.drawable.yeuvoivang));
        song.add(new Song("Bước qua đời nhau", R.raw.buocquadoinhau, R.drawable.buocquadoinhau));
    }
}
