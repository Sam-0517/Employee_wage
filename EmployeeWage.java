package com.BridgeLabz.Employee_wage;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		double num = Math.floor((Math.random()*10))%2;
		//System.out.println(num);
		
		if(num == 1){
			System.out.println("Employee is Present ");
		}
		else 
			System.out.println("Employee is Absent ");
	}

}
