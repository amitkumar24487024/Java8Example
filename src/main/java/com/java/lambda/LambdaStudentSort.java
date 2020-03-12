package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaStudentSort {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(3, "Amit", "Bangalore"), new Student(13, "Radhika", "Mumbai"),
				new Student(7, "Atiksh", "Chennai"), new Student(12, "Avyaan", "Kolkata"),
				new Student(2, "Pooja", "Punjab"));

		System.out.println("Without Sorting");
		list.forEach(n -> System.out.println(n));

		System.out.println("With natural Sorting");
		Collections.sort(list);
		list.forEach(n -> System.out.println(n));

		System.out.println("Sorting with name without lambda");

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		list.forEach(n -> System.out.println(n));
		
		
		System.out.println("Sorting with location with lambda");

		Comparator<Student>c=(x,y)->x.getLocation().compareTo(y.getLocation());
		
		Collections.sort(list,c);
		list.forEach(n -> System.out.println(n));


	}

}
