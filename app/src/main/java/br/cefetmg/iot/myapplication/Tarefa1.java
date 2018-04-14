package br.cefetmg.iot.myapplication;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

public class Tarefa1 extends AsyncTask<Integer,Integer,Integer>{

    TextView text;


    public Tarefa1(TextView textView){
     this.text=textView;
    }

    @Override
    protected void onPreExecute(){
        //Codigo
        Log.i("Tarefa 1 - status", "onPreExecute");
        text.setText(String.valueOf(1));
    }
    @Override
    protected Integer doInBackground(Integer... params) {
        //Codigo
        for(Integer i=0; i<10;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            publishProgress(i);
        }
        return 10;
    }
    @Override
    protected void onPostExecute(Integer numero){
        //Codigo
        Log.i("Tarefa 1 - status", "onPostExecute");
        text.setText(String.valueOf(numero));
    }
    protected void onProgressUpdate(Integer... params){
        //Codigo
        Log.i("Tarefa 1 - status", "onProgressUpdate");
        text.setText(String.valueOf(params[0]));
    }

}