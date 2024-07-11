package com.task6;

import java.util.Scanner;

public class DrivermainCircle {

	public static void main(String[] args) {
	 System.out.println("Enter the radius");
	 Scanner sc=new Scanner(System.in);
	 double rad=sc.nextDouble();
//	 System.out.println("Enter the radius");
	 circle  cle=new circle(rad);
	 System.out.println("The circumference of circle is" +cle.getCircumference());
     
	}
}

//Output
//Enter the radius
//4
//The circumference of circle is25.12
