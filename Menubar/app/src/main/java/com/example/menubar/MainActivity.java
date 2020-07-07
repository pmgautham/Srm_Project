package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final int GALLERY_REQUEST_CODE=43;
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.imgview);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.share:
                Intent i=new Intent(Intent.ACTION_SEND);
                String c="Hi this is APPSSDC";
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,c);
                startActivity(Intent.createChooser(i,"Share via"));
                break;

            case R.id.dial:
                Uri u=Uri.parse("tel:987654321");
                Intent d=new Intent(Intent.ACTION_DIAL,u);
              startActivity(d);
              break;

            case R.id.gallery:
                Intent g=new Intent(Intent.ACTION_GET_CONTENT);
                g.setType("image/*");
                startActivityForResult(g,GALLERY_REQUEST_CODE);
                break;

        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==GALLERY_REQUEST_CODE)
        {
            if(requestCode==RESULT_OK)
            {
                Uri u=data.getData();
                iv.setImageURI(u);
            }
        }
    }
}
