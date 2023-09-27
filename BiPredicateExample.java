package com.java8.basic;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (a, b) -> a+b == 10;
		System.out.println(biPredicate.test(8, 2));
		System.out.println(biPredicate.test(5, 9));
	}
}
