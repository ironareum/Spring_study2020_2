<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="test1" method="post"> <!-- 스프링에서는 action의 값을 보고 컨트롤러로 가서 찾음. jsp아님  -->
		data1 : <input type="text" name="data1"/> <br />
		data2 : <input type="text" name="data2"/> <br />
		<button type=submit>submit</button>
	</form>
	
	<form action="test2" method="post">
		data3 : <input type="text" name="data3"/><br />
		data4 : <input type="text" name="data4" /> <br />
		<button type="submit">submit</button>
	</form>
	
</body>
</html>