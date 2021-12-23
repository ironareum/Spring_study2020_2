<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result1</h1>
	requestBean1.data1 : ${requestScope.data1 } <br /> <!-- 안나옴 -->
	requestBean1.data2 : ${requestScope.data2 } <br /> <!-- 안나옴 -->
	<hr />
	
	requestBean1.data1 : ${requestScope.requestBean1.data1 } <br />
	requestBean1.data1 : ${requestScope.requestBean1.data2 } <br />
	<hr />
	
	requestBean2.data1 : ${requestScope.requestBean2.data1 } <br />
	requestBean2.data2 : ${requestScope.requestBean2.data2 } <br />
	<hr />
	
	requestBean3.data1 : ${requestScope.requestBean3.data1 } <br />
	requestBean3.data2 : ${requestScope.requestBean3.data2 } <br />
	<hr />
	
	requestBean4.data1 : ${requestScope.requestBean4.data1 } <br />
	requestBean4.data2 : ${requestScope.requestBean4.data2 } <br />
	
</body>
</html>