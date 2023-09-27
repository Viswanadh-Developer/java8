package com.java8.basic;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<Employee, String> function = (e) -> {
			int marks = e.marks;
			String grade = "";
			if(marks >= 80) {
				grade = "A";
			}else if(marks >= 65) {
				grade = "B";
			}else if(marks >= 50) {
				grade = "C";
			}else {
				grade = "D";
			}
			return grade;
		};
		ArrayList<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee(111, "Viswanadh", 34, 8500));
		aList.add(new Employee(122, "Satish", 94, 8500));
		aList.add(new Employee(123, "Harish", 54, 9500));
		for (Employee employee : aList) {
			System.out.println(employee.eName+" "+function.apply(employee));
		}
	}
}
