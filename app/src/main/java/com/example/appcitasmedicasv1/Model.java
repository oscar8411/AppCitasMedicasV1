package com.example.appcitasmedicasv1;

public class Model {

    private int id;

    private String name;

    private String doc;

    private String room;

    private String date;

    private String hour;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDoc() {
        return doc;
    }

    public String getRoom() {
        return room;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }
}
