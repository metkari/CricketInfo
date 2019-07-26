<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>  New Bank Account</h1>
<form:form action="/SpringMvcExample/saveAccount" method="POST" >
	<table>
		<tr>
			<td>Bank Name </td> <td> <form:input  path="bankName" /></td>
			<td>Branch : </td> <td> <form:input  path="branch" /></td>
			 <td> <input type="submit" value="Save" ></td>
		</tr>
		${msg}
	</table>
</form:form>
</body>
</html>