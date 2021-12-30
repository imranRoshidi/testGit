package com.example.belanga;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.btn_chicken);
        Button b2 = (Button) findViewById(R.id.btn_meat);
        Button b3 = (Button) findViewById(R.id.btn_fish);
        Button b4 = (Button) findViewById(R.id.btn_viral);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openchicken();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openviral();
            }
        });
    }

    public void openchicken() {
        Intent intent = new Intent(this, chicken.class);
        startActivity(intent);
    }
    public void openviral() {
        Intent intent = new Intent(this, viral.class);
        startActivity(intent);
    }
}