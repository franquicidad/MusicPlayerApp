package com.apps.franco.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ListOfArtists extends AppCompatActivity {

    TextView trivium;
    TextView rhapsody;
    TextView killswitch;
    TextView protest;
    TextView avenged;
    TextView ac;
    TextView disturbed;
    Button purchase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_artists);

        trivium = (TextView) findViewById(R.id.triviumsel);
        rhapsody = (TextView) findViewById(R.id.Rhapsody);
        killswitch = (TextView) findViewById(R.id.killswitch);


        trivium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent triviumInt = new Intent(getBaseContext(), Trivium.class);
                startActivity(triviumInt);
            }
        });
        rhapsody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rhapsodyInt = new Intent(getBaseContext(), Rhapsody.class);
                startActivity(rhapsodyInt);

            }
        });
        killswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent killswitchInt = new Intent(getBaseContext(), Killswitch.class);
                startActivity(killswitchInt);

            }
        });


    }


}
