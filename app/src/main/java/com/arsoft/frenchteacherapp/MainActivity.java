package com.arsoft.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button redBtn, blackBtn, greenBtn, yellowBtn, purpleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redBtn = findViewById(R.id.redBtn);
        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        yellowBtn = findViewById(R.id.yellowBtn);
        purpleBtn = findViewById(R.id.purpleBtn);

        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        // Find the button by ID and play the correct sound

        int clickedBtnId = v.getId();

        if (clickedBtnId == R.id.redBtn){
            playSound(R.raw.red);
        } else if(clickedBtnId == R.id.blackBtn){
            playSound(R.raw.black);
        } else if (clickedBtnId == R.id.greenBtn) {
            playSound(R.raw.green);
        } else if (clickedBtnId == R.id.purpleBtn) {
            playSound(R.raw.purple);
        } else if (clickedBtnId == R.id.yellowBtn) {
            playSound(R.raw.yellow);
        }

    }

    public void playSound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }

}