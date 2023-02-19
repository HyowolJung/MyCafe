<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="utf-8" language="java"
	contentType="text/html; charset=utf-8"%>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/board/list.jsp</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>
<!-- <button href="/board/list?bgno=1" type="button" class="btn btn-xs pull-right">공지게시판</button>
<button href="/board/list?bgno=2" type="button" class="btn btn-xs pull-right">자유게시판</button> -->

<c:choose >
	<c:when test="${bgno == 1}">
	<h1 class="h3 mb-2 text-gray-800">공지게시판</h1>
	</c:when>
	<c:when test="${scri.bgno == 2}">
	<h1 class="h3 mb-2 text-gray-800">자유게시판</h1>
	</c:when>
</c:choose>


	<div>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th style="background-color: #eeeeee; text-align: center;">번호</th>
					<th style="background-color: #eeeeee; text-align: center;">제목</th>
					<th style="background-color: #eeeeee; text-align: center;">작성자</th>
					<th style="background-color: #eeeeee; text-align: center;">작성일</th>
					<th style="background-color: #eeeeee; text-align: center;">수정일</th>
				</tr>
			</thead>

			<c:forEach items="${list}" var="board">
				<tr>
					<td><c:out value="${board.bno}" />
					<td><c:out value="${board.bgno}" />
					<%-- <td><c:out value="${board.title}" /></td> --%>
					<td><a href='/board/get?bno=<c:out value="${board.bno}"/> & /board/get?bgno=<c:out value="${board.bgno}"/>'> <c:out value="${board.title}" /></a></td>
					<td><c:out value="${board.writer}" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate}" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updateDate}" /></td>
				</tr>	
			</c:forEach>
		</table>
	</div>

	<button id='regBtn' type="button" class="btn btn-xs pull-right">글쓰기</button>

	<script type="text/javascript">
		$(document).ready(function() {

			$("#regBtn").on("click", function() {
				self.location = "/board/register";
			});

		});
	</script>
</body>
</html>