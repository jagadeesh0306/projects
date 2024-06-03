<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>INSERT STUDENT DETAILS</h1>
<form action="insertstudent" method = "post">
    <input type = "text" name = "name" placeholder="enter student name"/><br>
    <input type = "text" name = "course" placeholder="enter course"/><br>
    
    <label>Gender : </label>
    <input type="radio" class="rdgender" name="rdgender" value="male">
    <label for="male">Male</label>
    <input type="radio" class="rdgender" name="rdgender" value="female">
    <label for="female">female</label><br>
    <input type = "email" name = "email" placeholder = "enter email"/><br>
    <input type = "text" name = "qualification" placeholder = "enter qualification"/><br>
     <input type = "submit" value = "insert student"/>
</form>
</body>
</html>