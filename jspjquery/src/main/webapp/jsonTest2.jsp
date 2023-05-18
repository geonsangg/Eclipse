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
		let jsonData = '{"age":[20,50,23]}';
		let jsonInfo = JSON.parse(jsonData);
		let output = "<h2>회원나이</h2>";
		output += "==================<br>";
		for(let i in jsonInfo.age) {
			output += jsonInfo.age[i]+"<br>";
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