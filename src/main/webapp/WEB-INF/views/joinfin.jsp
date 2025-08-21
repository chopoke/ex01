<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.fin {
		font-size: 300%;
		font-weight: 800;
		color: 	#8B6331;
	}
	.contact-btn2 {
	background: #E6B36D;
	color: white;
	padding: 0.5rem 1rem;
	font-size: 3rem;
	border: none;
	border-radius: 1.5rem;
	cursor: pointer;
	white-space: nowrap;
	transition: background 0.2s;
	width: 400px
	}
	.contact-btn1 {
	background: #D27328;
	color: white;
	padding: 0.5rem 1rem;
	font-size: 3rem;
	border: none;
	border-radius: 1.5rem;
	cursor: pointer;
	white-space: nowrap;
	transition: background 0.2s;
	width: 400px
	}
</style>
</head>
<body>
<!-- 헤더 시작 -->
		<%@ include file="header.jsp" %>
	<!-- 헤더 끝 -->
	<br><br><br><br><br><br>
	<div align="center" class="fin">가입되었습니다.<br>환영합니다.</font></div>
	
	<br>
	<div align="center">
	<img alt="" src="resources/환영.png" width="500px"><br><br>
	<button class="contact-btn2" onclick="window.location='${path}/login'" >로그인</button>
	<%-- <a onclick="window.location='${path}/login'"> <img alt="" src="resources/로그인으로.png" width="500px"> --%><br><br>
	<button class="contact-btn1" onclick="window.location='${path}/main'" >홈</button>
	<%-- <a onclick="window.location='${path}/main'"> <img alt="" src="resources/홈으로.png" width="500px"></a> --%>
	</div>
	<br>
	<%-- <button onclick="window.location='${path}/main'">홈</button> --%>
	<!-- 푸터 시작 -->
	<%@ include file="footer.jsp" %>
	<!-- 푸터 끝 -->
</body>
</html>