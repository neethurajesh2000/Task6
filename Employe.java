package com.task6;

public class Employe {
	private int id;
	private String firstname;
	private String lastname;
	private double salary;
	
	public Employe(int id, String firstname, String lastname, double salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary + "]";
	}

public double getAnnualSalery()
{
	
//	double annualsalery;
//    annualsalery=salary*12;
//     return annualsalery;
     return salary*12;
	
//	System.out.println("AnnualSalery :"+annualsalery);
}

}
