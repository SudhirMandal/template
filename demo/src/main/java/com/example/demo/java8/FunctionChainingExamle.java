package com.example.demo.java8;

import java.util.function.Function;

public class FunctionChainingExamle {

	public static void main(String[] args) {
		String name = "AishwariyaAbhi";
		String nickName = "Aish";
		Function<String, String> f1 = (String s1) -> s1.substring(0, 4);
		Function<String, String> f2 = (String s1) -> s1.toUpperCase();
		System.out.println(f1.apply(name));
		System.out.println(f2.apply(name));
		System.out.println(f1.apply(nickName));
		System.out.println(f2.apply(nickName));
		System.out.println(f1.andThen(f2).apply(name));
		System.out.println(f1.compose(f2).apply(nickName));

		Function<Integer, Integer> f3 = i -> i + i;
		Function<Integer, Integer> f4 = i -> i * i * i;
		System.out.println(f3.andThen(f4).apply(2));
		System.out.println(f3.compose(f4).apply(2));

	}

}
