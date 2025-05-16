package com.data.ss9.service;

import com.data.ss9.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> find_all();
    Movie find_by_id(int id);
}
