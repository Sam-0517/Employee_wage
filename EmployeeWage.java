package com.BridgeLabz.Employee_wage;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		final int WAGE_PER_HR = 20;
		final int WORKING_DAYS = 20;
		int emp_hr = 0;
		int pay = 0;
		int total = 0;
		for(int day = 0; day <= 20; day++){
		int num = (int) (Math.floor((Math.random() * 10)) % 3);
	//	System.out.println(num);
		
		switch(num) {
		case 1:
			
			//System.out.println("Employee is Present full time ");
			emp_hr = 8;
		break;
		
		case 2: 
			 // System.out.println("Employee is present part-time");
			  emp_hr = 4;
		break;
		
		default :
			//System.out.println("Employee is Absent ");
			emp_hr = 0;
			
	
		}
		pay = WAGE_PER_HR * emp_hr;
		// System.out.println("Employee Daily wage is "+pay);	
		total = total + pay ;
		//System.out.println(pay);
	}
		System.out.println("Monthly wage is "+total);
	}

}
