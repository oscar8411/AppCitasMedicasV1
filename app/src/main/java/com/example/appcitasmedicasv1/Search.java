package com.example.appcitasmedicasv1;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate((savedInstanceState));
        setContentView(R.layout.search);

        Database obj_db = new Database ();
        ListView listRecord = (ListView) findViewById(R.id.listRecord);
        Button btnsearch = (Button) findViewById(R.id.btnSearch);
        Button btnBack = (Button) findViewById(R.id.btnBack2);


        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj_db.connectSQL();
                ArrayList<String> data = obj_db.consultTable();
                ArrayAdapter adapter = new ArrayAdapter<String>(Search.this,
                        com.google.android.material.R.layout.support_simple_spinner_dropdown_item,
                        data);
                listRecord.setAdapter(adapter);

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



