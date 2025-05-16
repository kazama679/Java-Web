package com.data.ss9.service;

import com.data.ss9.model.Movie;
import com.data.ss9.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> find_all() {
        return movieRepository.find_all();
    }

    @Override
    public Movie find_by_id(int id) {
        return movieRepository.find_by_id(id);
    }
}
