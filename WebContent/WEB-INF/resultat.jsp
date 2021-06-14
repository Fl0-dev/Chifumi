<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="/WEB-INF/erreurJSP.jsp"
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>RESULTAT</h1>
	<% String result = (String)request.getAttribute("result"); %>
	
	<h3><%=result%></h3>
	
<!-- mettre l'url-pattern du web.xml -->

	<a href="<%=request.getContextPath()%>/ServletTraitement">Rejouer?</a>
	
</body>
</html>