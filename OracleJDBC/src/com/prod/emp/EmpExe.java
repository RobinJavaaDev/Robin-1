package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();

		// 메뉴: 1. 사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료
		while (true) {
			System.out.println("1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료");
			System.out.println("메뉴선택>>>");

			int menu = scn.nextInt();
			if (menu == 1) {// 리스트
				List<Employee> list = dao.empList(); // 전체조회기능
				System.out.println("==사원리스트==");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) { // 입력
				// 사원번호, lastName, email, hireDate, jobId
				Employee emp = new Employee();

				System.out.println("사원번호입력");
				emp.setEmployeeId(scn.nextInt());
				System.out.println("이름입력");
				emp.setLastName(scn.next());
				System.out.println("이메일입력");
				emp.setEmail(scn.next());
				System.out.println("입사일입력");
				emp.setHireDate(scn.next());
				System.out.println("직종ID입력");
				emp.setJobId(scn.next());
				dao.insertEmp(emp);
				boolean tOrF = dao.insertEmp(emp); // boolean타입으로 결과 값을 받아와서..
				if (tOrF) {
					System.out.println("정상처리");
				} else
					System.out.println("오류");
			} else if (menu == 3) { // 수정
				Employee emp = new Employee();

				System.out.println("수정할 성 입력");
				emp.setFirstName(scn.next());
				System.out.println("수정할 연락처입력");
				emp.setPhoneNumber(scn.next());
				System.out.println("수정할 봉급입력");
				emp.setSalary(scn.nextInt());
				System.out.println("수정할 사원번호입력");
				emp.setEmployeeId(scn.nextInt());

				boolean result = dao.updateEmp(emp);
				if (result) {
					System.out.println("정상처리");
				} else {
					System.out.println("오류");
				}
			} else if (menu == 4) { // 삭제
				Employee emp = new Employee();
				System.out.println("수정할 사원번호입력");
				int s = scn.nextInt();

				boolean result = dao.deleteEmp(s);
				;
				if (result) {
					System.out.println("정상처리");
				} else {
					System.out.println("오류");
				}
			} else if (menu == 5) { // 한건조회

				System.out.println("사원번호입력");
				int eid = scn.nextInt();

				Employee emp = dao.searchEmp(eid);
				if (emp == null)
					System.out.println("조회결과없음");
				else
					System.out.println(emp.toString());
			} else if (menu == 9) { // 종료
				System.out.println("프로그램 종료.");
				break;
			}

		} // end of while
		System.out.println("end of program");
		scn.close();

	}// end of main
} // end of class
