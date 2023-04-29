package com.example.appcitasmedicasv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_open_register = (Button) findViewById(R.id.btn_open_register);
        Button btn_open_search = (Button) findViewById(R.id.btn_open_search);

        btn_open_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten_register = new Intent(MainActivity.this, Register.class);
                startActivity(inten_register);
            }
        });


        btn_open_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_search = new Intent(MainActivity.this, Search.class);
                startActivity(intent_search);

            }
        });




    }
}
