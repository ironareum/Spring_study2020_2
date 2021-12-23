<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1 (회원가입용)</h1>
	<form action="result" method="post">
		이름 : <input type="text" name="user_name" />	<br />
		아이디 : <input type="text" name="user_id"/><br /> 
		비밀번호 : <input type="text" name="user_pw" /><br />
		우편번호 : <input type="text" name="user_postcode" /><br />
		집주소 : <input type="text" name="user_address1"/><br />
		회사주소 : 	<input type="text" name="user_address2"/><br />
		<button type="submit">회원가입</button>
	</form>
	
	<h1>test1_Get (회원정보수정용)</h1>
	<form action="result" method="post">					
		이름 : <input type="text" name="user_name" value="${requestScope.dataBean.user_name}"/><br />
		아이디 : <input type="text" name="user_id" value="${ requestScope.dataBean.user_id}"/><br /> 
		비밀번호 : <input type="text" name="user_pw" value="${ requestScope.dataBean.user_pw}"/><br />
		우편번호 : <input type="text" name="user_postcode" value="${ requestScope.dataBean.user_postcode}"/> <br />
		집주소 : <input type="text" name="user_address1" value="${ requestScope.dataBean.user_address1}"/><br />
		회사주소 : 	<input type="text" name="user_address2" value="${ requestScope.dataBean.user_address2}"/><br />
		<button type="submit">정보수정완료</button>
	</form>
</body>
</html>