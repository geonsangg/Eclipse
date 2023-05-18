<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON 테스트</title>
</head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	function fn_jsonoutput() {
		let jsonData = '{"name":["김철수","홍길동","이영희"]}';
		let jsonInfo = JSON.parse(jsonData);
		let output = "<h2>회원이름</h2>";
		output += "==================<br>";
		for(let i in jsonInfo.name) {
			output += jsonInfo.name[i]+"<br>";
		}
		$('#result').html(output);
	}
</script>
<body>
	<input type="button" value="JSON데이터 출력" onclick="fn_jsonoutput()">
	<div id="result">
	</div>
</body>
</html>