package br.cefetmg.iot.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Pós Iot Sistemas de Computação.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_tela1 = (Button)findViewById(R.id.btn_tela1);

        btn_tela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent Tela1 = new Intent(getApplicationContext(), Tela1.class);
                startActivity(Tela1);

            } });

        Button btn_encerrar = (Button)findViewById(R.id.btn_encerrar);

        btn_encerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

              finish();

            } });

        Button btn_recentes = (Button) findViewById(R.id.btn_recente_temp);
        btn_recentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temperatura_recente = new Intent(getApplicationContext(), TemperaturaRecenteActivity.class);

                startActivity(temperatura_recente);

            }
        });

        Button button_list = (Button) findViewById(R.id.btn_list_temp);

        button_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temperatura_list = new Intent(getApplicationContext(), TemperaturasActivity.class);

                startActivity(temperatura_list);

            }
        });

        Button button_atualizar = (Button) findViewById(R.id.btn_enviar_temp);

        button_atualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temperatura_atualizar = new Intent(getApplicationContext(), TemperaturaAtualizarActivity.class);

                startActivity(temperatura_atualizar);

            }
        });



    }
}
