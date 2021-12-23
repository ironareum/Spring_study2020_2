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
	
	<h3>회원정보 사용 동의여부 </h3>
	<form:form action="input_pro" method="post" modelAttribute="dataBean1">
		<form:radiobutton path="data1" value="true"/> 회원정보 사용에 동의 합니다.  <br />
		<form:radiobutton path="data1" value="false"/> 회원정보 사용에 동의 하지않습니다.  <br />
		<!--유효성 위배시 출력  -->
		<form:errors path="data1"/> <br />

		<h3>이메일 수신 동의여부 </h3>
		<form:radiobutton path="data2" value="true"/> 이메일 수신 동의  <br />
		<form:radiobutton path="data2" value="false"/> 이메일 수신 거부  <br />
		<!--유효성 위배시 출력  -->
		<form:errors path="data2"/> <br />

		<h3>값 </h3>
		<form:input path="data3"/>  <br />
		<!--유효성 위배시 출력  -->
		<form:errors path="data3"/> <br />

		<h3>data4 </h3>
		<form:input path="data4"/>  <br />
		<!--유효성 위배시 출력  -->
		<form:errors path="data4"/> <br />

		<%-- <h3>data5 </h3>
		<form:input path="data5"/> <br />
		<form:errors path="data5"/> <br />
		
		<h3>data6 </h3>
		<form:input path="data6"/>  <br />
		<form:errors path="data6"/> <br /> --%>
		

		<h3>checkbox </h3>
		data5 : <form:checkbox path="data5" value="check1"/> checkbox1 <br />
		<form:errors path="data5"/> <br />
		
		data6 : <form:checkbox path="data6" value="check2"/> checkbox2 <br />
		<form:errors path="data6"/> <br />
		
		<h3>data7 </h3>
		<form:input path="data7" type="text"/>  <br />
		<form:errors path="data7"/> <br />
		
		<h3>data8 </h3>
		<form:input path="data8" type="text"/>  <br />
		<form:errors path="data8"/> <br />

		<h3>비밀번호 패턴 </h3>
		<form:input path="data9" type="text"/>  <br />
		<form:errors path="data9"/> <br />

		<h3>이메일 패턴 </h3>
		<form:input path="data10" type="text"/>  <br />
		<form:errors path="data10"/> <br />

		<h3>이메일 패턴 2 </h3>
		<form:input path="data11" type="text"/>  <br />
		<form:errors path="data11"/> <br />

		<h3>아이디 </h3>
		<form:input path="userId" type="text"/>  <br />
		<form:errors path="userId"/> <br />

		<h3>패스워드 </h3>
		<form:input path="password" type="text"/>  <br />
		<form:errors path="password"/> <br />
		
		
		<form:button type="submit">submit</form:button>
	</form:form>	
	
	
		
		
</body>
</html>