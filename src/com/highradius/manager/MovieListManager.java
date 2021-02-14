package com.highradius.manager;

import java.util.ArrayList;
import java.util.List;

import com.highradius.model.Movie;

public interface MovieListManager {

	public ArrayList<Movie> findMovies(List<Movie> list, Movie movie) throws Exception;

	public ArrayList<Movie> findMovies(Movie movie) throws Exception;
}
