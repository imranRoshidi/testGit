package com.example.belanga;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class western extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_western);
        Button b1 = (Button) findViewById(R.id.btn_roulade);
        Button b2 = (Button) findViewById(R.id.btn_lasagna);
        Button b3 = (Button) findViewById(R.id.btn_shepherd);
        Button b4 = (Button) findViewById(R.id.btn_aglio);
        Button b5 = (Button) findViewById(R.id.btn_ayampanggang);
        Button b6 = (Button) findViewById(R.id.btn_ayamstu);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openroulade();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlasagna();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openshepherd();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaglio();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openayampanggang();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openayamstu();
            }
        });
    }

    public void openroulade() {
        Intent intent = new Intent(this, chickenrouladecreamy.class);
        startActivity(intent);
    }
    public void openlasagna() {
        Intent intent = new Intent(this, lasagna.class);
        startActivity(intent);
    }
    public void openshepherd() {
        Intent intent = new Intent(this, sheperdpiedaging.class);
        startActivity(intent);
    }
    public void openaglio() {
        Intent intent = new Intent(this, spaghettiaglioolio.class);
        startActivity(intent);
    }
    public void openayampanggang() {
        Intent intent = new Intent(this, ayampanggangketuhar.class);
        startActivity(intent);
    }
    public void openayamstu() {
        Intent intent = new Intent(this, ayamstewtomatosayuran.class);
        startActivity(intent);
    }
}