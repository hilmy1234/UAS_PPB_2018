package com.example.hilmyabcd.uasppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class Samarang extends AppCompatActivity {
    ImageButton gbrholywood, gbrtoblong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samarang);
        ImageButton gbrholywood= (ImageButton) findViewById(R.id.gbrholywood);
        ImageButton gbrtoblong= (ImageButton) findViewById(R.id.gbrtoblong);

        gbrholywood.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(Samarang.this, MapsHolywood.class);
                startActivity(i);
            }
        });

        gbrtoblong.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(Samarang.this, MapsToblong.class);
                startActivity(i);
            }
        });
    }
}
