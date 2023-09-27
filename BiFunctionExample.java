package com.java8.basic;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
	public static void main(String[] args) {
		
		// Employee, first Double are inputs; last Double is output
		// Scenario :
		// first Double input, constantly to add to all existing objects
		// like every salary will be added with 500.23, then output is filtered based on
		// condition provided
		
		BiFunction<Employee, Double, Double> biFunction = (e, sal) -> sal = e.salary + sal;
		Predicate<Employee> predicate = i -> i.getSalary() > 2000;
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "viswanadh", 2020, 252.32));
		empList.add(new Employee(102, "suresh", 2021, 1253.32));
		empList.add(new Employee(103, "mahesh", 2022, 2254.32));
		empList.add(new Employee(104, "lokesh", 2023, 3255.32));

		for (Employee employee : empList) {
			if (predicate.test(employee)) {
				System.out.println("name : " + employee.geteName());
				System.out.println("salary : " + biFunction.apply(employee, 500.23));
			}
		}
	}
}
