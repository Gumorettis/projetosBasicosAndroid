package com.example.gustavo.prova1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtValor;
    EditText edtGorjeta;
    EditText edtPessoas;
    EditText edtResultado;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = (EditText)findViewById(R.id.edtValorConta);
        edtGorjeta = (EditText)findViewById(R.id.edtGorjeta);
        edtPessoas = (EditText)findViewById(R.id.edtPessoas);
        edtResultado = (EditText)findViewById(R.id.edtResultado);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double aux1, aux2, aux3, soma, calc;
                aux1 = Double.parseDouble(edtValor.getText().toString());
                aux2 = Double.parseDouble(edtGorjeta.getText().toString());
                aux3 = Double.parseDouble(edtPessoas.getText().toString());
                soma = aux1+aux2;
                calc = soma/aux3;

                edtResultado.setText("R$:  " +calc.toString());

            }
        });
    }
}
