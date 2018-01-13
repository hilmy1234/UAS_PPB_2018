package com.example.hilmyabcd.uasppb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GarutKota extends AppCompatActivity {
    ImageButton gbrball, gbrsudirman, gbrpesona, gbrtitan, gbrrcm, gbrsss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garut_kota);
        ImageButton gbrball= (ImageButton) findViewById(R.id.gbrball);
        ImageButton gbrsudirman= (ImageButton) findViewById(R.id.gbrsudirman);
        ImageButton gbrpesona= (ImageButton) findViewById(R.id.gbrpesona);
        ImageButton gbrtitan= (ImageButton) findViewById(R.id.gbrtitan);
        ImageButton gbrrcm= (ImageButton) findViewById(R.id.gbrrcm);
        ImageButton gbrsss= (ImageButton) findViewById(R.id.gbrsss);

        gbrball.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(GarutKota.this, MapsBall.class);
                startActivity(i);
            }
        });

        gbrsudirman.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(GarutKota.this, com.example.hilmyabcd.uasppb.MapsSudirman.class);
                startActivity(i);
            }
        });

        gbrpesona.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(GarutKota.this, com.example.hilmyabcd.uasppb.MapsPesona.class);
                startActivity(i);
            }
        });

        gbrtitan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(GarutKota.this, com.example.hilmyabcd.uasppb.MapsTitan.class);
                startActivity(i);
            }
        });

        gbrrcm.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(GarutKota.this, com.example.hilmyabcd.uasppb.MapsRCM.class);
                startActivity(i);
            }
        });

        gbrsss.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(GarutKota.this, com.example.hilmyabcd.uasppb.MapsSSS.class);
                startActivity(i);
            }
        });
    }
}
