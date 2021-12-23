<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result (회원정보수정완료)</h1>
	
	이름 : ${requestScope.dataBean.user_name}	<br />
	아이디 : ${requestScope.dataBean.user_id }	<br /> 
	비밀번호 : ${requestScope.dataBean.user_pw }<br />
	우편번호 : ${requestScope.dataBean.user_postcode } <br />
	집주소 : ${requestScope.dataBean.user_address1 }	<br />
	회사주소 : ${requestScope.dataBean.user_address2 } <br />
</body>
</html>