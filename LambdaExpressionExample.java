package com.java8.basic;

@FunctionalInterface
interface LambdaInterface {
	int addition(int a, int b);
}

@FunctionalInterface
interface LambdaTestInterface {
	int multiplication(int a, int b);

	static void test() {
		System.out.println("testing ...");
	}
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		// FuntionInterface - interface having SAM (Single Abstract Method)
		// Interface can have many number of non-abstract methods with SAM is not
		// considered as functional interface but still that interface can be used with
		// lambda expression

		// @FunctionalInterface annotation does not restrict an interface to have only
		// one abstract method. It's a convention that helps developers and tools
		// identify functional interfaces, but it does not enforce the constraint.

		//LambdaInterface is a functional interface
		LambdaInterface lambdaInterface = (a, b) -> a + b;
		int addition = lambdaInterface.addition(10, 20);
		System.out.println("addition :: " + addition);
		
		//LambdaTestInterface is not a functional interface
		LambdaTestInterface lambdaTestInterface = (a, b) -> a * b;
		int multiplication = lambdaTestInterface.multiplication(10, 20);
		System.out.println("multiplication :: " + multiplication);
	}
}
