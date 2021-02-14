<%@page
	import="javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.highradius.model.Movie"%>
<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saskila_html</title>
<script type="text/javascript">
function alertName(bool) {
	alert("Form has been submitted: "+bool);
}
</script>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
		<s:if test = "isDbActionSuccess==true">
         <div style="background-color: red; text-align: center">
		<h3>DB has been altered</h3>
	</div>
      </s:if>
	<div style="background-color: blue; text-align: center">
		<h1>Movie Database HRMDB CSV search</h1>
	</div>
	<div>
		<form action="/StrutsHibernateApp/CSVSearch" method="post">
			<div style="width: 50%; float: left; align-content: center">
				<div
					style="width: 50%; float: left; text-align: right; padding-right: 5px">Title</div>
				<input type="text" name="title" onChange="isNaN"
					value=<%if (getServletContext().getAttribute("title") != null)
				out.print(getServletContext().getAttribute("title"));%>>
			</div>
			<div style="width: 50%; float: left; align-content: center">
				<div
					style="width: 50%; float: left; text-align: right; padding-right: 5px">Release
					Year</div>
				<input type="text" name="releaseYear" onChange="isNaN"
					value=<%if (getServletContext().getAttribute("releaseYear") != null)
				out.print(getServletContext().getAttribute("releaseYear"));%>>
			</div>
			<div style="width: 50%; float: left; align-content: center">
				<div
					style="width: 50%; float: left; text-align: right; padding-right: 5px">Category</div>
				<input type="text" name="category" onChange="isNaN"
					value=<%if (getServletContext().getAttribute("category") != null)
				out.print(getServletContext().getAttribute("category"));%>>
			</div>
			<div style="width: 50%; float: left; align-content: center">
				<div
					style="width: 50%; float: left; text-align: right; padding-right: 5px">Language</div>
				<input type="text" name="language" onChange="isNaN"
					value=<%if (getServletContext().getAttribute("language") != null)
				out.print(getServletContext().getAttribute("language"));%>>
			</div>
			<div style="text-align: center">
				<input type="submit" value="Submit" /><input type="reset"
					value="Reset" style="margin-left: 10px" />
			</div>
		</form>
	</div>
	<div style="background-color: cyan; text-align: center">
		<h1>Movie Database HRMDB DB Search</h1>
	</div>
	<div>
		<form action="/StrutsHibernateApp/DBSearch" method="post">
			<div style="width: 50%; float: left; align-content: center">
				<div
					style="width: 50%; float: left; text-align: right; padding-right: 5px">Title</div>
				<input type="text" name="title" onChange="isNaN"
					value=<%if (getServletContext().getAttribute("title") != null)
				out.print(getServletContext().getAttribute("title"));%>>
			</div>
			<div style="width: 50%; float: left; align-content: center">
				<div
					style="width: 50%; float: left; text-align: right; padding-right: 5px">Release
					Year</div>
				<input type="text" name="releaseYear" onChange="isNaN"
					value=<%if (getServletContext().getAttribute("releaseYear") != null)
				out.print(getServletContext().getAttribute("releaseYear"));%>>
			</div>
			<div style="width: 50%; float: left; align-content: center">
				<div
					style="width: 50%; float: left; text-align: right; padding-right: 5px">Category</div>
				<input type="text" name="category" onChange="isNaN"
					value=<%if (getServletContext().getAttribute("category") != null)
				out.print(getServletContext().getAttribute("category"));%>>
			</div>
			<div style="width: 50%; float: left; align-content: center">
				<div
					style="width: 50%; float: left; text-align: right; padding-right: 5px">Language</div>
				<input type="text" name="language" onChange="isNaN"
					value=<%if (getServletContext().getAttribute("language") != null)
				out.print(getServletContext().getAttribute("language"));%>>
			</div>
			<div style="text-align: center">
				<input type="submit" value="Submit" /><input type="reset"
					value="Reset" style="margin-left: 10px" />
			</div>
		</form>
		<form action="/StrutsHibernateApp/alterData/local/addDataToDB">
			<input type="submit" value="add Moar Data" />
		</form>
		<form action="/StrutsHibernateApp/alterData/local/deleteDataFromDB">
			<input type="submit" value="clear DB" />
		</form>
		<form action="/StrutsHibernateApp/extjs/loginpage">
			<input type="submit" value="to EXTjs login page" />
		</form>
	</div>

	<div style="background-color: cyan; text-align: center">
		<h1>Results</h1>
	</div>
	<table style="width: 100%">
		<tr>
			<th>Title</th>
			<th>Studio</th>
			<th>Release Year</th>
			<th>Genre</th>
			<th>User Score</th>
			<th>Critic Score</th>
			<th>Gross Product(Millions)</th>
		</tr>
		<%!public void resetContext() {
		getServletContext().removeAttribute("list");
	}%>

		<%
			if (getServletContext().getAttribute("list") != null
					&& getServletContext().getAttribute("list") instanceof ArrayList<?>) {
				ArrayList<Movie> list = new ArrayList<>();
				list = (ArrayList<Movie>) getServletContext().getAttribute("list");
				for (Movie movie : list) {
					out.println("<tr>\n<td>" + movie.getTitle() + "</td>");
					out.println("<td>" + movie.getDescription() + "</td>");
					out.println("<td>" + movie.getReleaseYear() + "</td>");
					out.println("<td>" + movie.getLanguage() + "</td>");
					out.println("<td>" + movie.getLength() + "</td>");
					out.println("<td>" + movie.getRating() + "</td>");
					out.println("<td>" + movie.getSpecialFeatures() + "</td>\n</tr>");
				}
			}
			getServletContext().removeAttribute("list");
		%>
		<s:iterator value="listFromAction">
			<tr>
				<td><s:property value="title" /></td>
				<td><s:property value="description" /></td>
				<td><s:property value="releaseYear" /></td>
				<td><s:property value="language" /></td>
				<td><s:property value="length" /></td>
				<td><s:property value="rating" /></td>
				<td><s:property value="specialFeatures" /></td>
		</s:iterator>
	</table>
</body>
</html>