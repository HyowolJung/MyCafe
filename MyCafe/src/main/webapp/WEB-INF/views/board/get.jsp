<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="utf-8" language="java"
	contentType="text/html; charset=utf-8"%>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>/board/get.jsp</title>
</head>
<body>
	<div>
		<div class="form-group">
			<label>Bno</label> <input name='bno' type="hidden"
				value='<c:out value = "${board.bno}" />' readonly="readonly">
		</div>
		<div class="form-group">
			<label>Title</label> <input name='title'
				value='<c:out value = "${board.title}" />' readonly="readonly">
		</div>
		<div class="form-group">
			<label>Text area</label>
			<textarea name='content' rows="3" readonly="readonly"><c:out
					value="${board.content}" /></textarea>
		</div>
		<div class="form-group">
			<label>Writer</label> <input name='writer'
				value='<c:out value = "${board.writer}" />' readonly="readonly">
		</div>

		<button data-oper='modify'>수정</button>
		<button data-oper='list'>목록</button>

		<form id='operForm' action="/board/modify" method="get">
			<input type='hidden' id='bno' name='bno'
				value='<c:out value="${board.bno }"/>'>
		</form>

		<script type="text/javascript">
			$(document).ready(function() {
				var operForm = $("#operForm");

				$("button[data-oper='modify']").on("click", function(e) {
					operForm.attr("action", "/board/modify").submit();
				});

				$("button[data-oper='list']").on("click", function(e) {
					operForm.find("#bno").remove();
					operForm.attr("action", "/board/list")
					operForm.submit();
				});
			});
		</script>
	</div>
</body>
</html>