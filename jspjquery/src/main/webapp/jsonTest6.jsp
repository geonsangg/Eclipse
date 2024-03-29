<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서버로 Json데이터 전송</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	function fn_json_receive() {
		$.ajax({
			type : "post",
			async : false,
			url : "${contextPath}/json2",
			success : function (data, textStatus) {
				let jsonInfo = JSON.parse(data); //서버에서 온 JSON데이터를 파싱
				let memberInfo = "<h2>** 회원정보 **</h2>";
				memberInfo += "===================<br>"
				for(let i in jsonInfo.members) {
					memberInfo += "이름 : " + jsonInfo.members[i].name + "<br>";
					memberInfo += "나이 : " + jsonInfo.members[i].age + "<br>";
					memberInfo += "직업 : " + jsonInfo.members[i].job + "<br><br>";
				}
				$('#output').html(memberInfo);
			},
			error : function (data, textStatus) {
				alert("에러가 발생");	
			}
		});
	}
</script>
</head>
<body>
	<input type="button" value="회원정보 수신하기" onclick="fn_json_receive()">
	<div id="output">
	</div>
</body>
</html>