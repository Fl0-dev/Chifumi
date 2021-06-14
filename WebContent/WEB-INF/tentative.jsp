<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Chifoumi</h1>
	<h2>Tentative?</h2>
	<!-- Mettre le nom de la servlet -->
	<form action="<%= request.getContextPath()%>/ServletTraitement" method="post">
		<select name="choix">
			<option value ="papier">PAPIER</option>
			<option value ="ciseau">CISEAU</option>
			<option value = "pierre">PIERRE</option>
		</select>
		<input type="submit" value = "Validez">
	</form>
</body>
</html>