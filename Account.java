package com.task6;

public class Account {
private double balance=0;
private double amount;
private double withdrwamount;
private double chekbalance;

public Account(double balance, double amount) {
	super();
	this.balance = balance;
	this.amount = amount;
}
public Account() {
	super();
}

public void deposit(double amount) {
	balance=balance+amount;	
}
public double withdraw(double amount) {
	withdrwamount=balance-amount;
	return withdrwamount;
}
public double getBalance() {
	chekbalance=balance-withdrwamount;
	return balance;
}
}
