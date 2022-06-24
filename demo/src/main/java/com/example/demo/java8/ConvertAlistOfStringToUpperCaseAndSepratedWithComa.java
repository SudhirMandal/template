package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertAlistOfStringToUpperCaseAndSepratedWithComa {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
		System.out.println(String.join(",", list.stream().map(a -> a.toUpperCase()).collect(Collectors.toList())));
		List<String> newList = list.stream().map(str -> str.toUpperCase()).toList();
		System.out.println(String.join(",", newList));

	}

}
