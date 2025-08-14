<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/4117d52847.js" crossorigin="anonymous"></script>

<!-- (3-4). 자바스크립트 소스 연결 -->
<!-- defer : html을 다 읽은 후에 자바스크립트를 실행한다. 페이지가 모두 로드된 후에 해당 외부 스크립트가 실행된다. -->
<script src="${path}/resources/js/customer/login.js" defer></script>
<script src="${path}/resources/js/common/main.js" defer></script>
</head>
<body>
	<div class="wrap">
		<!-- 헤더 시작 -->
		<%-- <%@ include file="../../common/header.jsp" %> --%> <!-- customer/webapp/common/header.jsp -->
		<!-- 헤더 끝 -->
		
		<!-- 컨텐츠 시작 -->
		<div id="container">
			<div id="contents">
				<!-- 상단 중앙1 시작 -->
				<div id="section1">
					<h1 align="center">로그인</h1>
				</div>
				<!-- 상단 중앙2 시작 -->
				<div id="section2">
					<div id="s2_inner">
						<div class="join">
							<form name="loginform" action="loginaction.do" method="post" >
								<!-- 2-1. 중복확인을 거치지 않았을때 0으로 설정 -->
								<input type="hidden" name="hiddenuserid" value="0">
								<table>
									<tr>
										<th>아이디</th>
										<td>
											<input type="text" class="input" name="user_id" size="20" placeholder="공백없이 20자 이내로 작성" required autofocus>
										</td>
									</tr>
									<tr>
										<th>비밀번호</th>
										<td>
											<input type="password" class="input" name="user_password" size="20" placeholder="공백없이 20자 이내로 작성" required>
										</td>
									</tr>
									
									<tr>
										<td colspan="2" style="border-bottom: none;">
											<div align="right">
												<input class="inputbutton" type="submit" value="로그인">
												<input class="inputbutton" type="reset" value="초기화">
												<input class="inputbutton" type="button" value="회원가입" onclick="window.location='${path}/join'">
											</div>
										</td>
									</tr>
								</table>
							</form>
						</div>	<!-- join end -->
					</div>
				</div>
				<!-- 상단 중앙2 끝 -->
				
			</div>
		</div>
		<!-- 컨텐츠 끝 -->
		
		<!-- 푸터 시작 -->
		<%-- <%@ include file="../../common/footer.jsp" %> --%>
		<!-- 푸터 끝 -->
	</div>
</body>
</html>