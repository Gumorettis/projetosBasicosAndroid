package com.example.gustavo.testeparametro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnGerar;
    TextView txtNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        edtNome = (EditText)findViewById(R.id.edtNome);
        btnGerar = (Button)findViewById(R.id.btnGerar);
        txtNome = (TextView)findViewById(R.id.txtNome);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome;
                nome = edtNome.getText().toString();
                txtNome.setText(nome);

            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
