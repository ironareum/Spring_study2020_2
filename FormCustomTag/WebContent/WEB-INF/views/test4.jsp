<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test4</h1>
	
	<form:form modelAttribute="test_user2" action="result">
		이름: <form:input path="user_name"/> <br />
		아이디: <form:input path="user_id"/> <br />
		비번: <form:input path="user_pw"/> <br />
		<button type="submit">수정완료 </button>
	</form:form>
	
</body>
</html>