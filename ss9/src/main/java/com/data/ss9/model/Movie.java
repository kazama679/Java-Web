package com.data.ss9.model;

public class Movie {
    private int id;
    private String title;
    private String director;
    private String genre;
    private String description;
    private String duration;
    private String language;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Movie(String description, String director, String duration, String genre, int id, String language, String title) {
        this.description = description;
        this.director = director;
        this.duration = duration;
        this.genre = genre;
        this.id = id;
        this.language = language;
        this.title = title;
    }

    public Movie() {
    }
}