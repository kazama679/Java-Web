package com.data.ss9.repository;

import com.data.ss9.model.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> find_all();
    Movie find_by_id(int id);
}
