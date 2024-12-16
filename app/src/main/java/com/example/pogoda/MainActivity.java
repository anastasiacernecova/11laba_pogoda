package com.example.pogoda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void bsk(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
        finish();
    }

    public void msk(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
        finish();
    }

    public void vrn(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity4.class);
        startActivity(intent);
        finish();
    }

    public void sar(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity5.class);
        startActivity(intent);
        finish();
    }

    public void vlg(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity6.class);
        startActivity(intent);
        finish();
    }

    public void tam(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity7.class);
        startActivity(intent);
        finish();
    }
}