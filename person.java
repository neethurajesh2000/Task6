package com.task6;

public class person {

	 String name;
	 int age;
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public person() {		
		System.out.println("hi");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

@Override
public String toString() {
	return " [name=" + name + ", age=" + age + "]";
}
	  
}
