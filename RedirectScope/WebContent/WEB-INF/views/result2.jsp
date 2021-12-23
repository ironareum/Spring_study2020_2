<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result2</h1>
	data_model1 : ${requestScope.data_model2 } <br /> <!-- null -->
	data1 : ${requestScope.data2 } <br /> <!-- test2 주입값 -->
	data11 : ${requestScope.data22 } <br /> <!-- 리퀘스트 포워드로 가져온값 -->
</body>
</html>