package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyAndItsCount {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,3,7,3,9,4,0,2,3,6,8,2,7,5,4,9);
		Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(a->a, Collectors.counting()));
		System.out.println(map);
	}

}
