package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplyFilter {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9, 3, 4, 1);
		long sumOf4 = list.stream().filter(a-> a==4).collect(Collectors.summarizingInt(a->a)).getSum();
		System.out.println(sumOf4);
		System.out.println(list.stream().filter(a-> a>6).count());
		System.out.println(list.stream().filter(a-> a>6).collect(Collectors.averagingDouble(a->a)).doubleValue());
	}

}
