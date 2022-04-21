//variable.js

var myName = '이재빈'; //String
var yourName; // undefined
myName = 100; // number
myName = true; // boolean
myName = null; // object

console.log(typeof yourName);
var youName = "홍길동";
console.log(typeof yourName);

// 전역변수(스크립트변수), 지역변수(함수안에서 변수)

function checkInfo() {
  var myName = 'leejaebin'
  console.log(myName);
}

checkInfo();  
console.log(myName);
//let 블럭레벨 변수선언.
//ES6 (EX2035)-> let //52

function info(){
  let myName ='hong';
console.log(myName);
}
var myName = 'hong'



const otherName = 'Hong';
