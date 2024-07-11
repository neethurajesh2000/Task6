package com.task6;

import java.util.Scanner;

public class DrivermainAccount {

	public static void main(String[] args) {
		
     Account acc=new Account();
     acc.deposit(2000);
     System.out.println("The  current account  is" +acc.getBalance());
     
     
    Account wdr=new Account();
    wdr.withdraw(200);
   System.out.println("The  withdrawing amount is" +wdr.withdraw(200));
   
   Account chk=new Account();
  
  System.out.println("The  available balance is" +chk.getBalance());
       
	}

}

//Output
//The  current account  is2000.0
//The  withdrawing amount is-200.0
//The  available balance is0.0