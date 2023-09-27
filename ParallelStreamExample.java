package com.java8.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "viswanadh", 2020, 5252.32));
		empList.add(new Employee(102, "suresh", 2021, 3253.32));
		empList.add(new Employee(103, "mahesh", 2022, 4254.32));
		empList.add(new Employee(104, "lokesh", 2023, 2255.32));

		Comparator<Employee> employeeSalaryComparator = (emp1, emp2) -> (emp1.salary < emp2.salary) ? 1
				: (emp1.salary > emp2.salary) ? -1 : 0;

		empList.stream().sorted(employeeSalaryComparator).filter(i -> i.getSalary() > 4000)
				.forEach(System.out::println);
		
		//sorting without using customized comparator
		List<Employee> sortedList = empList.stream().filter(i -> i.getSalary() > 4000)
        .sorted(Comparator.comparing(Employee::getSalary))
        .collect(Collectors.toList());
		
		System.out.println("sortedList :: "+sortedList);
	}
}
