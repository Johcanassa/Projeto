package com.example.conexaodobem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class doutoresdaalegria extends AppCompatActivity {
    ImageView imgwhats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doutoresdaalegria);
        imgwhats=(ImageView) findViewById(R.id.idwhats);
        imgwhats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://api.whatsapp.com/send?phone=5515998075732";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity((intent));
            }
        });
    }
}