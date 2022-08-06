package com.example.gustavo.testelayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1;
    EditText edtNum2;
    Button btnSoma;
    EditText edtResultado;
    Button btnMenos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = (EditText)findViewById(R.id.edtNum1);
        edtNum2 = (EditText)findViewById(R.id.edtNum2);
        edtResultado = (EditText)findViewById(R.id.edtResultado);
        btnSoma = (Button)findViewById(R.id.btnSoma);
        btnMenos = (Button)findViewById(R.id.btnMenos);


        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double aux1, aux2, result;

                aux1 = Double.parseDouble(edtNum1.getText().toString());
                aux2 = Double.parseDouble(edtNum2.getText().toString());

                result = aux1-aux2;

                edtResultado.setText(result.toString());
            }
        });



        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double aux1, aux2, resultado;

                aux1 = Double.parseDouble(edtNum1.getText().toString());
                aux2 = Double.parseDouble(edtNum2.getText().toString());

                resultado = aux1+aux2;

                edtResultado.setText(resultado.toString());
            }
        });

        /*
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double aux1, aux2, result;

                aux1 = Double.parseDouble(edtNum1.getText().toString());
                aux2 = Double.parseDouble(edtNum2.getText().toString());

                result = aux1+aux2;

                edtResultado.setText(result.toString());

            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double aux1, aux2, result;

                aux1 = Double.parseDouble(edtNum1.getText().toString());
                aux2 = Double.parseDouble(edtNum2.getText().toString());

                result = aux1-aux2;

                edtResultado.setText(result.toString());
            }
        }); */

    }
}
