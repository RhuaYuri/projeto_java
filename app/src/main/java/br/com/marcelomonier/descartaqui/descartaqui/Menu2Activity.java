package br.com.marcelomonier.descartaqui.descartaqui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.StringDef;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.View;

public class Menu2Activity extends AppCompatActivity {


    CardView cardApresentacao, cardReees, cardAcondicionamento, cardLocais, cardRiscos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        cardApresentacao = (CardView) findViewById(R.id.apresentacao);
        cardReees = (CardView) findViewById(R.id.reees);
        cardAcondicionamento = (CardView) findViewById(R.id.acondicionamento);
        cardLocais = (CardView) findViewById(R.id.coleta);
        cardRiscos = (CardView) findViewById(R.id.riscos);

        //Botão para a tela de apresentação
        cardApresentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Menu2Activity.this);
                builder.setCancelable(false);
                builder.setTitle(R.string.title_apresentacao);
                builder.setMessage(R.string.apresentacao_descricao);


                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                AlertDialog dialog = builder.create();
                // display dialog
                dialog.show();

            }
        });


        //Botão para a tela de acondicionamento
        cardAcondicionamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu2Activity.this, AcondicionamentoActivity.class);
                startActivity(i);
            }
        });


        //Botão para a tela de locais
        cardLocais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu2Activity.this, LocaisActivity.class);
                startActivity(i);
            }
        });

        //Botão para a tela de rees
        cardReees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu2Activity.this, ReeesActivity.class);
                startActivity(i);
            }
        });

        //Botão para a tela de riscos
        cardRiscos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu2Activity.this, RiscosActivity.class);
                startActivity(i);
            }
        });






    }

    public void showDialog(View view){


    }


}
