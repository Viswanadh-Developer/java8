package com.java8.basic;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		//BiConsumer is an interface takes two arguments as input and returns nothing
		BiConsumer<Employee, Double> biConsumer = (e, sal) -> System.out.println(e.eNo+"\t"+e.eName+"\t"+(e.salary+sal));
		biConsumer.accept(new Employee(101,"viswanadh",2020,252.32), 252.23);
	}

}
