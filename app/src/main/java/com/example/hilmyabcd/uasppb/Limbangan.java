package com.example.hilmyabcd.uasppb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Limbangan extends AppCompatActivity {
    ImageButton gbrbifons, gbrgallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limbangan);
        ImageButton gbrbifons= (ImageButton) findViewById(R.id.gbrbifons);
        ImageButton gbrgallery= (ImageButton) findViewById(R.id.gbrgallery);

        gbrbifons.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(Limbangan.this, MapsBifons.class);
                startActivity(i);
            }
        });

        gbrgallery.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(Limbangan.this, MapsGallery.class);
                startActivity(i);
            }
        });
    }
}
