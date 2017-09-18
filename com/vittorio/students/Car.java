package com.vittorio.students;

public class Car {
  int speed;
  String color;
  
  
  public void printColor() {
	  System.out.println(color);
  }
  
  public void printSpeed() {
	  System.out.println(speed);
  }
  
  public void printLimitedSpeed() {
	  System.out.println(speed - 50);
  }
  
  
}
