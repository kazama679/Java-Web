package com.data.ss9.repository;

import com.data.ss9.connection.ConnectionDB;
import com.data.ss9.model.Movie;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryImp implements MovieRepository {
    @Override
    public List<Movie> find_all() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Movie> movies = new ArrayList<>();
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_movie()}");
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                Movie movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitle(rs.getString("title"));
                movie.setDirector(rs.getString("director"));
                movie.setGenre(rs.getString("genre"));
                movie.setDescription(rs.getString("description"));
                movie.setDuration(rs.getString("duration"));
                movie.setLanguage(rs.getString("language"));
                movies.add(movie);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return movies;
    }

    @Override
    public Movie find_by_id(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        Movie movie = null;
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_by_id_movie(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitle(rs.getString("title"));
                movie.setDirector(rs.getString("director"));
                movie.setGenre(rs.getString("genre"));
                movie.setDescription(rs.getString("description"));
                movie.setDuration(rs.getString("duration"));
                movie.setLanguage(rs.getString("language"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return movie;
    }
}
