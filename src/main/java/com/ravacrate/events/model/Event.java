package com.ravacrate.events.model;

public class Event {

    private String id, name, date, place;

    public Event(String id, String name, String date, String place) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.place = place;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }
}
