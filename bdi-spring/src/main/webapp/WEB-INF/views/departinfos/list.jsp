<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>스프링테스트</title>
<link rel="stylesheet" type="text/css" href="${resPath}/dhtmlx/skins/skyblue/dhtmlx.css" />
<script>
	var jpGrid;
	window.addEventListener('load',function() {
		jpGrid = new dhtmlXGridObject('divGrid');
		jpGrid.setImagePath('${resPath}/dhtmlx/skins/skyblue/imgs/dhxgrid_skyblue/');
		jpGrid.setHeader('부서번호,부서명,부서설명,부서인원');
		jpGrid.setColumnIds('diNo,diName,diDesc,diCnt');
		jpGrid.setColAlign('center,center,center,center');
		jpGrid.setColTypes('ro,ed,ed,ed');
		jpGrid.setColSorting('int,str,st,int'); // 정렬
		jpGrid.init(); // 초기화
		au.send({url : '/test/departinfos',success:function(res) {
			res = JSON.parse(res);
			jpGrid.parse(res, 'js');	// 'js' => javascript
		}});
	})
</script>
</head>
<body>
	<div id="divGrid" style="width: 500px; height: 350px; background-color: white;"></div>
</body>
</html>