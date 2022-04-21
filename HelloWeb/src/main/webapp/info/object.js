// object.js 
let member1 = {
  fullName: 'Hong',
  age: 20,
  score: 80
}
let member2 = {
  fullName: 'Hwang',
  age: 22,
  score: 88
}
let member3 = {
  fullName: 'Park',
  age: 22,
  score: 92
}
member1.fullName = '홍';
console.log(member1.fullName)
console.log(member1.age + member2.age);

// {}= object 타입 {key: value}, {key: value}

const members = [member1, member2, member3];
// 홍의 나이는 20이고 점수는 80입니다.
document.write('<ul>');
for (let i = 0; i < members.length; i++) {
  document.write('<li>' + members[i].fullName + ',' + members[i].age + ',' + members[i].score + '</li>');
}
document.write('</ul>');
document.write('<ul>');
for (let i = 0; i < members.length; i++){
  document.write(`<li>${members[i].fullName},${members[i].age}, ${members[i].score}</li>`);
}
document.write('</ul>');
let welcome = `하이
  반갑읍니다`;
console.log(welcome)