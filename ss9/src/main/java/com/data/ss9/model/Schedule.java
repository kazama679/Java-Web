package com.data.ss9.model;

public class Schedule {
    private int id;
    private int movieId;
    private String showTime;
    private int screenRoomId;
    private int availableSeats;
    private String format;

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getScreenRoomId() {
        return screenRoomId;
    }

    public void setScreenRoomId(int screenRoomId) {
        this.screenRoomId = screenRoomId;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public Schedule(int availableSeats, String format, int id, int movieId, int screenRoomId, String showTime) {
        this.availableSeats = availableSeats;
        this.format = format;
        this.id = id;
        this.movieId = movieId;
        this.screenRoomId = screenRoomId;
        this.showTime = showTime;
    }

    public Schedule() {
    }
}
