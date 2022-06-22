package com.example.demo.java8;

import java.util.stream.Stream;

public class FindMinimumAndMaximum {
	public static void main(String[] args) {
		Integer[] arr = { 1, 3, 5, 6, 7, 3, 2 };
		Stream<Integer> stream = Stream.of(arr);
		Stream<Integer> stream1 = Stream.of(arr);
		Integer min = stream.min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		System.out.println(stream1.max(((i1,i2) -> i1.compareTo(i2))).get());
	}

}
