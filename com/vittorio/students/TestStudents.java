package com.vittorio.students;

public class TestStudents {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id = 1;
		s1.name = "John";
		
		s2.id =2;
		s2.name = "Javier";
		
		
		Student[] arrayOfStudents = {s1,s2};
		
		for(int i = 0;i<arrayOfStudents.length;i++) {
			
			arrayOfStudents[i].sayName();
		}
		
		
		
		
		

		
	}

}
