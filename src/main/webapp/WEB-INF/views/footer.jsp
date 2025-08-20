<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="styles.css">
<link
	href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/remixicon@4.0.0/fonts/remixicon.css"
	rel="stylesheet"> -->
</head>
<script type="text/javascript">

</script>
<style>
/* Google Fonts */
/* @import
	url('https://fonts.googleapis.com/css2?family=Pacifico&display=swap');

@import
	url('https://cdnjs.cloudflare.com/ajax/libs/remixicon/4.5.0/remixicon.min.css')
	; */

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
		sans-serif;
	line-height: 1.6;
	color: #333;
} /* 헤더 스타일 */
.header {
	width: 100%;
	background: rgba(255, 255, 255, 0.9);
	background-color: rgba(255, 255, 255, 0.7); /* 0.7 = 70% 불투명 */
	backdrop-filter: blur(8px);
	border-bottom: 1px solid rgba(229, 231, 235, 0.5);
	position: fixed;
	top: 0;
	z-index: 50;
}

.header-container {
	max-width: 1280px;
	margin: 0 auto;
	padding: 1rem 1.5rem;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.logo {
	font-size: 1.125rem;
	font-weight: 500;
	color: #1f2937;
}

.desktop-nav {
	display: flex;
	align-items: center;
	gap: 2rem;
}

.nav-link {
	font-size: 0.875rem;
	color: #374151;
	text-decoration: none;
	cursor: pointer;
	transition: color 0.2s;
}

.nav-link:hover {
	color: #000;
}

.contact-btn {
	background: #000;
	color: white;
	padding: 0.5rem 1rem;
	font-size: 0.875rem;
	border: none;
	border-radius: 0.25rem;
	cursor: pointer;
	white-space: nowrap;
	transition: background 0.2s;
}

.contact-btn:hover {
	background: #374151;
}

.mobile-menu-btn {
	display: none;
	width: 2rem;
	height: 2rem;
	align-items: center;
	justify-content: center;
	cursor: pointer;
	border: none;
	background: none;
}

.mobile-menu {
	display: none;
	background: rgba(255, 255, 255, 0.95);
	backdrop-filter: blur(8px);
	border-top: 1px solid rgba(229, 231, 235, 0.5);
}

.mobile-nav {
	padding: 1rem 1.5rem;
	display: flex;
	flex-direction: column;
	gap: 1rem;
}

.mobile-nav-link {
	display: block;
	font-size: 0.875rem;
	color: #374151;
	text-decoration: none;
	cursor: pointer;
	padding: 0.5rem 0;
	transition: color 0.2s;
}

.mobile-nav-link:hover {
	color: #000;
}

.mobile-contact-btn {
	width: 100%;
	background: #000;
	color: white;
	padding: 0.5rem 1rem;
	font-size: 0.875rem;
	border: none;
	border-radius: 0.25rem;
	cursor: pointer;
	white-space: nowrap;
	margin-top: 1rem;
	transition: background 0.2s;
}

.mobile-contact-btn:hover {
	background: #374151;
} /* 히어로 섹션 */
.hero-section {
	width: 100%;
	background: white;
	padding: 5rem 0;
	padding-top: 8rem;
}

.hero-container {
	max-width: 1280px;
	margin: 0 auto;
	padding: 0 1.5rem;
}

.hero-content {
	max-width: 36rem;
}

.hero-title {
	font-size: 3rem;
	font-weight: bold;
	color: #000;
	margin-bottom: 1.5rem;
	line-height: 1.2;
}

.hero-description {
	font-size: 1.125rem;
	color: #6b7280;
	margin-bottom: 2rem;
	line-height: 1.6;
}

.hero-btn {
	background: #000;
	color: white;
	padding: 0.75rem 2rem;
	font-size: 1.125rem;
	border: none;
	border-radius: 0.25rem;
	cursor: pointer;
	white-space: nowrap;
	transition: background 0.2s;
}

.hero-btn:hover {
	background: #374151;
}
/* 메인 이미지 섹션 */
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

.image-overlay {
	position: absolute;
	inset: 0;
	background: rgba(0, 0, 0, 0.3);
}

.nav-button {
	position: absolute;
	top: 50%;
	transform: translateY(-50%);
	z-index: 20;
	background: none;
	border: none;
	cursor: pointer;
	padding: 0;
}

.nav-button-left {
	left: 1.5rem;
}

.nav-button-right {
	right: 1.5rem;
}

.nav-button-circle {
	width: 4rem;
	height: 4rem;
	border-radius: 50%;
	display: flex;
	align-items: center;
	justify-content: center;
	transition: all 0.3s;
	border: 1px solid transparent;
}

.nav-button:hover .nav-button-circle {
	background: rgba(255, 255, 255, 0.1);
	backdrop-filter: blur(8px);
	border-color: rgba(255, 255, 255, 0.2);
}

.nav-arrow {
	width: 1.5rem;
	height: 1.5rem;
	color: rgba(255, 255, 255, 0.7);
	transition: color 0.2s;
}

.nav-button:hover .nav-arrow {
	color: white;
}

.pet-type-label {
	position: absolute;
	top: 1.5rem;
	left: 50%;
	transform: translateX(-50%);
	z-index: 20;
}

.pet-type-label span {
	background: rgba(255, 255, 255, 0.2);
	backdrop-filter: blur(8px);
	color: white;
	padding: 0.5rem 1rem;
	border-radius: 9999px;
	font-size: 0.875rem;
	font-weight: 500;
	border: 1px solid rgba(255, 255, 255, 0.3);
}

.image-indicators {
	position: absolute;
	bottom: 1.5rem;
	left: 50%;
	transform: translateX(-50%);
	z-index: 20;
	display: flex;
	gap: 0.75rem;
}

.indicator {
	width: 0.75rem;
	height: 0.75rem;
	border-radius: 50%;
	cursor: pointer;
	transition: all 0.3s;
	background: rgba(255, 255, 255, 0.5);
}

.indicator:hover {
	background: rgba(255, 255, 255, 0.75);
}

.indicator.active {
	background: white;
	transform: scale(1.25);
}

.main-image-content {
	position: relative;
	z-index: 10;
	max-width: 1280px;
	margin: 0 auto;
	padding: 0 1.5rem;
	min-height: 30vh;
	display: flex;
	flex-direction: column;
	justify-content: center;
}

.main-image-text {
	max-width: 32rem;
}

.main-image-title {
	font-size: 2.5rem;
	font-weight: bold;
	color: white;
	margin-bottom: 1.5rem;
	line-height: 1.2;
	text-shadow: 3px 3px 8px black;
}

.main-image-description {
	font-size: 1.25rem;
	color: white;
	margin-bottom: 2rem;
	line-height: 1.6;
	opacity: 0.9;
	text-shadow: 3px 3px 8px black;
}

.main-image-buttons {
	display: flex;
	gap: 1rem;
}

.primary-btn {
	background: white;
	color: #000;
	padding: 0.75rem 2rem;
	font-size: 1.125rem;
	border: none;
	border-radius: 0.25rem;
	cursor: pointer;
	white-space: nowrap;
	font-weight: 500;
	transition: background 0.2s;
}

.primary-btn:hover {
	background: #f3f4f6;
}

.secondary-btn {
	border: 2px solid white;
	color: white;
	background: transparent;
	padding: 0.75rem 2rem;
	font-size: 1.125rem;
	border-radius: 0.25rem;
	cursor: pointer;
	white-space: nowrap;
	font-weight: 500;
	transition: all 0.2s;
	
}

.secondary-btn:hover {
	background: white;
	color: #000;
} /* 제품 섹션 */
.product-section {
	width: 100%;
	background: white;
	padding: 4rem 0;
}

.product-container {
	max-width: 1280px;
	margin: 0 auto;
	padding: 0 1.5rem;
}

.product-title {
	text-align: center;
	font-size: 1.875rem;
	font-weight: bold;
	color: #000;
	margin-bottom: 4rem;
}

.product-grid {
	display: grid;
	grid-template-columns: 1fr;
	gap: 3rem;
}

.product-card {
	transition: all 0.2s;
}

.product-image {
	margin-bottom: 1.5rem;
}

.product-image img {
	width: 100%;
	height: 12rem;
	object-fit: cover;
	object-position: top;
	border-radius: 0.5rem;
	box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);
	transition: box-shadow 0.2s;
}

.product-card:hover .product-image img {
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.product-card-title {
	font-size: 1.25rem;
	font-weight: bold;
	color: #000;
	margin-bottom: 0.75rem;
}

.product-card-description {
	color: #6b7280;
	line-height: 1.6;
} /* 반응형 디자인 */
@media ( min-width : 768px) {
	.desktop-nav {
		display: flex;
	}
	<
	br>.mobile-menu-btn {
		display: none;
	}
	<
	br>.hero-title {
		font-size: 3rem;
	}
	.main-image-title {
		font-size: 3rem;
	}
	.product-grid {
		grid-template-columns: repeat(3, 1fr);
	}
}

.footer {
	width: 100%;
	height:300px;
	background: rgba(255, 255, 255, 0.9);
	background-color: rgba(211, 211, 211, 0.7); /* 0.7 = 70% 불투명 */
	backdrop-filter: blur(8px);
	/* border-bottom: 1px solid rgba(229, 231, 235, 0.5); */
	/* position: fixed; */ 
	/* top: 0; */
	/* z-index: 50; */
}

.footer-container {
	height:300px;
	max-width: 1280px;
	margin: 0 auto;
	padding: 1rem 1.5rem;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

@media ( max-width : 767px) {
	.desktop-nav {
		display: none;
	}
	<
	br>.mobile-menu-btn {
		display: flex;
	}
	<
	br>.mobile-menu.show {
		display: block;
	}
	<
	br>.hero-title {
		font-size: 2.25rem;
	}
	.main-image-title {
		font-size: 2rem;
	}
	<
	br>.main-image-buttons {
		flex-direction: column;
	}
	<
	br>.primary-btn, .secondary-btn {
		width: 100%;
	}
}
```
</style>
</head>
<body>
	<footer class="footer">
		<div class="footer-container">
			<table border="0" style="width: 100%">
				<tr>
					<th><img alt="" src="resources/독캣배송_폰트만.png" width="150px"></th>
					<th>고객센터</th>
					<th>회사정보</th>
					<th>게시판</th>
					<th>찾아오기</th>
				</tr>
				<tr></tr>
				<tr>
					<td>Copyright © DokCatbeasong. All rights reserved.<br>내용</td>
					<td>031-000-0000<br>평일 AM 09:30 ~ PM 06:30<br>(점심시간 : PM 1:00 ~ 2:00)<br>휴무 : 토,일요일 및 공휴일<br><br>신한은행 110-000-000000<br>예금주 : 조찬양</td>
					<td>상호명 : 독캣배송
					<br>대표 : 2팀
					<br>주소 : 경기도 남양주시 화도읍 북한강로 1711-18
					<br>사업자 등록번호 : 000-00-00000
					<br>통신판매신고번호 : 0000-신고번호-0000
					<br>이메일 : info@DCShop.com</td>
					<td>Q&A<br>FAQ</td>
					<td>내용</td>
				</tr>
			</table>
		</div>
	</footer>
</body>
</html>