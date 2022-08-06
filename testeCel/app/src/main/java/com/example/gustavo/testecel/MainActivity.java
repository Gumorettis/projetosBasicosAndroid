package com.example.gustavo.testecel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String texto = "Gustavo Moretti";


    EditText edtNome;
    TextView nome;
    Button btnGerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText)findViewById(R.id.edtNome);
        nome = (TextView)findViewById(R.id.textNome);
        btnGerar = (Button)findViewById(R.id.btn);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoNome;
                String result;

                textoNome = edtNome.getText().toString();
                nome.setText(textoNome);

            }
        });
    }

}
