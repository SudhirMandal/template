package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingAverage {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9, 3, 4, 1);
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		List<Integer> descendingList = list.stream().sorted((a1, a2) -> a1 > a2 ? -1 : a1 < a2 ? 1 : 0).toList();
		System.out.println(descendingList);
		System.out.println(list.stream().mapToInt(a -> a).average().getAsDouble());
	}

}
