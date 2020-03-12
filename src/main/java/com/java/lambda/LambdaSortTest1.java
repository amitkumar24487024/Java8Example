package com.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaSortTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(7);
		list.add(17);
		list.add(3);

		System.out.println("Without Sorting");
		list.forEach(n -> System.out.println(n));

		Collections.sort(list);

		System.out.println("Natural Sorting");
		list.forEach(n -> System.out.println(n));

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				} else if (o1 < o2) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		System.out.println("Using annonomus implementstion");
		list.forEach(n -> System.out.println(n));

		System.out.println("Using Lambda ");
		Comparator<Integer> c = (x, y) -> (x > y) ? -1 : (x < y) ? 1 : 0;
		Collections.sort(list, c);
		list.forEach(n -> System.out.println(n));

	}
}
