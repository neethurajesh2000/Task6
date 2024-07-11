package com.task6;

public class circle {
  private double radius;
  private double PI=3.14;

public circle(double radius) {
	super();
	this.radius = radius;
}

public circle() {
	super();
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

public double getCircumference() {
	return 2*PI*this.radius;
}
  
}
