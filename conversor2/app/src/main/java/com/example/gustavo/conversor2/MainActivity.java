package com.example.gustavo.conversor2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText edtValor;
    RadioButton rbDollar;
    RadioButton rbEuro;
    RadioButton rbPesos;
    RadioGroup rbGroup;
    Button btnConverter;
    EditText edtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = (EditText)findViewById(R.id.edtValor);
        rbDollar = (RadioButton)findViewById(R.id.rbDollar);
        rbEuro = (RadioButton)findViewById(R.id.rbEuro);
        rbPesos = (RadioButton)findViewById(R.id.rbPesos);
        rbGroup = (RadioGroup)findViewById(R.id.grupoRadio);
        btnConverter = (Button)findViewById(R.id.btnSaida);
        edtResultado = (EditText)findViewById(R.id.edtResult);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rbDollar.isChecked()){

                }

                if(rbPesos.isChecked()){

                }

                if(rbEuro.isChecked()){

                }

            }
        });

    }


}
