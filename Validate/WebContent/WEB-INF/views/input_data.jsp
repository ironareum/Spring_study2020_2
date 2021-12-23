<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>input_data</h1>
	<form action="input_pro" method="post">
		data1 <input type="text" name="data1" /> <br />
		<!-- dataBean1에 error를 감지하기 위한 설정(result에 담겨진 위배된 결과인 Errors를 활용) -->
		<spring:hasBindErrors name="dataBean1">
			<!-- 만약 data1에 위배가 되어 있다면 --> <!-- 나중에 JSR380 같은걸로 사용할수있음 -->
			<c:if test="${errors.hasFieldErrors('data1')}">
				${errors.getFieldError('data1').defaultMessage} <br />
			</c:if>
		</spring:hasBindErrors>
		
		data2 <input type="text" name="data2"/> <br />
		
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('data2') }">
				${errors.getFieldError('data2').defaultMessage} <br />
			</c:if>
		</spring:hasBindErrors>
		
		
		<button type="submit">확인</button>
		
	</form>
</body>
</html>