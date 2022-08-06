package com.example.gustavo.jogomemoria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edtLogin;
    EditText edtSenha;
    Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtLogin = (EditText)findViewById(R.id.edtLogin);
        edtSenha = (EditText)findViewById(R.id.edtSenha);
        btnLogar = (Button)findViewById(R.id.btnLogar);

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String login, senha;
                login = edtLogin.getText().toString();
                senha = edtSenha.getText().toString();

                if(login.equals("adm") && senha.equals("1234")){

                    alerta("Login Realizado com sucesso! ");
                }
                else{
                    alerta("Falha no login - Usuário ou login incorretos! ");
                }

            }
        });

    }

    public void alerta(String mensagem){

        Toast.makeText(this,mensagem,Toast.LENGTH_LONG).show();
    }

}
