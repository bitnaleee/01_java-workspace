package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new Employee();
		employees[0].setEmpNo(0);
		employees[0].setEmpName(null);
		employees[0].setDept(null);
		employees[0].setJob(null);
		employees[0].setAge(0);
		employees[0].setGender(' ');
		employees[0].setSalary(0);
		employees[0].setBonusPoint(0.0);
		employees[0].setPhone(null);
		employees[0].setAddress(null);
		
		employees[1] = new Employee(1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울잠실");
		
		employees[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울마곡");
		
		System.out.print("========================================================================================");
		
		employees[0].setEmpName("김말똥");
		employees[0].setDept("영업부");
		employees[0].setJob("팀장");
		employees[0].setAge(30);
		employees[0].setGender('M');
		employees[0].setSalary(3000000);
		employees[0].setBonusPoint(0.2);
		employees[0].setPhone("01055559999");
		employees[0].setAddress("전라도광주");
		
		employees[1].setDept("기획부");
		employees[1].setJob("부장");
		employees[1].setSalary(4000000);
		employees[1].setBonusPoint(0.3);
		
		System.out.print("========================================================================================");
		
		System.out.print(employees[0].getEmpName() + "의 연봉 : " + (employees[0].getSalary() 
				+ (employees[0].getSalary() * employees[0].getBonusPoint())) * 12
				+"원");
		System.out.print(employees[1].getEmpName() + "의 연봉 : " + (employees[1].getSalary() 
				+ (employees[1].getSalary() * employees[1].getBonusPoint())) * 12
				+"원");
		System.out.print(employees[2].getEmpName() + "의 연봉 : " + (employees[2].getSalary() 
				+ (employees[2].getSalary() * employees[2].getBonusPoint())) * 12
				+"원");
		
		System.out.print("========================================================================================");
		
		System.out.print("직원들의 연봉의 평균 : ");

	}

}
