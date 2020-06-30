package com.example.scoreboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int ga=0,gb=0;
TextView dja,murb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dja=findViewById(R.id.scorea);
        murb=findViewById(R.id.scoreb);


if(savedInstanceState!=null)
{
    String a=savedInstanceState.getString("a");
    String b=savedInstanceState.getString("b");
    dja.setText(""+a);
    murb.setText(""+b);
    ga=Integer.parseInt(a);
    gb=Integer.parseInt(b);

}

    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("a",dja.getText().toString());
        outState.putString("b",murb.getText().toString());
    }

    public void threea(View view) {

        ga=ga+3;
        dja.setText(""+ga);
    }

    public void reset(View view) {

ga=0;
gb=0;
        dja.setText(""+ga);
        murb.setText(""+gb);
    }

    public void oneb(View view) {

      gb++;
      murb.setText(""+gb);

    }

    public void twob(View view) {

        gb=gb+2;
        murb.setText(""+gb);
    }

    public void threeb(View view) {

        gb=gb+3;
        murb.setText(""+gb);
    }

    public void onea(View view) {

        ga=ga+1;
        dja.setText(""+ga);
    }

    public void twoa(View view) {

        ga=ga+2;
        dja.setText(""+ga);
    }

}