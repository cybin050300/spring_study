<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>todo 등록</title>
<style>
.text_center {
	text-align: center;
}
</style>
</head>
<body>
	<form method="post" action="${contextPath}/member/addMember.do">
		<h1 class="text_center">todo 등록</h1>
		<table align="center">
			<tr>
				<td width="200"><p align="right">Tno</td>
				<td width="400"><input type="text" name="Tno"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">Tittle</td>
				<td width="400"><input type="password" name="Tittle"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">Writer</td>
				<td width="400"><p>
						<input type="text" name="Writer"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">DueDate</td>
				<td width="400"><p>
						<input type="text" name="DueDate"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">Finished</td>
				<td width="400"><p>
						<input type="text" name="Finished"></td>
			</tr>
			<tr>
				<td width="200"><p>&nbsp;</p></td>
				<td width="400"><input type="submit" value="등록하기"><input
					type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
</body>