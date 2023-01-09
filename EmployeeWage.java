package com.BridgeLabz.Employee_wage;

import java.util.Scanner;

public class EmployeeWage {

	int emp_hr = 0;
	int dailyWage = 0;
	static int totalEmpWage = 0;

	int total_emp_hr = 0;
	int total_working_days = 0;
	int empCheck = 0;
	int numOfPresentFullDay = 0;
	int numOfPresentHalfDay = 0;
	int numOfAbsentDays = 0;

	public void emplpoyeeWage(int WAGE_PER_HR, int WORKING_DAYS,
			int max_emp_hr, String companyName) {
		
		System.out.println("Employee wages for the company "+companyName+" is :- ");

		while (total_emp_hr <= max_emp_hr && total_working_days < WORKING_DAYS) {

			empCheck = (int) (Math.floor((Math.random() * 10)) % 3);
			switch (empCheck) {
			case 1:
				emp_hr = 8;
			//	System.out.println("present");
				numOfPresentFullDay++;
				break;

			case 2:
				emp_hr = 4;
			//	System.out.println("half day");
				numOfPresentHalfDay++;
				break;

			case 0:
				emp_hr = 0;
			//	System.out.println("absent");
				numOfAbsentDays++;
				break;

			}
			WORKING_DAYS--;

			total_emp_hr = total_emp_hr + emp_hr;
//			System.out.println("Total days " + total_working_days
//					+ " Total working hrs " + total_emp_hr);
//			total_working_days++;
		}
		System.out.println("Number of working days full day :- "+numOfPresentFullDay);
		System.out.println("Number of working days half day :- "+numOfPresentHalfDay);
		System.out.println("Number of Absent Days :- "+ numOfAbsentDays);
		totalEmpWage = total_emp_hr * WAGE_PER_HR;

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int WAGE_PER_HR;
		int WORKING_DAYS;
		int max_emp_hr;
		String companyName;

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your company details ");
//		System.out.println("Company name :- ");
//		companyName = scan.next();
//
//		System.out.println("WAGE_PER_HR :- ");
//		WAGE_PER_HR = scan.nextInt();
//
//		System.out.println("WORKING_DAYS :- ");
//		WORKING_DAYS = scan.nextInt();
//
//		System.out.println("max_emp_hr in Month Should be :- ");
//		max_emp_hr = scan.nextInt();
//
//		EmployeeWage obj = new EmployeeWage();
//		obj.emplpoyeeWage(WAGE_PER_HR, WORKING_DAYS, max_emp_hr, companyName);

		EmployeeWage obj = new EmployeeWage();
		obj.emplpoyeeWage(10 , 4 , 20,"TCS");
		System.out.println("Monthly wage of Employee is " + totalEmpWage);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		obj.emplpoyeeWage(20, 2, 10,"Wipro");
		System.out.println("Monthly wage of Employee is " + totalEmpWage);
	}

}
