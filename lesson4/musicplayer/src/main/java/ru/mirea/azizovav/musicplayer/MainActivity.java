package ru.mirea.azizovav.musicplayer;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ru.mirea.azizovav.musicplayer.databinding.ActivityMusicPlayerHorizontalBinding;
import ru.mirea.azizovav.musicplayer.databinding.ActivityMusicPlayerVerticalBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMusicPlayerHorizontalBinding bindingHorizontal;
    private ActivityMusicPlayerVerticalBinding bindingVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            bindingHorizontal = ActivityMusicPlayerHorizontalBinding.inflate(getLayoutInflater());
            setContentView(bindingHorizontal.getRoot());
        } else {
            bindingVertical = ActivityMusicPlayerVerticalBinding.inflate(getLayoutInflater());
            setContentView(bindingVertical.getRoot());
        }
    }
}