package br.cefetmg.iot.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.cefetmg.iot.myapplication.tasks.GetTemperaturas;

public class TemperaturasActivity extends AppCompatActivity {

    TextView text_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperaturas);

        text_result = (TextView) findViewById(R.id.text_result);
        GetTemperaturas req = new GetTemperaturas(text_result);
        req.execute();
    }
}
