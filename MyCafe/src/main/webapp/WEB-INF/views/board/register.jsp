<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="utf-8" language="java"
	contentType="text/html; charset=utf-8"%>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/board/register.jsp</title>
</head>
<body>
<div>
	<form role ="form" action="/board/register" method="post">
		<div class="form-group">
		
		<label>Title</label>
		<input class="form-control" name='title'>
		</div>
		
		<div class="form-group">
		<label>Text area</label>
		<textarea class="form-control" rows="3" name ='content' cols=""></textarea>
		</div>
		
		<div class="form-group">
		<label>Writer</label>
		<textarea class="form-control" rows="3" name ='writer' cols=""></textarea>
		</div>
		
		<button type="submit">등록 완료</button>
		<button type="reset">취소</button>
	</form>
</div>

</body>
</html>