package com.example.appcitasmedicasv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Database obj_db = new Database();
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
                obj_db.connectSQL();
                boolean confirm = obj_db.insertRecord(obj_model.getId(), obj_model.getName(), obj_model.getDoc(), obj_model.getRoom(), obj_model.getDate(), obj_model.getHour());
                if (confirm) {
                    Toast.makeText(Register.this, "Datos registrados correctamente", Toast.LENGTH_LONG).show();
                }
                else {

                    Toast.makeText(Register.this, "Ha ocurrido un error Verifica los datos",Toast.LENGTH_LONG).show();
                }

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
