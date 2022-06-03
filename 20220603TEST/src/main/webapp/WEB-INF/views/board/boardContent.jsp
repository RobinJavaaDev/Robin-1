 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>게시판</h1>
		</div>
		<div>
			<table id="tb" border="1">
				<tr>
					<th width="70">작성자</th>
					<td width="870">${content.boardName}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${content.boardTitle}</td>
				</tr>
				<tr>
					<th>작성일</th>
					<td>${content.boardDate}</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td>${content.boardHit}</td>
				</tr>
				
				<tr>
					<th height="400">작성글</th>
					<td>${content.boardContents}</td>
				</tr>
				
					
			</table>
		</div>
		<br />
		<div>
			<button type="button" onclick="location.href='boardModifyForm.do?noticeId=${content.boardId}'">수정</button>
			<button type="button" onclick="removeCheck()">삭제</button>
			<button type="button" onclick="location.href='boardList.do'">목록</button>
		</div>
	</div>
</body>
<script type="text/javascript">
function removeCheck(){
	if(confirm("해당글을 지우시겠습니까??") == true){
		location.href="boardDelete.do?boardId="+${content.boardId};	
	}else
	 false;
}
</script>
</html>