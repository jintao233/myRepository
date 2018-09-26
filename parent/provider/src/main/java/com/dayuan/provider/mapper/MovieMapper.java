package com.dayuan.provider.mapper;


import com.dayuan.entity.Movie;

import java.util.List;

public interface MovieMapper {
    int deleteByPrimaryKey(Integer id);

    void insert(Movie record);

    Movie selectByPrimaryKey(Integer id);

    List<Movie> listMovies();

}