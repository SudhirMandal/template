package com.example.demo.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAscendingUsingComparable {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Bikash", "Higher", 25));
		studentList.add(new Student("Bhagwati", "primary", 16));
		studentList.add(new Student("Randhir", "Middle", 20));
		studentList.add(new Student("Bibhesh", "Higher", 21));
		Collections.sort(studentList);
		System.out.println(studentList);

	}

}

class Student implements Comparable<Student> {
	private String name;
	private String grade;
	private int rollNumber;

	public Student() {

	}

	public Student(String name, String grade, int rollNumber) {
		super();
		this.name = name;
		this.grade = grade;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public int compareTo(Student o) {
		if (rollNumber == o.rollNumber)
			return 0;
		if (rollNumber > o.rollNumber)
			return -1;

		return 1;
	}

	@Override
	public String toString() {
		return String.format(name + "," + grade + "," + rollNumber);

	}

}