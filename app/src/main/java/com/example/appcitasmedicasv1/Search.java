package com.example.appcitasmedicasv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate((savedInstanceState));
        setContentView(R.layout.search);

        Button btnsearch = (Button) findViewById(R.id.btnSearch);
        Button btnBack = (Button) findViewById(R.id.btnBack2);


        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListView listRecords = (ListView) findViewById(R.id.listRecord);
                String[] dataArray = {"80871555 - OSCAR BUITRAGO - ISABELLA HERNANDEZ - 444 - 2023-05-02 - 08:00",
                        };
                ArrayAdapter adapter = new ArrayAdapter<String>(Search.this,
                        com.google.android.material.R.layout.support_simple_spinner_dropdown_item, dataArray);
                listRecords.setAdapter(adapter);

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intentBack = new Intent(Search.this, MainActivity.class);
                startActivity(intentBack);
            }
        });
    }

}



