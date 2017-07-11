package com.apps.franco.musicplayerapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.apps.franco.musicplayerapp.R.string.trivium;


public class Rhapsody extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhapsody);

        Button backTrivium = (Button) findViewById(R.id.BackRhapsody);
        backTrivium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backArtistrhapsody = new Intent(getBaseContext(), ListOfArtists.class);
                startActivity(backArtistrhapsody);
            }
        });

        Button purchaseTrivium = (Button) findViewById(R.id.buyRhapsody);
        purchaseTrivium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyRhapsody = new Intent(getBaseContext(), Purchase.class);
                startActivity(buyRhapsody);
            }
        });

    }
}
