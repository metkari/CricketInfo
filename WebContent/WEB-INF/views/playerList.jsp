<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<c:forEach items="${list}" var="player">
			<tr>
				<td><c:out value="${player.playerNo}"/></td>
				<td><c:out value="${player.playerName}"/></td>
				<td><c:out value="${player.playerAge}"/></td>
				<td><a href="/SpringMvcCRUD/update?playerNo=${player.playerNo}">Edit</a> </td>
		</tr>
		
</c:forEach>

</table>

</body>
</html>