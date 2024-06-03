<%@page import="com.techpalle.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student details</h1>
<%
ArrayList<Student> al = (ArrayList<Student>)request.getAttribute("student");
%>

<table border = "2">
<%
for(Student s : al)
{
%>
	
	<tr bgcolor="yellow"> <td><%=s.getSno()%></td> 
	     <td><%=s.getSname()%></td> 
	     <td><%=s.getCourse()%></td> 
	     <td><%=s.getGender()%></td>
	     <td><%=s.getemail()%></td>
	     <td><%=s.getqualification()%></td>
	</tr>
<%
	
}
%>
</table>
</body>
</html>