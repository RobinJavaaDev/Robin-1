<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>게시글수정</h1>
		</div>
		<form id="frm" action="boardModify.do" method="post"
			enctype="multipart/form-data">
			<input type="hidden" id="boardId" name="boardId" value="${notice.boardId }">
			<div>
				<table border="1">
					<tr>
						<th width="70">작성자</th>
						<td width="150">
						<input type="hidden" id="boardName" name="boardName" value="${notice.boardName }">
						${notice.boardName}</td>
						<th width="70">작성일자</th>
						<td width="150">${notice.boardDate }</td>

					</tr>


					<tr>
						<th width="100">제목</th>
						<td colspan="3"><input type="text" size="30" id="noticeTitle"
							name="noticeTitle" value="${notice.boardTitle }"></td>
					</tr>
					<tr>
						<th width="100">내용</th>
						<td colspan="3"><textarea rows="10" cols="55"
								id="boardContent" name="boardContent">
								${notice.boardContent }</textarea></td>
					</tr>
				</table>
			</div>
			<br />
			<div>
				<input type="submit" value="수정">&nbsp; <input type="button"
					value="목록" onclick="location.href='boardList.do'">
			</div>
		</form>

	</div>
</body>
</html>