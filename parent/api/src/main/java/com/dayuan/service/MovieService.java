package com.dayuan.service;

import com.dayuan.entity.Movie;

import java.util.List;

public interface MovieService {
    Movie selectMoviesByMovidId(Integer id);

     List<Movie> listMovies();

}
