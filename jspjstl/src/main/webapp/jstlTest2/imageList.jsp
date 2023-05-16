<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록리스트</title>
</head>
<body>
	<h2 align="center">상품목록리스트</h2>
	<table border="1" width="900" align="center">
		<tr>
			<th>상품이미지</th><th>상품명</th><th>선택하기</th>
		</tr>
		<c:forEach var="i" begin="0" end="4" step="1">
			<tr align="center">
				<td width="300">
					<img alt= "" src="../images/${i }.png">
				</td>
				<td width="300">
					냉장고 ${i }
				</td>
				<td width="300">
					<input type="checkbox" name="chk${i} ">
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>