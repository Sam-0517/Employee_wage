package com.BridgeLabz.Employee_wage;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		final int WAGE_PER_HR = 20;
		final int FULL_DAY = 8;
		int pay = 0;
		double num = Math.floor((Math.random() * 10)) % 2;
		if (num == 1) {
			System.out.println("Employee is Present ");
			pay = WAGE_PER_HR * FULL_DAY;
			System.out.println("Employee paid per day is "+pay);
		}
		else{
			System.out.println("Employee is Absent ");
		}
	}

}
