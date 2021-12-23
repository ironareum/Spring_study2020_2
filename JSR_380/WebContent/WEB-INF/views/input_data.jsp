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
	<h1>input_data</h1>
	
	<form:form action="input_pro" modelAttribute="dataBean1" method="post">
		공백허용 : <form:input path="data1" type="text"/> <br />
		<form:errors path="data1"/> <br />
		
		공백허용 안함 : <form:input path="data2" type="text"/> <br />
		<form:errors path="data2"/> <br />
		
		0보다 큰양수 : <form:input path="data3" type="text"/> <br />
		<form:errors path="data3"/> <br />
		
		0 또는 양수 : <form:input path="data4" type="text"/> <br />
		<form:errors path="data4"/> <br />
		
		음수만 허용 : <form:input path="data5" type="text"/> <br />
		<form:errors path="data5"/> <br />
		
		0 또는 음수 : <form:input path="data6" type="text"/> <br />
		<form:errors path="data6"/> <br />
		
		이메일 : <form:input path="data7" type="text"/> <br />
		<form:errors path="data7"/> <br />
		
		
		
		<form:button type="submit"> submit</form:button>
	</form:form>
	
</body>
</html>