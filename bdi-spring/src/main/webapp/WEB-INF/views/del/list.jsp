<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
<script>
	var jpGrid;
	window.addEventListener('load',function() {
		jpGrid = new dhtmlXGridObject('divGrid');
		jpGrid.setImagePath('${resPath}/codebase/imgs/');
		jpGrid.setHeader('num,name,age');
		jpGrid.init();
	});
	
</script>
</head>
<body>
	<div id="divGrid"></div>
</body>
</html>