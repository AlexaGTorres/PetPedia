package com.example.petpediafix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class SmallDog extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_dog);

        getSupportActionBar().hide();

        Button btn = (Button)findViewById(R.id.selectOtherButton);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SmallDog.this, ListOfAnimals.class);
                startActivity(intent);
            }
        });
    }
}