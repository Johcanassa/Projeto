package com.example.conexaodobem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DoarCalcados extends AppCompatActivity {
    TextView txgaadi, txLardosidoso,txAlojamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doar_calcados);
        carregaWidgets();
        carregatelaGaadi();
        carregatelaLardosIdosos();
        carregaAlojamento();
    }

    private void carregaAlojamento() {
        txAlojamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarCalcados.this,AlojamentoComunitario.class);
            }
        });
    }

    private void carregatelaLardosIdosos() {
        txLardosidoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(DoarCalcados.this,LardosIdosos.class);
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
                Intent it = new Intent(DoarCalcados.this, Gaadi.class);
                startActivity(it);

            }
        });
    }
}







