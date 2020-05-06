package com.example.apzing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView previous, pause, play, next;
    private SeekBar seekBar;
    private TextView title, currentTime, totalTime;
    ArrayList<Song> song;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void findId() {
        previous = findViewById(R.id.previous);
        pause = findViewById(R.id.pause);
        play = findViewById(R.id.play);
        next = findViewById(R.id.next);
        seekBar = findViewById(R.id.seekBar);
        title = findViewById(R.id.title);
        currentTime = findViewById(R.id.currentTime);
        totalTime = findViewById(R.id.totalTime);
    }

    private void addSong() {
//        song = new ArrayList<Song>();
//        song.add(new Song("Thích thì đến", R.);
//        song.add(new Song("Yêu vội vàng", ));
//        song.add(new Song("Bước qua đời nhau", );
    }
}
