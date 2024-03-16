package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

 ListView listv;
    ArrayList<String>  Arrayfamily = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listv = findViewById(R.id.LV);



        Arrayfamily.add("Samuel");
        Arrayfamily.add("john");
        Arrayfamily.add("Joseph");
        Arrayfamily.add("Max");
        Arrayfamily.add("jack");
        Arrayfamily.add("maddy");
        Arrayfamily.add("Mathew");
        Arrayfamily.add("Glenn");
        Arrayfamily.add("Jeff");
        Arrayfamily.add("Stefan");
        Arrayfamily.add("Damon");
        Arrayfamily.add("Andrea");
        Arrayfamily.add("mindy");
        Arrayfamily.add("Maggie");
        Arrayfamily.add("Carol");
        Arrayfamily.add("Sofia");
        Arrayfamily.add("Carl");
        Arrayfamily.add("Daryl");
        Arrayfamily.add("Lori");
        Arrayfamily.add("Judith");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,Arrayfamily);

        listv.setAdapter(adapter);


    }
}