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
<title>/board/modify.jsp</title>
</head>
<body>
	<form role="form" action="/board/modify" method="post">
		<div class="form-group">
			<label>Bno</label> <input name='bno'
				value='<c:out value = "${board.bno}" />' readonly="readonly">
		</div>
		<div class="form-group">
			<label>Title</label> <input name='title'
				value='<c:out value = "${board.title}" />'>
		</div>
		<div class="form-group">
			<label>Text area</label>
			<textarea name='content' rows="3"><c:out
					value="${board.content}" /></textarea>
		</div>
		<div class="form-group">
			<label>Writer</label> <input name='writer'
				value='<c:out value = "${board.writer}" />' readonly="readonly">
		</div>
		<div class="form-group">
			<label>RegDate</label> <input name='RegDate'
				value='<fmt:formatDate pattern = "yyyy/MM/dd" value = "${board.regdate}" />'
				readonly="readonly">
		</div>
		<div class="form-group">
			<label>UpdateDate</label> <input name='updateDate'
				value='<fmt:formatDate pattern = "yyyy/MM/dd" value = "${board.updateDate}" />'
				readonly="readonly">
		</div>

		<button type="submit" data-oper='modify'>수정하기</button>
		<button type="submit" data-oper='remove'>삭제하기</button>
		<button type="submit" data-oper='list'>목록</button>
	</form>

	<script type="text/javascript">
		$(documnet).ready(function() {

			var formObj = $("form");

			$('button').on("click", function(e) {
				e.preventDefault();

				var operation = $(this).data("oper");

				consol.log(operation);
				
				$("button[data-oper='remove']").on("click", function(e) {
					formObj.attr("action", "/board/remove");
				});
				
				$("button[data-oper='list']").on("click", function(e) {
					formObj.attr("action", "/board/list").attr("method", "get");
					formObj.empty();
					return;
				});
				
				/* if (operation === 'remove') {
					formObj.attr("action", "/board/remove");
				} else if (operation === 'list') {
					formObj.attr("action", "/board/list").attr("method", "get")
					formObj.empty();
					//self.location = "/board/list";
					return;
				} */
				formObj.submit();
			});
		});
	</script>

</body>
</html>