package com.example.gustavo.testemyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    TextView txtNome;
    Button btnGerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText)findViewById(R.id.edtNome);
        txtNome = (TextView)findViewById(R.id.txtNome);
        btnGerar = (Button)findViewById(R.id.btnGerar);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String aux;

                aux = edtNome.getText().toString();
                txtNome.setText(aux);

            }
        });
    }
}
