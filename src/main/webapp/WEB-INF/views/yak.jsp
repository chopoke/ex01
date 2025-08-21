<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 헤더 시작 -->
		<%@ include file="header.jsp" %>
	<!-- 헤더 끝 -->

	<section class="hero-section">
<h1 align="center">약관</h1>
<div align="center">
	<table>
		<tr align="center">
			<th>개인정보</th>
		</tr>
		<tr align="center">
			<td>내용</td>
		</tr>
		<tr align="center">
			<td>내용</td>
		</tr>
		<tr align="center">
			<td><input type="checkbox">동의 </td>
		</tr>
		<tr align="center">
			<th>마케팅</th>
		</tr>
		<tr align="center">
			<td>내용</td>
		</tr>
		<tr align="center">
			<td>내용</td>
		</tr>
		<tr align="center">
			<td><input type="checkbox">동의 </td>
		</tr>
	</table>
</div>
<div align="center">
<button onclick="window.location='${path}/join'">다음</button>
</div>
</section>
<!-- 푸터 시작 -->
		<%@ include file="footer.jsp" %>
	<!-- 푸터 끝 -->
</body>
</html>