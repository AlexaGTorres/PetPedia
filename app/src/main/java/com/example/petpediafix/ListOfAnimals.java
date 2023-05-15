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

        listView = (ListView) findViewById(R.id.animalsList);

        ArrayList<String> animalList = new ArrayList<>();

        animalList.add("Dog 1");
        animalList.add("Dog 2");
        animalList.add("animal");
        animalList.add("animal");
        animalList.add("animal");
        animalList.add("animal");
        animalList.add("animal");
        animalList.add("animal");

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