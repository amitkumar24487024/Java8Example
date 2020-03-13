package com.java.DefaultAndStaticMethodExample;

@FunctionalInterface
interface I {
	void show();

	static void show1() {
		System.out.println("static method Implementation");
	}

}

class Imp {
	public void m() {
		I.show1();
	}

}

public class StaticMethodExample {
	public static void main(String[] args) {
		Imp i = new Imp();
		i.m();
		I.show1();
	}
}
