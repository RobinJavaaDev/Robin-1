<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jquery-3.6.0.min.js"></script>
</head>
<style>
table tr:hover{
cursor:pointer;
background:grey;
}
</style>
<body>
<div align="center">
 <div><h1>공지사항목록</h1></div>
	<div>
		<form id="frm">
			<select name="state" id="state">
				<option value="1">전체리스트</option>
				<option value="2">작성자</option>
				<option value="3">제목</option>
				<option value="4">내용</option>
			</select>&nbsp;<input type="text" id="key" name="key">&nbsp;
			<button type="button" onclick="searchList()">검색</button>
		</form>
	</div><br/>
	<div>
		<table id="tb" border="1">
			<thead>
				<tr>
					<th width="70">순번</th>
					<th width="150">작성자</th>
					<th width="300">제목</th>
					<th width="150">작성일자</th>
					<th width="70">조회수</th>
					
				</tr>
			</thead>
			<tbody>
				<c:if test="${not empty boards}">
					<c:forEach items="${boards }" var="b">
						<tr onclick="eventList(${b.boardId})">
							<td>${b.boardId}</td>
							<td>${b.boardName}</td>
							<td>${b.boardTitle}</td>
							<td>${b.boardDate}</td>
							<td>${b.boardHit}</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty boards}">
					<tr>
						<td colspan="6" align="center">게시글이 존재하지 않습니다.</td>
					</tr>
				</c:if>
			</tbody>
		</table>
		<form id="frm2" action="" method="post">
			<input type="hidden" id="boardId" name="boardId">
			</form>
	</div><br/>
	<div>
		<button type="button" onclick="location.href='boardInsertForm.do'">글쓰기</button>
	</div>
</div>
</body>
<script type="text/javascript">
function eventList(data){
		   frm2.boardId.value = data;
		   frm2.action="getContent.do";
		   frm2.submit();
}
function searchList(){
	let state = $("#state").val(); //documentElementById("state").value;
	let key = $("#key").val();
	
	$.ajax({
		url: "ajaxSearchList.do",
		type: "post",
		data:{"state" : state, "key" : key},
		dataType : "json",
		success: function(data){
			htmlConvert(data);
		},
		error: function(){
			alert("의도치 않은 오류 발생")
		}
	});
}
function htmlConvert(data){
	$("tbody").remove();
	let tbody = $("<tbody/>");
	$.each(data,function(index,n){
		var row = $("<tr onclick='eventList("+b.boardId+")''/>").append(
				$("<td/>").text(b.boardId),
				$("<td/>").text(b.boardName),
				$("<td/>").text(b.boardTitle),
				$("<td/>").text(b.boardDate),
				$("<td/>").text(b.boardHit),
		);
		tbody.append(row);
	});
	$("#tb").append(tbody);
}
</script>
</html>