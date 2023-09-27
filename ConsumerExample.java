package com.java8.basic;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<Integer> consumer = i -> System.out.println(i);
		consumer.accept(10);
		consumer.accept(11);
	}
}
