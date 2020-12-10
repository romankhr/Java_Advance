<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cabinet</title>
</head>
<body>
<h1>Welcome to the cabinet <%= request.getAttribute("userName") %></h1>

	<form action="JournalManager" method ="post">
	
	<table>
    <tr>
        <th>Name</th>
        <th>Publisher</th>
        <th>Year</th>
        <th>Month</th>
    </tr>

    <c:forEach items="${journal}" var="personlist">
        <tr>
            <td>${personlist}</td>
            <td>${personlist.publication}</td>
            <td>${personlist.year}</td>
            <td>${personlist.month}</td>
        </tr>
    </c:forEach>

</table>
	
	
	
		
	<h2><%= request.getAttribute("journal") %></h2>
		<input type="submit" value="submit">
		
	</form>



</body>
</html>