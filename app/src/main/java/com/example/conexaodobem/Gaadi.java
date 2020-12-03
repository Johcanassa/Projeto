package com.example.conexaodobem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Gaadi extends AppCompatActivity {
    ImageView imgClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaadi);
        imgClick = (ImageView)findViewById(R.id.idlocalizar);
        imgClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Gaadi.this, MapsActivity.class);
                startActivity(it);
            }
        });
    }
}
