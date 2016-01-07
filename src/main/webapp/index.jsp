<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="50%" cellpadding="0" cellspacing="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>身份证</td>
		</tr>
		<s:iterator var="list" value="#session.LIST">
			<tr>
				<td><s:property value="#list.personid "/></td>
				<td><s:property value="#list.personname"/></td>
				<td><s:property value="#list.idcard"/></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>