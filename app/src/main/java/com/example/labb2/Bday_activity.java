package com.example.labb2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Visar användaren en bild samt spelar upp ett ljud när aktiviteten visas
 *
 *
 * @author (Arvid Kellström)
 * @version 1.0
 * @since   (2021-01-26)
 */
public class Bday_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bday_activity);
        callSound();
        makeToast();
    }

    //spelar ljudfilen "cher.mp3"
    public void callSound(){
        MediaPlayer cher = MediaPlayer.create(Bday_activity.this,R.raw.cher);
        cher.start();
    }
    // Visar en Toast som säger "Grattis på Födelsedagen!"
    public void makeToast(){
        String message = getString(R.string.bdayToast);
        Toast bdayToast = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG );
        bdayToast.show();
    }
}