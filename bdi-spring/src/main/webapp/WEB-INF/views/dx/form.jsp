<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
</head>
<script>
	var dxForm;
	function doInit() {
		var forms = [
			{type : 'settings', position : 'label-left', labelWidth : 100, inputWidth : 100},	
			{type : 'fieldset', label : '부서', inputWidth : 150, list : [ 
				{type:'input',label:'test'}
			]},
			{type:'button',value:'버튼', name : 'btn'}
		]
		var dxForm = new dhtmlXForm('dxForm',forms);
		dxForm.attachEvent('onButtonClick', function(name) {
			alert(name);
		})
	}
	window.addEventListener('load',doInit);
</script>
<body>
<div id="dxForm" style="height:100px"></div>
</body>
</html>