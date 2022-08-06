package com.example.gustavo.gerarnome3;

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
        btnGerar = (Button)findViewById(R.id.btn);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoNome;

                textoNome = edtNome.getText().toString();
                txtNome.setText(textoNome);

            }
        });

        }

        }


