package com.example.petpediafix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

       // Intent home = new Intent(MainActivity.this, MainMenu.class);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                //startActivity(home);
                finish();
            }
        }, 4000);
    }
}