<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q2</title>
</head>
<body>
	<form action="quiz2" method="post">
		num1 : <input type="number" name="num1"><br>
		num2 : <input type="number" name="num2"><br>
		<input type="submit" value="넘기기">
	</form>
	
	TwoVO의 num1 : ${n1}<br>
	TwoVO의 num2 : ${n2}<br>
</body>
</html>