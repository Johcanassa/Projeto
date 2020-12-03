package com.example.conexaodobem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LardosIdosos extends AppCompatActivity {

    ImageView imgClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lardos_idosos);
        imgClick = (ImageView)findViewById(R.id.idlocalizar);
        imgClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LardosIdosos.this, MapsActivity.class);
                startActivity(it);
            }
        });
    }
}
