package com.java.DefaultAndStaticMethodExample;

interface DefaultExample {
	void show();

	default void show1() {
		System.out.println("default method");

	}
}

class DefaultExampleClass implements DefaultExample {

	@Override
	public void show() {
		System.out.println("abstract method");

	}

}

public class DefaultMethodExample {

	public static void main(String[] args) {
		DefaultExampleClass cls = new DefaultExampleClass();
		cls.show();
		cls.show1();

	}

}
