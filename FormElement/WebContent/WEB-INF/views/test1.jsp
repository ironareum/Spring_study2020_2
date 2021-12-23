<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	<form:form modelAttribute="dataBean" action="result">
		hide: <form:hidden path="a1"/><br />
		text: <form:input path="a2"/><br />
		password: <form:password path="a3" showPassword="true"/><br />
		textarea: <form:textarea path="a4"/><br />
		select : <form:select path="a4">
					<form:option value="a"></form:option>
					<form:option value="b"></form:option>
				 </form:select> <br /> f[]
		<button disabled="true">확인</button> <!-- disalbed : 버튼 클릭 작동 안함  -->
	</form:form>
</body>
</html>