package com.example.gustavo.testecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Definir os componentes do aplicativo criados no activity
    EditText edtNum1;
    EditText edtNum2;
    EditText edtResultado;
    ImageButton btnSomar;

    //método inicial onCreate que executa quando o app for iniciado
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ligando os componentes criados no activity com a classe Main (construtor)
        edtNum1 = (EditText)findViewById(R.id.edtNum1);
        edtNum2 = (EditText)findViewById(R.id.edtNum2);
        edtResultado = (EditText)findViewById(R.id.edtResultado);
        btnSomar = (ImageButton)findViewById(R.id.btnSomar);

        //método para tratar o evento click do botão
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double num1, num2, result;

                num1 = Double.parseDouble(edtNum1.getText().toString());
                num2 = Double.parseDouble(edtNum2.getText().toString());

                result = num1+num2;

                edtResultado.setText(result.toString());
            }
        });
    }
}
