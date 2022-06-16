package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FindFrequency {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,1,3,6,2,4);
		
		Map<Integer,Long> frequencyMap = list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		System.out.println(frequencyMap);
		System.out.println(map);
		
	}
}
