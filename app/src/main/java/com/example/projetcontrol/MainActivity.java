package com.example.projetcontrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button effacer,afficher,quitter;
    EditText Saisirnbr;
    TextView textafficher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Table De Multiplication ");
        effacer = findViewById(R.id.effacer);
        afficher = findViewById(R.id.afficher);
        quitter = findViewById(R.id.quitter);
        Saisirnbr = findViewById(R.id.Saisirnbr);

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
    }
}