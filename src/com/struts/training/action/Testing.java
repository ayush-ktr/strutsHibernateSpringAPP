package com.struts.training.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.helper.FileHandlingHelper;
import com.highradius.manager.CommonUseManager;
import com.highradius.manager.MovieListManager;
import com.highradius.model.Movie;

public class Testing {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		MovieListManager movieManager = (MovieListManager) appContext.getBean("movieListServiceImpl");
		
		try {
			movieManager.findMovies(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
