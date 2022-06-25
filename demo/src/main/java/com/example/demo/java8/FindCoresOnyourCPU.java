package com.example.demo.java8;

public class FindCoresOnyourCPU {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println((Runtime.getRuntime().freeMemory()/1024/1024));
		System.out.println((Runtime.getRuntime().totalMemory()/1024/1024));
	}

}
