package com.example.belanga;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viral);
        Button b1 = (Button) findViewById(R.id.btn_dalgona);
        Button b2 = (Button) findViewById(R.id.btn_caramel);
        Button b3 = (Button) findViewById(R.id.btn_murtabak);
        Button b4 = (Button) findViewById(R.id.btn_biscuit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendalgona();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaramel();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmurtabak();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbiscuit();
            }
        });
    }

    public void opendalgona() {
        Intent intent = new Intent(this, kopidalgona.class);
        startActivity(intent);
    }
    public void opencaramel() {
        Intent intent = new Intent(this, caramel.class);
        startActivity(intent);
    }
    public void openmurtabak() {
        Intent intent = new Intent(this, murtabak.class);
        startActivity(intent);
    }
    public void openbiscuit() {
        Intent intent = new Intent(this, honeybiscuit.class);
        startActivity(intent);
    }
}