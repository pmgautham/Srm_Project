package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

int c=0;
Button res,tos;
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=findViewById(R.id.Reset);
        tos=findViewById(R.id.Toast);
        tv=findViewById(R.id.count);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=0;
                tv.setText(""+c);
            }
        });






tos.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String msg=tv.getText().toString();


     Toast.makeText(MainActivity.this,"The value is "+msg,Toast.LENGTH_SHORT).show();




    }
});


        if(savedInstanceState!=null)
        {
            String s = savedInstanceState.getString("var");
            c=Integer.parseInt(s);
            tv.setText(s);
        }



    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("var",tv.getText().toString());
    }




    public void Plus(View view) {

c++;
tv.setText(""+c);


    }



    public void Minus(View view) {
        c--;
        tv.setText(""+c);
    }
}