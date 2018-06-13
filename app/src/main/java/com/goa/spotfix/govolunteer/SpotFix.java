package com.goa.spotfix.govolunteer;

public class SpotFix {
    private String picture, date, time, location;
    private int numberOfParticipants;

    public SpotFix(String picture, String date, String time, String location, int numberOfParticipants) {
        this.picture = picture;
        this.date = date;
        this.time = time;
        this.location = location;
        this.numberOfParticipants = numberOfParticipants;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }
}
