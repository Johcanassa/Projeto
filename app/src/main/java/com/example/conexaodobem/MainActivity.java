package com.example.conexaodobem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.acaosocial:
                TelaAçãoSocial();
                return (true);
            case R.id.doeaqui:
                TelaDoeaqui();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void TelaAçãoSocial(){
        Intent intent = new Intent(MainActivity.this,AcaoSocial.class);
        startActivity(intent);

    }
    public void TelaDoeaqui(){
        Intent intent= new Intent(MainActivity.this,DoeAqui.class);
        startActivity(intent);
    }
}



