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
	<h3>application 주입 </h3>
	applicationBean1.data1 : ${applicationScope.bean1.data1 } <br /> 
	applicationBean1.data2 : ${applicationScope.bean1.data2 } <br />
	
	
	<hr />
	<h3>model 주입 </h3>
	applicationBean1.data1 : ${requestScope.bean1.data1 } <br />
	applicationBean1.data2 : ${requestScope.bean1.data2 } <br />
	<br />
	applicationBean2.data3 : ${requestScope.bean2.data3 } <br />
	applicationBean2.data4 : ${requestScope.bean2.data4 } <br />
	<br />
	applicationBean3.data5 : ${requestScope.bean3.data5 } <br />
	applicationBean3.data6 : ${requestScope.bean3.data6 } <br />
	<br />
	applicationBean4.data7 : ${requestScope.bean4.data7 } <br />
	applicationBean5.data8 : ${requestScope.bean4.data8 } <br />
</body>
</html>