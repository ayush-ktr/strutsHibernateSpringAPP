package com.highradius.manager.impl;

import java.util.ArrayList;
import java.util.List;

import com.highradius.dao.MovieDao;
import com.highradius.manager.MovieListManager;
import com.highradius.model.Movie;

public class MovieListManagerImpl implements MovieListManager {

	private MovieDao movieDao;

	public MovieListManagerImpl(MovieDao movieDao) {
		this.movieDao = movieDao;
	}
	
	public MovieListManagerImpl() {}

	public ArrayList<Movie> findMovies(List<Movie> list, Movie movie) throws Exception {
		ArrayList<Movie> filteredList = new ArrayList<Movie>();
		list.forEach((elementMovie) -> {
			if ((elementMovie.getTitle() != null && !movie.getTitle().isEmpty()
					&& elementMovie.getTitle().contains(movie.getTitle()))
					|| (elementMovie.getReleaseYear() != 0 && elementMovie.getReleaseYear() == movie.getReleaseYear())
					|| (elementMovie.getLanguage() != null && elementMovie.getLanguage().equals(movie.getLanguage()))
					|| (elementMovie.getCategory() != null && elementMovie.getCategory().equals(movie.getCategory()))) {
				filteredList.add(elementMovie);
			}
		});
		return filteredList;
	}

	public ArrayList<Movie> findMovies(Movie movie) throws Exception {
		return movieDao.readFromDBUsingHibernate(movie);
	}

	public MovieDao getMovieDao() {
		return movieDao;
	}

	public void setMovieDao(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

}
