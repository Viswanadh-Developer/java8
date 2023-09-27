package com.java8.basic;

import java.util.ArrayList;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		ArrayList<Employee> empList1 = new ArrayList<>();
		empList1.add(new Employee(101, "viswanadh", 2020, 5252.32));
		empList1.add(new Employee(102, "suresh", 2021, 3253.32));
		
		
		ArrayList<Employee> empList2 = new ArrayList<>();
		empList2.add(new Employee(103, "mahesh", 2022, 4254.32));
		empList2.add(new Employee(104, "lokesh", 2023, 2255.32));
		
		ArrayList<Employee> empList3 = new ArrayList<>();
		empList3.add(new Employee(101, "rakesh", 2020, 7252.32));
		empList3.add(new Employee(102, "ramesh", 2021, 6253.32));
		
		List<List<Employee>> employeeList = new ArrayList<>();
		employeeList.add(empList1);
		employeeList.add(empList2);
		employeeList.add(empList3);
		
		List<Employee> list = employeeList.stream().flatMap(i -> i.stream().filter(j -> j.getSalary() > 6000)).toList();
		System.out.println("list :: "+list);
	}
}
