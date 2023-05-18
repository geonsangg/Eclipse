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
		let jsonData = '{"members":[{"name":"손흥민", "age":31, "gender":"남자", "nickname":"손세이셔널"},{"name":"손흥민2", "age":31, "gender":"남자", "nickname":"손세이셔널"},{"name":"손흥민3", "age":31, "gender":"남자", "nickname":"손세이셔널"}]}';
		let jsonInfo = JSON.parse(jsonData);
		let output = "<h2>회원나이</h2>";
		output += "==================<br>";
		for(let i in jsonInfo.members) {
			output += "이름 : " + jsonInfo.members[i].name + "<br>";
			output += "나이 : " + jsonInfo.members[i].age + "<br>";
			output += "성별 : " + jsonInfo.members[i].gender + "<br>";
			output += "별명 : " + jsonInfo.members[i].nickname + "<br><br>";
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