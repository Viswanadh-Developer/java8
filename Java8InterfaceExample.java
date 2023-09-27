package com.java8.basic;

interface TestInterface {
	public void run();

	static void walk() {
		System.out.println("walking ...");
	};
}

public class Java8InterfaceExample {
	public static void main(String[] args) {
		// TestInterface has static method.
		// Java 8 introduced static and default methods in interfaces. Earlier we could
		// have only abstract methods in the interface. But from Java 8 onwards, we can
		// define default and static methods in Java. Also, Java 8 allows the use of
		// lambda expressions with the functional interfaces in Java.

		TestInterface testInterface = new TestInterface() {

			@Override
			public void run() {
				System.out.println("Running ...");

			}
		};

		testInterface.run();
		TestInterface.walk();
	}
}