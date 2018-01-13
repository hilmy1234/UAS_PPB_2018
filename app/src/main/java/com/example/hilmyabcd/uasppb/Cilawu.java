package com.example.hilmyabcd.uasppb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cilawu extends AppCompatActivity {
ImageButton gbrpanamur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilawu);
        ImageButton gbrpanamur= (ImageButton) findViewById(R.id.gbrpanamur);

        gbrpanamur.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {

                Intent i = new Intent(Cilawu.this, MapsPanamur.class);
                startActivity(i);
            }
        });
    }
}
