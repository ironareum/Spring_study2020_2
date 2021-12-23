<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- get 요청 -->
	<a href="test1?data1=100&data2=200&data3=300&data3=400">test1_get</a>
	<hr />
	
	<!-- post 요청 -->
	<form action="test2" method="post">
	data1 : <input type="text" name="data1"/> <br />
	data2 : <input type="text" name="data2"/> <br />
	data3 : <input type="checkbox" name="data3" value="100"/> data3_100 <br />
			<input type="checkbox" name="data3" value="200"/> data3_200 <br />
		<button type="submit">test2_post</button>
	</form>
	<hr />
	
	<!-- WebRequest -->
	<a href="test3?data1=100&data2=200&data3=300&data3=400">test3_get</a>
	<hr />
	
	<!-- 데이터를 순서대로 처리함 (/를 줘서 값을 구분. 여기서는 값만 줌) -->
	<a href="test4/100/200/300">test4</a>
	<hr />
	
	
	<!-- RequestParam -->
	<a href="test5?data1=100&data2=200&data3=300&data3=400">test5_get</a>
	<hr />
	
	<!-- RequestParam : 변수명 바꿔서 저장 -->
	<a href="test6?data1=100&data2=200&data3=300&data3=400">test6_get</a>
	<hr />
	
	<!-- 존재하지 않는 데이터를 불러올때에 대한 오류 막기 (=null값으로 대체)  -->
	<a href="test7?data1=100&data3=500">test7_get</a>
	<hr />
	
</body>
</html>