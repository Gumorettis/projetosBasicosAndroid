package com.example.gustavo.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtResultado;
    EditText edtValor;
    Button btnConverter;
    RadioGroup rdGroup;
    RadioButton rdDollar;
    RadioButton rdEuro;
    RadioButton rdPesos;
    RadioButton rdIene;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGroup = (RadioGroup)findViewById(R.id.rdGroup);
        edtValor = (EditText)findViewById(R.id.edtValor);
        edtResultado = (EditText)findViewById(R.id.edtResultado);
        btnConverter = (Button)findViewById(R.id.btnConverter);
        rdDollar = (RadioButton)findViewById(R.id.rbDollar);
        rdEuro = (RadioButton)findViewById(R.id.rbEuro);
        rdPesos = (RadioButton)findViewById(R.id.rbPesos);
        rdIene = (RadioButton)findViewById(R.id.rdIene);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rdDollar.isChecked()){
                    dollar();
                }

                else if(rdEuro.isChecked()){
                    euro();
                }

                else if(rdPesos.isChecked()){
                    pesos();
                }

                else if(rdIene.isChecked()){
                    iene();
                }
            }
        });
    }

    public void dollar(){

        Double aux,calc;

        DecimalFormat df = new DecimalFormat("0.00");

        aux = Double.parseDouble(edtValor.getText().toString());
        calc = aux/4.13;
        edtResultado.setText(df.format(calc)+ " US$");
    }

    public void euro(){
        Double aux, calc;

        DecimalFormat df = new DecimalFormat("0.00");

        aux = Double.parseDouble(edtValor.getText().toString());
        calc = aux/4.86;
        edtResultado.setText(df.format(calc)+ " Euros(€)");
    }

    public void pesos(){
        Double aux, calc;

        DecimalFormat df = new DecimalFormat("0.00");

        aux = Double.parseDouble(edtValor.getText().toString());
        calc = aux/0.11;
        edtResultado.setText(df.format(calc)+ " Pesos");
    }

    public void iene(){

        Double aux, calc;

        DecimalFormat df = new DecimalFormat("0.00");

        aux = Double.parseDouble(edtValor.getText().toString());
        calc = aux/0.033;
        edtResultado.setText(df.format(calc)+ " Iene");
    }

}
