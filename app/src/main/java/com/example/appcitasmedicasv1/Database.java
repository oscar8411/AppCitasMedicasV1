package com.example.appcitasmedicasv1;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;
import java.sql.SQLException;

public class Database {

    Connection connect;
    String url = "jdbc:mysql://35.193.81.231:3306/db_citas";
    String user = "root";
    String password = "12345}";
    String instructionSQL;



    public boolean connectSQL(){
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url,user,password);
            Log.d("MyTag", "Succesfull connection");
            return true;

        } catch (SQLException err) {
            System.out.println(err.getMessage());
            //Log.d("myTag", err.toString());
            return false;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean insertRecord (int id, String name, String doc, String room, String date, String hour) {
        instructionSQL = "INSERT INTO citas VALUES (" + id + ", '" + name + "', '" + doc + "', '" +  room +  "', '" +  date +  "', '" +  hour +  "')";
        //instructionSQL = "INSERT INTO citas VALUES (" + id + ", '" + name + "', '" + doc + "', '" +  room +  "', '2023-05-03', '" +  hour +  "')";

        try {
            connect.prepareStatement(instructionSQL).execute();
            Log.d("myTag", "Data Registered");
            return true;
        } catch (Exception err) {
            Log.d("myTag", err.toString());
            return false;
        }
    }

    public ArrayList<String> consultTable () {
        instructionSQL = "SELECT * FROM users";
        ArrayList <String> datos = new ArrayList <String>();
        try {
            ResultSet results = connect.prepareStatement(instructionSQL).executeQuery();
            while (results.next()) {
                datos.add(results.getString("fullname") + " " + results.getString("identification") + " "
                        + results.getString("email") + " " + results.getString("fecha"));
            }
        } catch (Exception err) {
            Log.d("myTag", err.toString());
        }
        return datos;
    }
}




