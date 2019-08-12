package br.sp.senac.personagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Recebe_foto_nome extends AppCompatActivity {

    TextView recebeValor;
    Button btnVoltar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_foto_nome);

        Intent intent = getIntent();

        String message = intent.getStringExtra(Personagens.VALOR_LBL);


        recebeValor = (TextView) findViewById(R.id.lblNome);
        recebeValor.setText(message);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Personagens.class));
                finish();
            }
        });

    }
}
