package com.example.appcitasmedicasv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Model obj_model = new Model();

        EditText id = (EditText) findViewById(R.id.txtId);
        EditText name = (EditText) findViewById(R.id.txtName);
        EditText doc = (EditText) findViewById(R.id.txtDoc);
        EditText room = (EditText) findViewById(R.id.txtRoom);
        EditText date = (EditText) findViewById(R.id.txtDate);
        EditText hour = (EditText) findViewById(R.id.txtHour);
        Button btnRegister = (Button) findViewById(R.id.btnregister);
        Button btnBack = (Button) findViewById(R.id.btnBack);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj_model.setId(Integer.parseInt(id.getText().toString()));
                obj_model.setName(name.getText().toString());
                obj_model.setDoc(doc.getText().toString());
                obj_model.setRoom(room.getText().toString());
                obj_model.setDate(date.getText().toString());
                obj_model.setHour(hour.getText().toString());
                Toast.makeText(Register.this, "Datos registrados", Toast.LENGTH_LONG).show();
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intentBack = new Intent(Register.this, MainActivity.class);
                startActivity(intentBack);
            }
        });


    }





}
