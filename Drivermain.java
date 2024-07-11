package com.task6;

import java.util.Scanner;

public class Drivermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name");
		 Scanner sc=new Scanner(System.in);
		 String s1=sc.next();
		 
		 System.out.println("Enter the age");
		 Scanner sc1=new Scanner(System.in);
		 int s2=sc1.nextInt();
		 
    person ps=new person(s1,s2);
    System.out.println("The name and age  is" +ps);
//		 ps.display();
				

	}

}

//Output
//Enter the name
//Maya
//Enter the age
//20
//The name and age  is [name=Maya, age=20]
