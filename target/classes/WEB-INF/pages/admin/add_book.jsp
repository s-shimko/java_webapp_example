<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new book</title>
</head>
<body>
			<span style='color: green'> Welcome <c:out
					value="${user_login}" />
			</span>

<form action="LibraryServlet" method="GET">
</label>
 <input type="hidden" name="action" value="save_book" /> 
  <label>Book title></label> <input type="text" name="book_title" /> 
  <label>Book author></label> <input type="text" name="book_author" /> 
  <label>Book price></label> <input type="text" name="book_price" /> 
  <input type="submit" value="save_book" />
 </form>
 
</body>
</html>