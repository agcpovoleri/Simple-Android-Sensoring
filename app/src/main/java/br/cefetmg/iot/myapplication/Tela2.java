package br.cefetmg.iot.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Pós Iot Sistemas de Computação.
 */


public class Tela2 extends AppCompatActivity {

    TextView TextView_valor1;
    TextView TextView_valor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView_valor1 = (TextView)findViewById(R.id.textView_valor1);
        TextView_valor2 = (TextView)findViewById(R.id.textView_valor2);

        String valor1 = getIntent().getStringExtra("valor1");
        String valor2 = getIntent().getStringExtra("valor2");

        Log.i("valor1:",valor1);
        Log.i("valor2:",valor1);

        TextView_valor1.setText(valor1);
        TextView_valor2.setText(valor2);



    }
}
