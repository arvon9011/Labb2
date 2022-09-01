package com.example.labb2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;
 /** Visar användaren en bild samt spelar upp ett ljud när aktiviteten visas
  *@author (Arvid Kellström)
  *@version 1.0
  *@since   (2021-01-26)
 */
public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        callSound();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        makeToast();
    }
//spelar ljudfilen "crash.mp3"
    public void callSound(){
        MediaPlayer crack = MediaPlayer.create(second_activity.this,R.raw.crash);
        crack.start();
    }

    // Visar en Toast som säger "Hoppsan!"
    public void makeToast(){
        String message = getString(R.string.crackToast);
        Toast crackToast = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG );
        crackToast.show();
    }

}