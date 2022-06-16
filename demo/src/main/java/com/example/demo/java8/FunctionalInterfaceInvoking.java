package com.example.demo.java8;

public class FunctionalInterfaceInvoking {

	public static void main(String[] args) {
		FunctionalInterfaceTest ft= (int a,int b) -> a+b;
        System.out.println(ft.add(6,9));
	}

}
