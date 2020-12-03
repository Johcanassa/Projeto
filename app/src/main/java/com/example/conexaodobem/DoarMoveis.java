package com.example.conexaodobem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DoarMoveis extends AppCompatActivity {
    TextView txLardosidoso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doar_moveis);
        carregaWidgets();
        carregatelaLardosIdosos();
    }

    private void carregaWidgets() {
        txLardosidoso = findViewById(R.id.txtmelhoridade);
    }


    private void carregatelaLardosIdosos() {
        txLardosidoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarMoveis.this, LardosIdosos.class);
                startActivity(it);
            }
        });
    }
}





