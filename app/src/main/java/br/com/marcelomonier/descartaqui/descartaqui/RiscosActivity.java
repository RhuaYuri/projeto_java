package br.com.marcelomonier.descartaqui.descartaqui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class RiscosActivity extends AppCompatActivity {

    CardView cardChumbo, cardMercurio, cardCadmio, cardNiquel, cardPrata, cardLitio, cardManganes, cardZinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riscos);


    cardChumbo = (CardView) findViewById(R.id.card_chumbo);
    cardMercurio = (CardView) findViewById(R.id.card_mercurio);

    }
}
