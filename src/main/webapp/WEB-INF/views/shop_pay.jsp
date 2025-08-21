<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/4117d52847.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="styles.css">
<link
	href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/remixicon@4.0.0/fonts/remixicon.css"
	rel="stylesheet">
<!-- (3-4). 자바스크립트 소스 연결 -->
<!-- defer : html을 다 읽은 후에 자바스크립트를 실행한다. 페이지가 모두 로드된 후에 해당 외부 스크립트가 실행된다. -->
<style type="text/css">
	body {
		font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
			sans-serif;
		line-height: 1.6;
		color: #333;
	}

	.main-image-section {
	/* width: 70%; */
	
	position: relative;
	min-height: 60vh;
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	
	max-width: 1280px;
	margin: 0 auto;
	padding: 0 1.5rem;
	}
	.hero-section {
	width: 100%;
	background: white;
	padding: 5rem 0;
	padding-top: 8rem;
}
</style>

</head>
<body>
	<!-- 헤더 시작 -->
		<%@ include file="header.jsp" %>
	<!-- 헤더 끝 -->
	<section class="hero-section">
		<!-- <div class="hero-container">
			<div class="hero-content">
				<h1 class="hero-title">랜딩 페이지 제목</h1>
				<p class="hero-description">실용성 있는 디자인과 직관적이며 대담한 추상적 조합으로, 사용하기
					자연스럽고 유용한 소프트웨어를 초점에 맞춘다.</p>
				<button class="hero-btn">더보기</button>
			</div>
		</div> -->
	</section>
		<!-- 컨텐츠 시작 -->
		<section class="main-image-section" id="main-image-section" width="600px">
		
			<h1>상품 결제페이지</h1>
	<table>
		<tr>
			<td><a href="${path}/shop_fin"><img alt="" src="resources/상품결재.png" width="1000px"></a></td>
		</tr>
	</table>
		
		</section>
		<!-- 컨텐츠 끝 -->
	
	<!-- 푸터 시작 -->
	<%@ include file="footer.jsp" %>
	<!-- 푸터 끝 -->
</body>
</html>