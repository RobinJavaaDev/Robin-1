<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
					<th width="70">첨부파일</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${not empty notices}">
					<c:forEach items="${notices }" var="n">
						<tr>
							<td>${n.noticeId}</td>
							<td>${n.noticeName}</td>
							<td>${n.noticeTitle}</td>
							<td>${n.noticeDate}</td>
							<td>${n.noticeHit}</td>
							<td>${n.noticeAttech}</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty notices}">
					<tr>
						<td colspan="6" align="center">게시글이 존재하지 않습니다.</td>
					</tr>
				</c:if>
			</tbody>
		</table>
		<form id="frm2" action="" method="post">
			<input type="hidden" id="noticeId" name="noticeId">
			</form>
	</div><br/>
	<div>
		<button type="button" onclick="location.href='noticeInsertForm.do'">글쓰기</button>
	</div>
</div>
</body>
<!-- 그룹이벤트 생성(상세조회) -->
<script>
	let list = document.querySelector('tbody');
	list.addEventListener('click',function(ev){
		if(ev.target.tagName ==='TD'){
		//console.log(ev.target.parentNode.children[0].textContent);
		//location.href ='getContent.do?noticeId='+ev.target.parentNode.children[0].textContent;
		frm2.noticeId.value = ev.target.parentNode.children[0].textContent;
		frm2.action="getContent.do";
		frm2.submit();
		}	
	})
</script>
<script type="text/javascript">
	function searchList(){
		let list = document.querySelector('tbody');
		let tb = "<tr/>";
		
		fetch('ajaxSearchList.do',{
			method: 'POST',
			body: new FormData(document.getElementById('frm'))
		})
		.then(response => response.json())
		.then(data => {
			list.remove();
			data.forEach(n=>{
			let td = "<tr><td>",
			td+= n.noticeId + "</td>",
			td.append(n.noticeId)
			td.append(n.noticeName)
			td.append(n.noticeTitle)
			td.append(n.noticeDate)
			td.append(n.noticeHit)
			td.append(n.noticeAttech);
			td.append(t);
			})
			list.add(t);
			list.disabled=true;
		})
	}
	
	
</script>
</html>