package com.highradius.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.highradius.helper.FileHandlingHelper;
import com.highradius.manager.impl.MovieListManagerImpl;
import com.highradius.model.Movie;

/**
 * Servlet implementation class MovieSearch
 */
//@WebServlet("/Search")
public class MovieSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MovieSearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MovieListManagerImpl movieListServicesImpl = new MovieListManagerImpl();
		try {

			Movie keyObject = new Movie();
			keyObject.setTitle(request.getParameter("title"));
			if (!request.getParameter("releaseYear").isEmpty()
					&& request.getParameter("releaseYear").chars().allMatch(Character::isDigit))
				keyObject.setReleaseYear(Integer.parseInt(request.getParameter("releaseYear").replaceAll("\"", "")));
			keyObject.setCategory(request.getParameter("category"));
			keyObject.setLanguage(request.getParameter("language"));

			getServletContext().setAttribute("list", movieListServicesImpl.findMovies(FileHandlingHelper.readFromAFile(), keyObject));

			getServletContext().setAttribute("title", String.valueOf(request.getParameter("title")));
			getServletContext().setAttribute("releaseYear", String.valueOf(request.getParameter("releaseYear")));
			getServletContext().setAttribute("category", String.valueOf(request.getParameter("category")));
			getServletContext().setAttribute("language", String.valueOf(request.getParameter("language")));
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
