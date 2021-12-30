package com.example.belanga;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class testMain extends AppCompatActivity {

    ImageButton Button;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.about) {
            Intent intent = new Intent(this, about.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_main);
        ImageButton b1 = (ImageButton) findViewById(R.id.image_chicken);
        ImageButton b2 = (ImageButton) findViewById(R.id.image_meat);
        ImageButton b3 = (ImageButton) findViewById(R.id.image_fish);
        ImageButton b4 = (ImageButton) findViewById(R.id.image_viral);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openchicken();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmeat();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openseafood();
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
    public void openmeat() {
        Intent intent = new Intent(this, western.class);
        startActivity(intent);
    }
    public void openseafood() {
        Intent intent = new Intent(this, seafood.class);
        startActivity(intent);
    }
    public void openviral() {
        Intent intent = new Intent(this, viral.class);
        startActivity(intent);
    }
}