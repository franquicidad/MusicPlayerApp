package com.apps.franco.musicplayerapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.apps.franco.musicplayerapp.R.string.trivium;


public class Killswitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_killswitch);

        Button backTrivium = (Button) findViewById(R.id.BackKills);
        backTrivium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backArtistKills = new Intent(getBaseContext(), ListOfArtists.class);
                startActivity(backArtistKills);
            }
        });

        Button purchaseTrivium = (Button) findViewById(R.id.BuyKills);
        purchaseTrivium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyKills = new Intent(getBaseContext(), Purchase.class);
                startActivity(buyKills);
            }
        });
    }
}