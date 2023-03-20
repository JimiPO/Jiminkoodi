package com.example.olioapplication_vko8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button addButton, subtractButton, multiplyButton, divideButton;
    private EditText luku1EditText, luku2EditText;
    private TextView tulosView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.plusnappi);
        subtractButton = findViewById(R.id.miinusnappi);
        multiplyButton = findViewById(R.id.kertonappi);
        divideButton = findViewById(R.id.jakonappi);
        luku1EditText = findViewById(R.id.luku1);
        luku2EditText = findViewById(R.id.luku2);
        tulosView = findViewById(R.id.tulosview);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(luku1EditText.getText().toString());
                int numero2 = Integer.parseInt(luku2EditText.getText().toString());
                int summa = MainActivity.this.summa(numero1, numero2);
                tulosView.setText(Integer.toString(summa));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(luku1EditText.getText().toString());
                int numero2 = Integer.parseInt(luku2EditText.getText().toString());
                int tulos = MainActivity.this.erotus(numero1, numero2);
                tulosView.setText(Integer.toString(tulos));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(luku1EditText.getText().toString());
                int numero2 = Integer.parseInt(luku2EditText.getText().toString());
                int tulos = MainActivity.this.kertolasku(numero1, numero2);
                tulosView.setText(Integer.toString(tulos));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(luku1EditText.getText().toString());
                int numero2 = Integer.parseInt(luku2EditText.getText().toString());
                int tulos = MainActivity.this.jakolasku(numero1, numero2);
                tulosView.setText(Integer.toString(tulos));
            }
        });
    }

    public Integer jakolasku(Integer numero1, Integer numero2){
        return numero1/numero2;
    }

    public Integer kertolasku(Integer numero1, Integer numero2){
        return numero1*numero2;
    }

    public Integer summa(Integer numero1, Integer numero2){
        return numero1+numero2;
    }

    public Integer erotus(Integer numero1, Integer numero2){
        return numero1-numero2;
    }
}