package com.example.conexaodobem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DoarCobertores extends AppCompatActivity {
    TextView txgaadi, txLardosidoso,txAlojamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doar_cobertores);
        carregaWidgets();
        carregatelaGaadi();
        carregatelaLardosIdosos();
        carregatelaAlojamento();
    }

    private void carregatelaAlojamento() {
        txAlojamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarCobertores.this,AlojamentoComunitario.class);
                startActivity(it);
            }
        });
    }

    private void carregatelaLardosIdosos() {
        txLardosidoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(DoarCobertores.this,LardosIdosos.class);
                startActivity(it);
            }
        });
    }

    private void carregaWidgets() {
        txgaadi = findViewById(R.id.txtgaadi);
        txLardosidoso = findViewById(R.id.txtmelhoridade);
        txAlojamento = findViewById(R.id.txtalojamento);
    }

    private void carregatelaGaadi() {
        txgaadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarCobertores.this, Gaadi.class);
                startActivity(it);

            }
        });
    }
}





