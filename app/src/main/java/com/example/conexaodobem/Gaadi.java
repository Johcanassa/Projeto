package com.example.conexaodobem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Gaadi extends AppCompatActivity {
    ImageView imgClick;
    ImageView imgwhats;
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
        setContentView(R.layout.activity_gaadi);
        imgwhats=(ImageView) findViewById(R.id.idwhats);
        imgwhats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://api.whatsapp.com/send?phone=5515998439134";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity((intent));
            }
        });
    }
}
