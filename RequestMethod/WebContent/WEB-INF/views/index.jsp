<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<a href="test1">test1_get</a>
	<form action="test1" method="post">
		<button type="submit">test1_post</button>
	</form>
	
	<hr />
	<a href="test2">test2_get</a>
	<form action="test2" method="post">
		<button type="submit">test2_post</button>
	</form>
	
	<hr />
	<a href="test3">test3_get</a> <!--각각 @리퀘스트맵핑 메소드별로 jsp 페이지 따로 만들어줌   -->
	<form action="test3" method="post">
		<button type="submit">test3_post</button>
	</form>
	
	<hr />
	<a href="test4">test4_get</a>
	<form action="test4" method="post">
		<button type="submit">test4_post</button> <!-- @겟매핑을 썻기때문에 포스트방식 작동 안함  -->
	</form>
	
	<hr />
	<a href="test5">test5_get</a> <!-- @포스트매핑을 썻기때문에 겟방식 작동 안함  -->
	<form action="test5" method="post">
		<button type="submit">test5_post</button>
	</form>
	
	<hr />
	<a href="test6">test6_get</a> 
	<form action="test6" method="post">
		<button type="submit">test6_post</button>
	</form>
	
	<hr />
	<a href="test7">test7_get</a> 
	<form action="test7" method="post">
		<button type="submit">test7_post</button>
	</form>
	
	<hr />
	<a href="test8">test8_get</a> 
	<form action="test8" method="post">
		<button type="submit">test8_post</button>
	</form>
	
	
	
</body>
</html>