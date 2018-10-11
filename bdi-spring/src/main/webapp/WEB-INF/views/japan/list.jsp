<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
</head>
<script>
window.addEventListener('load',function(){
	var xhr = new XMLHttpRequest();
	xhr.open('GET','/japans');
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4){
			if(xhr.status==200){
				var res = JSON.parse(xhr.responseText);
				var html = '';
				for(var j of res){
					html += '<tr>';
					html += '<td><a href="/japans/'+j.jpnum+'">' + j.jpnum + '</a></td>';
					html += '<td><input type="text" name="jpname' + j.jpnum + '" value="' + j.jpname + '"></td>';
					html += '<td><input type="text" name="jpdesc' + j.jpnum + '" value="' + j.jpdesc + '"></td>';
					html += '</tr>';
				}
				document.querySelector('#jpBody').insertAdjacentHTML('beforeend',html);
			}
		}
	}
	xhr.send();
});
</script>
<body>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>설명</th>
		</tr>
	</thead>
	<tbody id="jpBody">
	</tbody>
</table>
</body>
</html>