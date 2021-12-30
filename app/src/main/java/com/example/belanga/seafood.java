package com.example.belanga;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seafood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seafood);
        Button b1 = (Button) findViewById(R.id.btn_salmon);
        Button b2 = (Button) findViewById(R.id.btn_ketam);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensalmon();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openketam();
            }
        });
    }

    public void opensalmon() {
        Intent intent = new Intent(this, salmongrill.class);
        startActivity(intent);
    }
    public void openketam() {
        Intent intent = new Intent(this, ketamsumbatbakar.class);
        startActivity(intent);
    }
}