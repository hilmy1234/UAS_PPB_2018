package com.example.hilmyabcd.uasppb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bayongbong extends AppCompatActivity {
    ImageButton gbrggss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayongbong);
        ImageButton gbrggss= (ImageButton) findViewById(R.id.gbrggss);

        gbrggss.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(Bayongbong.this, MapsGGSS.class);
                startActivity(i);
            }
        });
    }
}
