package br.sp.senac.personagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Personagens extends AppCompatActivity {

    TextView txtOliver;
    TextView txtThea;
    TextView txtRoy;
    TextView txtRay;
    TextView txtNyssa;
    TextView txtDiggle;
    TextView txtFelicity;
    TextView txtMalcom;



    public static final String VALOR_LBL = "br.sp.senac.personagens.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);

        txtOliver = (TextView) findViewById(R.id.txtOliver);
        txtThea = (TextView) findViewById(R.id.txtThea);
        txtRoy = (TextView) findViewById(R.id.txtRoy);
        txtRay = (TextView) findViewById(R.id.txtRay);
        txtNyssa = (TextView) findViewById(R.id.txtNyssa);
        txtDiggle = (TextView) findViewById(R.id.txtDiggle);
        txtFelicity = (TextView) findViewById(R.id.txtFelicity);
        txtMalcom = (TextView) findViewById(R.id.txtMalcom);

    }

    public void abrirJanela(View view) {

        Intent intent = new Intent(getApplicationContext(), Recebe_foto_nome.class);

        String message = txtOliver.getText().toString();
        intent.putExtra(VALOR_LBL, message);


        startActivity(intent);
        finish();


    }

    public void abrirThea(View view) {

        Intent intent = new Intent(getApplicationContext(), Recebe_foto_nome.class);

        String message = txtThea.getText().toString();
        intent.putExtra(VALOR_LBL, message);


        startActivity(intent);
        finish();
    }

    public void abrirRoy(View view) {

        Intent intent = new Intent(getApplicationContext(), Recebe_foto_nome.class);

        String message = txtRoy.getText().toString();
        intent.putExtra(VALOR_LBL, message);


        startActivity(intent);
        finish();
    }

    public void abrirRay(View view) {

        Intent intent = new Intent(getApplicationContext(), Recebe_foto_nome.class);

        String message = txtRay.getText().toString();
        intent.putExtra(VALOR_LBL, message);


        startActivity(intent);
        finish();
    }

    public void abrirNyssa(View view) {

        Intent intent = new Intent(getApplicationContext(), Recebe_foto_nome.class);

        String message = txtNyssa.getText().toString();
        intent.putExtra(VALOR_LBL, message);


        startActivity(intent);
        finish();
    }

    public void abrirDiggle(View view) {
        Intent intent = new Intent(getApplicationContext(), Recebe_foto_nome.class);

        String message = txtDiggle.getText().toString();
        intent.putExtra(VALOR_LBL, message);


        startActivity(intent);
        finish();

    }

    public void abrirFelicity(View view) {
        Intent intent = new Intent(getApplicationContext(), Recebe_foto_nome.class);

        String message = txtFelicity.getText().toString();
        intent.putExtra(VALOR_LBL, message);


        startActivity(intent);
        finish();

    }

    public void abrirMalcom(View view) {

        Intent intent = new Intent(getApplicationContext(), Recebe_foto_nome.class);

        String message = txtMalcom.getText().toString();
        intent.putExtra(VALOR_LBL, message);


        startActivity(intent);
        finish();
    }
}
