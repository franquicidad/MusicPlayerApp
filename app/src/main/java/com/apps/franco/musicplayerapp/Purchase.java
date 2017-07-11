package com.apps.franco.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Franco on 27/06/17.
 */

public class Purchase extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        Button back = (Button) findViewById(R.id.back_to_artist);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back1 = new Intent(getBaseContext(), ListOfArtists.class);
                startActivity(back1);
            }
        });

        Button backmain=(Button)findViewById(R.id.back_to_main);
        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backmainbut=new Intent(getBaseContext(),MainActivity.class);
                startActivity(backmainbut);
            }
        });
    }

    // In this class i researched about payments in this webpage
    //https://developers.google.com/android-pay/tutorial
}
