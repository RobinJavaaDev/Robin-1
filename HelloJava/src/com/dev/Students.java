package com.dev;

public class Students {
   //학생번호, 학생이름, 국어점수, 수학점수, 영어점수 <=필드로 정의
	
	private int studNo; 
    private String studName;
    private int korScore = -1;
    private int mathScore = -1;
    private int engScore = -1;
    
    //생성자: 필드의 값을 초기화
    public Students() {
       this.studNo = 1;
       this.studName = "nobody";
       this.korScore = 0;
       this.engScore = 0;
    }
    
    public Students(int studNo) {
       this.studNo = studNo;
    }
    public Students( int studNo, String studName,int korScore, int mathScore, int engScore) {
     
      this.studNo = studNo;
      this.studName = studName;
      this.korScore = korScore;
      this.mathScore = mathScore;
      this.engScore = engScore;
   }

   public Students(int studNo, String studName) {
       this.studNo = studNo;
       this.studName = studName;
       
    }
    
    public Students(String string, int i, int j, int k, int l) {
	// TODO Auto-generated constructor stub
}

	//영어, 국어, 수학 ==> 값이 저장되면 평균값을 구해보자.   
    public double getAvgScore() {
       return getSumScore() / 3.0;
    }
    
    //영어, 국어, 수학 ==> 합계점수도 출력
    public int getSumScore() {
       if(this.korScore != -1 && this.engScore != -1 && this.mathScore != -1) {
          return this.korScore + this.engScore + this.mathScore;
       }
       return -1;
    }
    //기능(method) =>규칙이 존재함. 반환값/ 메소드명/ 매개변수{ }
    
//    (반환하지 않을 때) void사용
    public void setStudNo(int studNo) {
       this.studNo = studNo;
    }
    public int getStudNo() {
       return this.studNo;
    }
    
    public String getStudName() {
      return studName;
   }
   public void setStudName(String studName) {
      this.studName = studName;
   }
   public int getKorScore() {
      return korScore;
   }
   public void setKorScore(int korScore) {
      this.korScore = korScore;
   }
   public int getMathScore() {
      return mathScore;
   }
   public void setMathScore(int mathScore) {
      this.mathScore = mathScore;
   }
   public int getEngScore() {
      return engScore;
   }
   public void setEngScore(int engScore) {
      this.engScore = engScore;
   }
   
   public String getStudentInfo() {
      String str = "===============================";
      str += "\n 학생이름: " + this.getStudName() + "입니다.";
      str += "\n 학번: " + this.getStudNo() + "입니다.";
      str += "\n 평균 점수는: "+ String.format("%.2f", +this.getAvgScore()) + "입니다.";
      str += "\n===============================\n";
      return str;
   }

public static void callStatic() {
	// TODO Auto-generated method stub
	
}
   
}
