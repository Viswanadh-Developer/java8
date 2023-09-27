package com.java8.basic;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Mangoes","Apples","Grapes","PineApple");
		
		boolean anyMatchLength = fruits.stream().anyMatch(i -> i.length() > 7);
		System.out.println("anyMatchLength :: "+anyMatchLength);
		
		boolean allMatchLength = fruits.stream().allMatch(i -> i.length() > 7);
		System.out.println("anyMatchLength :: "+allMatchLength);
	}
}
