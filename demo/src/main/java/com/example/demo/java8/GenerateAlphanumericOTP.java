package com.example.demo.java8;

import java.util.function.Supplier;

public class GenerateAlphanumericOTP {

	public static void main(String[] args) {
		char[] charArraySymbol = { '@', '#', '$' };
		char[] charArrayAlphabet = { 'a', 'b', 'c', 'd', 'e','f' };
		Supplier<String> supplier = () -> {
			String otp = "";
			for (int i = 0; i < 2; i++) {
				otp += charArraySymbol[(int) (Math.random() * 3)] + "";
				otp += charArrayAlphabet[(int) (Math.random() * 6)] + "";
				otp += ((int)( Math.random() * 10));
			}
			return otp; 
		};
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
	}

}
