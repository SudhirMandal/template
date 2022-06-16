package com.example.demo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingLamdaExpression {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,5,2,7,4,9); 
	System.out.println("Fefore Sorting");
	System.out.println(list);
	System.out.println("After Sorting natural Order");
	Collections.sort(list);
	System.out.println(list);
	System.out.println("after sorting in decending order");
	Comparator<Integer> comparator = (i1,i2) -> i1>i2 ? -1 : i1<i2 ? 1:0;
	Collections.sort(list,comparator);
	System.out.println(list);
	
	}

}
