<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Cricket info</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.vertical-menu {
  width: 200px;
}

.vertical-menu a {
  background-color: #eee;
  color: black;
  display: block;
  padding: 12px;
  text-decoration: none;
}

.vertical-menu a:hover {
  background-color: #ccc;
}

.vertical-menu a.active {
  background-color: #4CAF50;
  color: white;
}
</style>
  
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome to World Of Cricket</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">ODI Career</a></li>
      <li><a href="#">Test Career</a></li>
      <li><a href="#">T20 Career</a></li>
    </ul>
  </div>
</nav>
  
  <!-- <div class="vertical-menu">
  <a href="#" class="active">Home</a>
  <a href="#">Link 1</a>
  <a href="#">Link 2</a>
  <a href="#">Link 3</a>
  <a href="#">Link 4</a>
</div> -->
<div class="container">
  
  <p></p>
  
  <div class="panel panel-primary">
      <div class="panel-heading">Player Dashboards</div>
     
      
       <!--  <a href="/SpringMvcCRUD/playerList"> List of Players</a>
<a href="/SpringMvcCRUD/editList"> Edit</a> -->

<form:form action="/SpringMvcCRUD/savePlayer" method="POST" >
	<table>
	<h3>${msg}</h3>
		<tr>
			<td>Player No </td> <td> <form:input  path="playerNo" />
			
		</tr>
		<tr>
			<td>Player Name </td> <td> <form:input  path="playerName" />
			
		</tr>
		<tr>
			<td>Player Age : </td> <td> <form:input  path="playerAge" />
		</tr>
		<tr>
			 <td> <input type="submit" value="Save" ></td>
			 
		</tr>
		
	</table>
	
	<h3>List of Players</h3>
	
	 <table border="2">
	 
	 <tr>
	 <th>Player Number</th>
	 <th>Player Name</th>
	 <th>Player Age</th>
	 <th>Edit Player</th>
	 <th>Delete Player</th>
	 </tr>
<c:forEach items="${list}" var="player">
			<tr>
				<td><input type="text" value="<c:out value="${player.playerNo}"/>"/></td>
				<td><c:out value="${player.playerName}"/></td>
				<td><c:out value="${player.playerAge}"/></td>
				<td><a href="/SpringMvcCRUD/update${player.playerNo}">Edit</a> </td>
                 <td><a href="/SpringMvcCRUD/delete${player.playerNo}">delete</a> </td>		
		</tr>
		
</c:forEach>

</table>
	
</form:form>
  
      
      
    </div>
    
    
</div>


</body>
</html>