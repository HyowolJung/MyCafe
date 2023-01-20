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
	<div>
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
			<textarea name='content' rows="3" readonly="readonly"><c:out
					value="${board.content}" /></textarea>
		</div>
		<div class="form-group">
			<label>Writer</label> <input name='writer'
				value='<c:out value = "${board.writer}" />' readonly="readonly">
		</div>
		<div class="form-group">
			<label>RegDate</label> <input name='RegDate'
				value='<fmt:formatDate pattern = "yyyy/MM/dd" value = "${board.regdate}" />' readonly="readonly">
		</div>
		<div class="form-group">
			<label>UpdateDate</label> <input name='updateDate'
				value='<fmt:formatDate pattern = "yyyy/MM/dd" value = "${board.updateDate}" />' readonly="readonly">
		</div>

		<button type="submit" data-opper='modify'>수정하기</button>
		<button type="submit" data-opper='remove'>삭제하기</button>
		<button type="submit" data-opper='list'>목록</button>
	</div>
<script type="text/javascript">




</script>
	
</body>
</html>