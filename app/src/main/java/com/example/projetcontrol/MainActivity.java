package com.example.projetcontrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button effacer,afficher,quitter,btn1,btn2,btn3;
    EditText Saisirnbr;
    TextView textafficher;
    ConstraintLayout layoutT;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("table De Multiplication ");
        effacer = findViewById(R.id.effacer);
        afficher = findViewById(R.id.afficher);
        quitter = findViewById(R.id.quitter);
        Saisirnbr = findViewById(R.id.Saisirnbr);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        layoutT  = findViewById(R.id.layoutT);

        effacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Saisirnbr.setText("");
                textafficher.setText("? * 0 = ? \n ? * 1 = ? \n ? * 2 = ? \n ? * 3 = ? \n ? * 4 = ? \n ? * 5 = ? \n ? * 6 = ? \n ? * 7 = ? \n ? * 8 = ? \n ? * 9 = ? \n ? * 10 = ?");
            }
        });

        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutT.setBackgroundColor(Color.WHITE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutT.setBackgroundColor(0x9C27B0);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutT.setBackgroundColor(0x673AB7);
            }
        });
    }
}