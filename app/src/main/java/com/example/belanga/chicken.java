package com.example.belanga;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chicken extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
        Button b1 = (Button) findViewById(R.id.btn_berempah);
        Button b2 = (Button) findViewById(R.id.btn_kicap);
        Button b3 = (Button) findViewById(R.id.btn_kunyit);
        Button b4 = (Button) findViewById(R.id.btn_ladahitam);
        Button b5 = (Button) findViewById(R.id.btn_rendang);
        Button b6 = (Button) findViewById(R.id.btn_masakmerah);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openberempah();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkicap();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkunyit();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openladahitam();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrendang();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmasakmerah();
            }
        });
    }

    public void openberempah() {
        Intent intent = new Intent(this, paprik.class);
        startActivity(intent);
    }
    public void openkicap() {
        Intent intent = new Intent(this, ayamkicap.class);
        startActivity(intent);
    }
    public void openkunyit() {
        Intent intent = new Intent(this, ayamkunyit.class);
        startActivity(intent);
    }
    public void openladahitam() {
        Intent intent = new Intent(this, blackpepper.class);
        startActivity(intent);
    }
    public void openrendang() {
        Intent intent = new Intent(this, rendang.class);
        startActivity(intent);
    }
    public void openmasakmerah() {
        Intent intent = new Intent(this, masakmerah.class);
        startActivity(intent);
    }
}