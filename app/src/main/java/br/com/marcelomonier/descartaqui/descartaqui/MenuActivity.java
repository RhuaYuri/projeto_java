package br.com.marcelomonier.descartaqui.descartaqui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {


    ImageView img_apresentacao, img_acondicionamento, img_locais, img_reees, img_riscos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        img_apresentacao = (ImageView) findViewById(R.id.imageView8);
        img_acondicionamento = (ImageView) findViewById(R.id.imageView5);
        img_locais = (ImageView) findViewById(R.id.imageView4);
        img_reees = (ImageView) findViewById(R.id.imageView7);
        img_riscos = (ImageView) findViewById(R.id.imageView6);


        //Botão para a tela de apresentação
        img_apresentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, ApresentacaoActivity.class);
                startActivity(i);
            }
        });


        //Botão para a tela de acondicionamento
        img_acondicionamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, AcondicionamentoActivity.class);
                startActivity(i);
            }
        });


        //Botão para a tela de locais
        img_locais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, LocaisActivity.class);
                startActivity(i);
            }
        });

        //Botão para a tela de rees
        img_reees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, ReeesActivity.class);
                startActivity(i);
            }
        });

        //Botão para a tela de riscos
        img_riscos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuActivity.this, RiscosActivity.class);
                startActivity(i);
            }
        });

    }
}
