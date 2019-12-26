<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<span style='color: green'> Welcome <c:out
					value="${user_login}" />
			</span>
	<h1>
		<p>

			
			<span>
				<a href="/LibraryServlet?action=add_book">Add new book</a>
			</span>
			
			 <span> <c:forEach var="book" items="${book_list}">

					<ul style='margin: 0; padding: 4px"'>

						<li style='display: inline; marging-right: 5px; padding: 3px;'>
							<c:out value="${book.id}" />
						</li>
						<li style='display: inline; marging-right: 5px; padding: 3px;'>
							<c:out value="${book.title}" />
						</li>
						<li style='display: inline; marging-right: 5px; padding: 3px;'>
							<c:out value="${book.author}" />
						</li>
						<li style='display: inline; marging-right: 5px; padding: 3px;'>
							<c:out value="${book.price}" />
						</li>

					</ul>
				</c:forEach>
			</span>
		</p>
	</h1>
</body>
</html>