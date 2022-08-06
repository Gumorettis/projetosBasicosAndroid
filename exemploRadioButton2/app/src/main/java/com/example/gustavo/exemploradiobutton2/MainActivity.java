package com.example.gustavo.exemploradiobutton2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    RadioGroup rbGroup;
    RadioButton rbComputador;
    RadioButton rbTV;
    RadioButton rbGeladeira;
    RadioButton rbAr;
    EditText edtValorReal;
    EditText edtValorDesconto;
    Button btnGerarPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbGroup = (RadioGroup)findViewById(R.id.rbGroup);
        rbComputador = (RadioButton)findViewById(R.id.rbComputador);
        rbTV = (RadioButton)findViewById(R.id.rbTV);
        rbGeladeira = (RadioButton)findViewById(R.id.rbGeladeira);
        rbAr = (RadioButton)findViewById(R.id.rbAr);
        edtValorReal = (EditText)findViewById(R.id.edtValorReal);
        edtValorDesconto = (EditText)findViewById(R.id.edtValorDesc);
        btnGerarPrice = (Button)findViewById(R.id.btnGerar);

        btnGerarPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rbAr.isChecked()){
                    ar();
                }

                if(rbTV.isChecked()){
                    TV();
                }

                if(rbComputador.isChecked()){
                    computador();
                }

                if(rbGeladeira.isChecked()){
                    geladeira();
                }


            }
        });
    }

    public void geladeira(){
        Double aux, valorFinal,vlr;
        vlr = 3.500;
        DecimalFormat df = new DecimalFormat("0.000");

        aux = vlr*0.05;
        valorFinal = vlr-aux;

        edtValorReal.setText("R$ 3.500");
        edtValorDesconto.setText("R$ " +df.format(valorFinal));
    }

    public void TV(){
        Double aux, valorFinal,vlr;
        vlr = 4.000;
        DecimalFormat df = new DecimalFormat("0.000");

        aux = vlr*0.2;
        valorFinal = vlr-aux;

        edtValorReal.setText("R$ 4.000");
        edtValorDesconto.setText("R$ " +df.format(valorFinal));
    }

    public void computador(){
        Double aux, valorFinal,vlr;
        vlr = 2.500;
        DecimalFormat df = new DecimalFormat("0.000");

        aux = vlr*0.1;
        valorFinal = vlr-aux;

        edtValorReal.setText("R$ 2.500");
        edtValorDesconto.setText("R$ " +df.format(valorFinal));
    }

    public void ar(){
        Double aux, valorFinal,vlr;
        vlr = 2.000;
        DecimalFormat df = new DecimalFormat("0.000");

        aux = vlr*0.08;
        valorFinal = vlr-aux;

        edtValorReal.setText("R$ 2.000");
        edtValorDesconto.setText("R$ " +df.format(valorFinal));
    }

}


/**

    Regras de calculo:
    - Smart TV - 20% de desconto (Valor Base 4.000)
    - Computador i7 - 10% de desconto (Valor Base 2.500)
    - Ar condicionado - 8% de desconto (Valor base 2.000)
    - Geladeira - 5% de desconto (Valor base 3.500)
 */