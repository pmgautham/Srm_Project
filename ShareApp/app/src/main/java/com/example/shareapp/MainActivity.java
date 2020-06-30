package com.example.shareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.msg);
    }

    public void Share(View view) {

        Intent i = new Intent(Intent.ACTION_SEND);
        String cont = tv.getText().toString();
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,cont);
        startActivity(Intent.createChooser(i,"Share via"));


    }
}