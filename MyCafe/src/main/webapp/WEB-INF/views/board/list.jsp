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
</head>
<body>

	<a href="./board?bgno=1" type="button" id="bgnohidden">공지게시판</a>
	<a href="./board?bgno=2" type="button" id="bgnohidden2">자유게시판</a>

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
					<!-- bgno를 받아야 할 곳이 필요 -->
					<td><c:out value="${board.bno}" /> <input type="hidden"
						name="bgnohidden" value="type " />
					<td><a
						href='/board/get?bno=<c:out value="${board.bno}"/> & /board/get?bgno=<c:out value="${board.bgno}"/>'>
							<c:out value="${board.title}" />
					</a></td>
					<td><c:out value="${board.writer}" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd"
							value="${board.regdate}" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd"
							value="${board.updateDate}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<%-- <td><c:out value="${board.bgno}" />  --%>
	<%-- <td><c:out value="${board.title}" /></td> --%>

	<button id='regBtn' type="button" class="btn btn-xs pull-right">글쓰기</button>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {

			$("#regBtn").on("click", function() {
				self.location = "/board/register";
			});

			//버튼을 눌렀을 때 값 생성
			$(document).ready(function() {

				$("#bgnohidden").on("click", function() {
					$.ajax({
						url : "/board/list",
						type : "POST",
						data : "bgno",
						/* dataType: */
						success : function(data) {

						}

					});

				}); 
			});
		});
	</script>
</body>
</html>

<!--  			//버튼을 눌러서 값이 생성될때 컨트롤러로 넘김
			$(document).ready(function() {

				$("#bgnohidden").on("click", function() {
					$.ajax({
						url : "/board/list",
						type : "POST",
						data : "{bgno : bgno}",
						/* dataType: */
						success : function(data) {

						}

					});

				}); 
			});-->