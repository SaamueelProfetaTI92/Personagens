package br.sp.senac.personagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtSenha;
    Button btnEntrar, btnSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtSenha = (EditText) findViewById(R.id.txtSenha);

        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnSair = (Button) findViewById(R.id.btnSair);

        txtUsuario.requestFocus();

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, senha;
                usuario = txtUsuario.getText().toString();
                senha = txtSenha.getText().toString();

                if (usuario.equals("Samuel") && senha.equals("samuel"))
                {
                    Intent  intent = new Intent(getApplicationContext(), PersonagensActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "Usuário e Senha Invalidos", Toast.LENGTH_SHORT).show();
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    txtUsuario.requestFocus();

                }
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
