package com.apps.franco.musicplayerapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Trivium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivium);

        Button backTrivium = (Button) findViewById(R.id.BackTrivium);
        backTrivium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backArtistTrivium = new Intent(getBaseContext(), ListOfArtists.class);
                startActivity(backArtistTrivium);
            }
        });

        Button purchaseTrivium = (Button) findViewById(R.id.BuyTrivium);
        purchaseTrivium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyTrivium = new Intent(getBaseContext(), Purchase.class);
                startActivity(buyTrivium);
            }
        });

    }
}
