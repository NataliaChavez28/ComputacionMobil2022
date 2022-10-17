package com.example.healthperfproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn1 = findViewById(R.id.imageButton1);
        btn1.setOnClickListener((v) -> {
            Toast notification = Toast.makeText(MainActivity.this, "Mi Cent", Toast.LENGTH_SHORT);
            notification.show();

            MenuSlideAct.opcion=1;
            Intent health = new Intent(getApplicationContext(), MenuSlideAct.class);
            startActivity(health);
        });

        ImageButton btn2 = findViewById(R.id.imageButton2);
        btn2.setOnClickListener((v) -> {
            Toast notification = Toast.makeText(MainActivity.this, "PausesAct", Toast.LENGTH_SHORT);
            notification.show();

            MenuSlideAct.opcion=2;
            Intent health = new Intent(getApplicationContext(), MenuSlideAct.class);
            startActivity(health);
            notification.show();

        });

        ImageButton btn3 = findViewById(R.id.imageButton3);
        btn3.setOnClickListener((v) -> {
            Toast notification = Toast.makeText(MainActivity.this, "Sue", Toast.LENGTH_SHORT);
            notification.show();

            MenuSlideAct.opcion=3;
            Intent health = new Intent(getApplicationContext(), MenuSlideAct.class);
            startActivity(health);
        });

        ImageButton btn4 = findViewById(R.id.imageButton4);
        btn4.setOnClickListener((v) -> {
            Toast notification = Toast.makeText(MainActivity.this, "Red", Toast.LENGTH_SHORT);
            notification.show();

            MenuSlideAct.opcion=4;
            Intent health = new Intent(getApplicationContext(), MenuSlideAct.class);
            startActivity(health);
        });
    }

}

