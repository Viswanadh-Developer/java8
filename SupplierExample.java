package com.java8.basic;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
//		Example 1
		Supplier<Date> supplier = () -> new Date();
		System.out.println(supplier.get());
		
		//Example 2
		Supplier<String> otp = () -> {	
			String otpGen = "";
			for(int i=0;i<= 6;i++) {
				otpGen = otpGen+ (int) (Math.random() * 10);
			}
			return otpGen;
		};
		//calling supplier using get method
		for(int i=0;i<=6 ;i++) {
			System.out.println(otp.get());
		}
	}
}
