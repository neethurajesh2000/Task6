package com.task6;

public class Drivermainemployee {

	public static void main(String[] args) {		
  Employe emp=new Employe( 20,"Maya","vis",00);
  emp.setSalary(30000);
  System.out.println(emp);
  
  System.out.println("The annual salery is" +emp.getAnnualSalery());
  
  
  
//   System.out.println (emp.getAnnualSalery());
//   emp.getAnnualSalery();
  
	}

}
//Output
//Employe [id=20, firstname=Maya, lastname=vis, salary=30000.0]
//The annual salery is360000.0