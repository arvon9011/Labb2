package com.example.labb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
/**
 * Visar användaren två knappar och hanterar dom.
 *
 *
 * @author (Arvid Kellström)
 * @version 1.0
 * @since   (2021-01-26)
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// skapar en ny intent kopplad till "second_activity" och skickar användaren till den
    public void handleSnowBall(View v){
        Intent intent = new Intent(this, second_activity.class);
        startActivity(intent);

    }

    // skapar en ny intent kopplad till "Bday_activity" och skickar användaren till den
    public void handleBdayButton(View view) {
        Intent bdayIntent = new Intent(this, Bday_activity.class);
        startActivity(bdayIntent);
    }
}