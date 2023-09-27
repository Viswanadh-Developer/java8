package com.java8.basic;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i %2 == 0;
		boolean test1 = predicate.test(10);
		boolean test2 = predicate.test(11);
		System.out.println(test1+"  "+test2);
	}
}
