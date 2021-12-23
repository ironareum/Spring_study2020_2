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
	<h1>test1</h1>
	
	<form:form modelAttribute="dataBean" action="result">
		<form:select path="a1"> <!-- path(=id) -->
			<form:option value="data1">항목1</form:option>
			<form:option value="data2">항목2</form:option> <!-- bean의 a1 속성에 값이 data2로 셋되어있어서 selected 설정됨  -->
			<form:option value="data3">항목3</form:option>
		</form:select>
		<hr />
		
		<form:select path="a2">
			<form:options items="${requestScope.data_list1}"/> <!-- value값과 항목명이 동일. 위(=a1)에는 따로 지정해줄수 있음  -->
		</form:select>
	 	<hr />

		<form:select path="a3">
			<form:options items="${requestScope.data_list2}"/>
		</form:select>
		<hr />
		
		<form:select path="a4">
			<form:options items="${requestScope.data_list3}" itemLabel="key" itemValue="value"/>
		</form:select>
		<hr />

<!-- ============================================ -->
		<form:checkbox path="a5" value="data1"/> 항목1
		<form:checkbox path="a5" value="data2"/> 항목2
		<form:checkbox path="a5" value="data3"/> 항목3
		<hr />
		
		<!-- String 배열 -->
		<form:checkboxes items="${requestScope.data_list1 }" path="a6"/>
		<hr />
		
		<!-- ArrayList -->
		<form:checkboxes items="${requestScope.data_list2 }" path="a7"/>
		<hr />
		
		<!-- Key/value -->
		<form:checkboxes items="${requestScope.data_list3 }" path="a8" itemLabel="key" itemValue="value"/>
		<hr />
		
<!-- ============================================ -->		
		<form:radiobutton path="a9" value="data1"/>	데이터1	
		<form:radiobutton path="a9" value="data2"/>	데이터2	
		<form:radiobutton path="a9" value="data3"/>	데이터3	
		<hr />
		
		<form:radiobuttons path="a10" items="${requestScope.data_list1}"/>
		<hr />
		
		<form:radiobuttons path="a11" items="${requestScope.data_list2}"/>
		<hr />
		
		<form:radiobuttons path="a12" items="${requestScope.data_list3}" itemLabel="key" itemValue="value"/>
		<hr />
		
		
		
	</form:form>
	
</body>
</html>