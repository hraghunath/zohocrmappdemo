<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

First Name :${lead.firstName }<br>
Last Name :${lead.lastName }<br>
Email : ${lead.email }<Br>
Mobile : ${lead.mobile }<Br>
Source : ${lead.source }<br>

<form action="sendEmail" method="post">
<input type="hidden" name="email" value="${lead.email }" />
<input type="submit" value="send Email"/>
</form>
<form action="convertLead" method="post">
<input type="hidden" name="id" value="${lead.id }" />

<input type="submit" value="Convert"/>
</form>


</body>
</html>