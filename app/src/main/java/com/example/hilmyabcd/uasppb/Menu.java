package com.example.hilmyabcd.uasppb;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button cilawu, limbangan, garutkota, samarang, bayongbong;
    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button garutkota= (Button) findViewById(R.id.garutkota);
        Button cilawu= (Button) findViewById(R.id.cilawu);
        Button limbangan= (Button) findViewById(R.id.limbangan);
        Button samarang= (Button) findViewById(R.id.samarang);
        Button bayongbong= (Button) findViewById(R.id.bayongbong);

        audio = MediaPlayer.create(this,R.raw.sound);
        audio.setLooping(true);
        audio.setVolume(1,1);
        audio.start();

        garutkota.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent i = new Intent(Menu.this,com.example.hilmyabcd.uasppb.GarutKota.class);
                startActivity(i);
            }
        });
        cilawu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent i = new Intent(Menu.this,com.example.hilmyabcd.uasppb.Cilawu.class);
                startActivity(i);
            }
        });
        bayongbong.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent i = new Intent(Menu.this,com.example.hilmyabcd.uasppb.Bayongbong.class);
                startActivity(i);
            }
        });
        samarang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent i = new Intent(Menu.this,com.example.hilmyabcd.uasppb.Samarang.class);
                startActivity(i);
            }
        });
        limbangan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent i = new Intent(Menu.this,com.example.hilmyabcd.uasppb.Limbangan.class);
                startActivity(i);
            }
        });
    }
}
