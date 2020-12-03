package com.example.conexaodobem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DoarBrinquedos extends AppCompatActivity {
    TextView txgaadi, txLardosidoso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doar_brinquedos);
        carregaWidgets();
        carregatelaGaadi();
        carregatelaLardosIdosos();
    }

    private void carregatelaLardosIdosos() {
        txLardosidoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(DoarBrinquedos.this,LardosIdosos.class);
                startActivity(it);
            }
        });
    }

    private void carregaWidgets() {
        txgaadi = findViewById(R.id.txtgaadi);
        txLardosidoso = findViewById(R.id.txtmelhoridade);
    }

    private void carregatelaGaadi() {
        txgaadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarBrinquedos.this, Gaadi.class);
                startActivity(it);

            }
        });
    }
}





