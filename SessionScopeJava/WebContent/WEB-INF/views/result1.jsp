<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result1</h1>
	<h3>//session</h3>
	sessionBean1.data1 : ${sessionScope.bean1.data1 } <br />
	sessionBean1.data2 : ${sessionScope.bean1.data2 } <br />
	<br />
	sessionBean2.data3 : ${sessionScope.bean2.data3 } <br />
	sessionBean2.data4 : ${sessionScope.bean2.data4 } <br />
	<br />
	sessionBean3.data5 : ${sessionScope.bean3.data5 } <br />
	sessionBean3.data6 : ${sessionScope.bean3.data6 } <br />
	<br />
	sessionBean4.data7 : ${sessionScope.sessionBean4.data7 } <br />
	sessionBean4.data8 : ${sessionScope.sessionBean4.data8 } <br />
	<hr />
	
	<h3>//model로 받을때 (request)</h3>
	sessionBean1.data1 : ${requestScope.bean1.data1 } <br />
	sessionBean1.data2 : ${requestScope.bean1.data2 } <br />
	<br />
	sessionBean2.data3 : ${requestScope.bean2.data3 } <br />
	sessionBean2.data4 : ${requestScope.bean2.data4 } <br />
	<br />
	sessionBean3.data5 : ${requestScope.bean3.data5 } <br />
	sessionBean3.data6 : ${requestScope.bean3.data6 } <br />
	<br />
	sessionBean4.data7 : ${requestScope.bean4.data7 } <br />
	sessionBean4.data8 : ${requestScope.bean4.data8 } <br />
	
	
	
	
</body>
</html>