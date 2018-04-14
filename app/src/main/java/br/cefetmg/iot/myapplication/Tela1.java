package br.cefetmg.iot.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela1 extends AppCompatActivity {

    Button btn_enviar;
    EditText editText_valor1;
    EditText editText_valor2;
    TextView TextView_contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        btn_enviar = (Button)findViewById(R.id.btn_enviar);
        editText_valor1 = (EditText)findViewById(R.id.editText_Valor1);
        editText_valor2 = (EditText)findViewById(R.id.editText_Valor2);

        TextView_contador = (TextView)findViewById(R.id.textView_contador);

        Tarefa1 t1 = new Tarefa1(TextView_contador);
        t1.execute();


        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela2 = new Intent(getApplicationContext(), Tela2.class);

                String valor1 = String.valueOf(editText_valor1.getText());
                String valor2 = String.valueOf(editText_valor2.getText());

                tela2.putExtra("valor1", valor1);
                tela2.putExtra("valor2", valor2);


                startActivity(tela2);

            }
        });




    }
}
