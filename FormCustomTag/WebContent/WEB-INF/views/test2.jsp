<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test2</h1>
	<form:form modelAttribute="dataBean" action="result">				
		이름 : <form:input path="user_name"/> <br />
		아이디 : <form:input path="user_id"/><br /> 
		비밀번호 : <form:password path="user_pw" showPassword="true"/> <br />
		우편번호 : <form:input path="user_postcode"/> <br />
		집주소 : <form:input path="user_address1"/> <br />
		회사주소 : <form:input path="user_address2"/> <br />
		<button type="submit">정보수정완료</button>
	</form:form>
</body>
</html>