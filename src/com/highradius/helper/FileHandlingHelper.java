package com.highradius.helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.highradius.model.Movie;

public class FileHandlingHelper {
	
	protected static String FILE_DEST = "D:/practice/ServletTraining/src/movies.csv";

	public static ArrayList<Movie> readFromAFile() throws Exception {
		FileInputStream fileInputStream = new FileInputStream(FILE_DEST);
		byte[] bytes = new byte[fileInputStream.available()];
		fileInputStream.read(bytes);

		StringBuilder output = new StringBuilder();
		for (byte b : bytes) {
			output.append((char) b);
		}
		fileInputStream.close();
		String[] rows = output.toString().split("\n");
		ArrayList<Movie> list = new ArrayList<Movie>();
		for (int i = 1; i < rows.length; i++) {
			String[] props = rows[i].split(String.valueOf(","));
			Movie row = new Movie();
			row.setTitle(props[0]);
			row.setDescription(props[1]);
			row.setReleaseYear(Integer.parseInt(props[2]));
			row.setLanguage(props[3]);
			row.setLength(Double.parseDouble(props[4]));
			row.setRating(Double.parseDouble(props[5]));
			row.setSpecialFeatures(props[6]);

			list.add(row);
		}
		return list;
	}
	
	public static void writeToTheFile(String output) throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream(FILE_DEST);
		FileInputStream fileInputStream = new FileInputStream(FILE_DEST);
		fileOutputStream.write(output.getBytes(), fileInputStream.available(), output.getBytes().length);
		fileInputStream.close();
		fileOutputStream.close();
	}
}
