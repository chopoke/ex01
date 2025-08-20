<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/* function get_type() {
		let get = document.getElementById('p_dog').value;
		console.log(get);
		
		$("#selectBox").empty();
		
		if (get == "dog") {
          $("#selectBox").append("<option value='말티즈'>말티즈</option>");
          $("#selectBox").append("<option value='포메라니안'>포메라니안</option>");
          $("#selectBox").append("<option value='푸들'>푸들</option>");
          $("#selectBox").append("<option value='진돗개'>진돗개</option>");
          $("#selectBox").append("<option value='리트리버'>리트리버</option>");
          $("#selectBox").append("<option value='보더콜리'>보더콜리</option>");
        } else if (get == "cat") {
        	$("#selectBox").append("<option value='코숏'>코숏</option>");
            $("#selectBox").append("<option value='먼치킨'>먼치킨</option>");
            $("#selectBox").append("<option value='샴'>샴</option>");
            $("#selectBox").append("<option value='러시안블루'>러시안블루</option>");
            $("#selectBox").append("<option value='메인쿤'>메인쿤</option>");
            $("#selectBox").append("<option value='스핑크스'>스핑크스</option>");
        }
	} */
	function get_dog() {
		
		$("#selectBox").empty();
		
        $("#selectBox").append("<option value='말티즈'>말티즈</option>");
        $("#selectBox").append("<option value='포메라니안'>포메라니안</option>");
        $("#selectBox").append("<option value='푸들'>푸들</option>");
        $("#selectBox").append("<option value='진돗개'>진돗개</option>");
        $("#selectBox").append("<option value='리트리버'>리트리버</option>");
        $("#selectBox").append("<option value='보더콜리'>보더콜리</option>");
        $("#selectBox").append("<option value='기타'>기타</option>");
        
	}
	function get_cat() {
		
		$("#selectBox").empty();
		
		$("#selectBox").append("<option value='코숏'>코숏</option>");
        $("#selectBox").append("<option value='먼치킨'>먼치킨</option>");
        $("#selectBox").append("<option value='샴'>샴</option>");
        $("#selectBox").append("<option value='러시안블루'>러시안블루</option>");
        $("#selectBox").append("<option value='메인쿤'>메인쿤</option>");
        $("#selectBox").append("<option value='스핑크스'>스핑크스</option>");
        $("#selectBox").append("<option value='기타'>기타</option>");
        
	}
</script>
</head>
<body>
<h1>펫 등록</h1>
<table  width="500px" border="1">
	<tr>
		<th>반려동물 종류</th>
		<td><input type="radio" name="p_dog" id="p_dog" value="dog" onclick="get_dog()"> 강아지</td>
		<td><input type="radio" name="p_dog" id="p_dog" value="cat" onclick="get_cat()"> 고양이</td>
	</tr>
	<tr>
		<th>상세품종</th>
		<td colspan="2" width="300px">
		<select id="selectBox">
			<option value=''>반려동물 종류를 선택해주세요.</option>
  		</select>
		</td>
	</tr>
	<tr>
		<th>반려동물 이름</th>
		<td colspan="2"><input type="text" name="p_name" id="p_name" > </td>
	</tr>
	
	<tr>
		<th>반려동물 생년월일</th>
		<td colspan="2">
			<input type="date" class="input" name="p_birthday" size="8" >
		</td>
	</tr>
	
	<tr>
		<th>반려동물 무게</th>
		<td colspan="2"><input type="text" name="p_name" id="p_name" size="5" >kg </td>
	</tr>
	<tr>
		<th>반려동물 성별</th>
		<td><input type="radio" name="p_gen" id="p_gen"> 수컷</td>
		<td><input type="radio" name="p_gen" id="p_gen"> 암컷</td>
	</tr>
	<tr>
		<th>중성화 여부</th>
		<td><input type="radio" name="p_gen" id="p_gen"> Y(네)</td>
		<td><input type="radio" name="p_gen" id="p_gen"> N(아니오)</td>
	</tr>
</table>
<button onclick="window.location='${path}/joinfin'">건너뛰기</button>
<button onclick="window.location='${path}/joinfin'">다음</button>
</body>
</html>