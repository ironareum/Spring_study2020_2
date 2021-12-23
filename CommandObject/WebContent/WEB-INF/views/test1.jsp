<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	data1 : ${requestScope.dataBean.data1 } <br /> <!-- 객체명에서 앞자를 소문자로 바꿔줘야함. dataBean -->
	data2 : ${requestScope.dataBean.data2 } <br />
</body>
</html>