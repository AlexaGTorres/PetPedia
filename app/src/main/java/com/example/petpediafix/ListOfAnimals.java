package com.example.petpediafix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfAnimals extends AppCompatActivity
{
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);

        getSupportActionBar().hide();

        listView = (ListView) findViewById(R.id.animalsList);

        ArrayList<String> animalList = new ArrayList<>();

        animalList.add("Small Dogs");
        animalList.add("Big Dogs");
        animalList.add("Frogs");
        animalList.add("Lizards");
        animalList.add("Cats");
        animalList.add("Sheep");
        animalList.add("Cows");
        animalList.add("Pigs");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animalList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                if (position == 0)
                {
                    startActivity(new Intent(ListOfAnimals.this, SmallDog.class));
                }
            }
        });
    }
}