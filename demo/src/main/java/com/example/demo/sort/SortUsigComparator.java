package com.example.demo.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsigComparator {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Bikash", "Higher", 25));
		studentList.add(new Student("Bhagwati", "primary", 16));
		studentList.add(new Student("Randhir", "Middle", 20));
		studentList.add(new Student("Bibhesh", "Higher", 21));
		Collections.sort(studentList, new StudentComparator());
		System.out.println(studentList);

	}
	
	

}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRollNumber() == o2.getRollNumber())
				return 0;
		if(o1.getRollNumber()>o2.getRollNumber())
			return 1;
		return -1;
	}
	
}
