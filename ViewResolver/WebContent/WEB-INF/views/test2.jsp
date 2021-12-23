<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test2</h1>
	<h3>data1 : ${requestScope.data1}</h3>
	<h3>data2 : ${requestScope.data2}</h3>
	<!-- requestScope: 요청정보가 발생되서 그 응답결과가 브라우저로 전달될때까지 생명주기를 갖고있음 -->
</body>
</html>