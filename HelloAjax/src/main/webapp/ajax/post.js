//post.js


document.addEventListener('DOMContentLoaded',init);

//리스트
function init(){
	let xhtp = new XMLHttpRequest();
	xhtp.open('get','../studentList.json');
	xhtp.send();
	xhtp.onload = function(){
		let data = JSON.parse(xhtp.responseText);
		console.log(data);
		let tbodyList = document.getElementById('list');
	    data.forEach(function(elem){
		let newTr = makeTr(elem);
		tbodyList.appendChild(newTr);
	})	
  }//end of onload
  
  let modBtn = document.querySelector('input[type="button"]');
  modBtn.addEventListener('click', function(){
    let no = document.querySelector('input[name=sno]').value;
    let name = document.querySelector('input[name=sname]').value;
    let eng = document.querySelector('input[name=eng]').value;
    let kor = document.querySelector('input[name=kor]').value;
    
    let xhtp = new XMLHttpRequest();
    xhtp.open('get',`modStudentServlet?sno=${no}&sname=${name}&eng=${eng}&kor=${kor}`);
    console.log(xhtp.open);
    xhtp.send();
	xhtp.onload = function(){
	  let result = JSON.parse(xhtp.responseText);
	  console.log(result);
	  if(result.retCode == 'OK'){
		//결과값으로 받은 값을 새로운 tr.
		let obj = {
			studNo:result.studNo,
			studName: result.studName,
			engScore: result.engScore,
			korScore:result.korScore
		}
		let newTr = makeTr(obj);
		let oldTr = document.getElementById(result.studNo);
		console.log(oldTr);
		document.getElementById('list').replaceChild(newTr, oldTr);// 새로운 tr -> 이전 tr 대체.
	}else{
		alert('변경 중 오류');
	}
  }
})
} // end of init


//변경처리
function modStudent(){
	
	
}


//한건추가
function addStudent(e){
	e.preventDefault(); // submit -> 차단
	console.log(e);
	
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eng"]').value;
	let kor = document.querySelector('input[name="kor"]').value;
	
	let xhtp = new XMLHttpRequest(); // 비동기방식으로 서버의 파일 요청
	xhtp.open('get',`addStudentServlet?sno=${no}&sname=${name}&eng=${eng}&kor=${kor}`);
	xhtp.send();
	xhtp.onload = function(){
	  console.log(xhtp.responseText); // {"retCode": "Success"}
	  let result = JSON.parse(xhtp.responseText); //{"retCode": "Success"}
	  if(result.retCode == 'Success'){
		//리스트 새로운 값 추가	
		successCallBack2(result); // {retCode:?, studNo:?, studName:?, eng:?, kor:? } 
	}else if(result.retCode == 'Fail'){
		//처리중 에러 발생
		failCallBack();
	}
  }// end of function()
}// end of addStudent(e)

function makeTr(student){
let tr = document.createElement('tr');
  tr.setAttribute('id',student.studentNo); // 라인삭제 id지정 -> getElementById
  for(let field in student){ //student['studNo']
    let td = document.createElement('td');
    td.innerHTML = student[field];
    tr.appendChild(td);
  }
  	//삭제버튼 생성.
   let delBtn = document.createElement('button'); //<button></button>
   delBtn.innerHTML = '삭제';
   
   //이벤트 등록
   delBtn.addEventListener('click',function(){
	//삭제(id 파악 => ajax호출) : this -> 이벤트 대상 엘리먼트.
	let id = this.parentElement.parentElement.firstChild.innerHTML;
	console.log(id);
	let xhtp = new XMLHttpRequest();
	xhtp.open('get','delStudentServlet?delId='+id);
	xhtp.send();
	xhtp.onload = function(){
		let result = JSON.parse(xhtp.responseText);
		console.log(result);
		if(result.retCode == 'OK'){
			
			alert(result.retVal + '건삭제')
			document.getElementById(result.retVal).remove();
			console.log(result.retVal);
		}else{
			
			console.log(result.retVal);
		}
	  }
 	});
   
   
   let td = document.createElement('td'); //<td></td>
   td.appendChild(delBtn); // <td><button>삭제</button></td>
   tr.appendChild(td);
    return tr;
}//end of makeTr(student)

function successCallBack(){
	//사용자 입력값을 id='list' 하위 추가
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eng"]').value;
	let kor = document.querySelector('input[name="kor"]').value;
	
	let obj = {
		studentNo:no,
		studentName:name,
		engScore:eng,
		korScore:kor
	 };
		
	
	let row = makeTr(obj);
	document.getElementById('list').appendChild(row);

function failCallBack(){
	alert('처리중 에러발생.');
	
}
}//end of successCallBack()

function successCallBack2(retObj){
	// {"retCode": "Success", "studNo":studentNo, "studName":studentName, "engScore":eng, "korScore":kor }
	console.log(retObj);
	let obj = {
		studentNo: retObj.studNo,
		studName: retObj.studName,
		engScore: retObj.engScore,
		korScore: retObj.korScore
	}
	document.getElementById('list').appendChild(makeTr(obj));
}//end of successCallBack2()
