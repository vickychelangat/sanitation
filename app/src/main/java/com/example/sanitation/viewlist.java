package com.example.sanitation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class viewlist extends AppCompatActivity {
    ListView listView;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewlist);

        mybutton = findViewById(R.id.button6);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(viewlist.this, menulist.class);
                startActivity(myintent);
            }
        });

        listView = (ListView) findViewById(R.id.lists);
        array = new ArrayList<>();

        array.add("trashcans");
        array.add("trash tracks");
        array.add("health issues");
        array.add("practices");
        array.add("cleanliness");
        array.add("homestades");
        array.add("report");
        array.add("mosquito net");
        array.add("schools");
        array.add("pit latrines");
        array.add("safewater");


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getApplicationContext(), " " + array.get(position), Toast.LENGTH_SHORT).show();

            }
        });
    }
}

