package com.java.lambda;

interface Addition{
	int add(int x,int y);
}

class AdditionTest implements Addition{

	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
}



public class LambdaTest {

	public static void main(String[] args) {
		System.out.println("Lambda Test new");
		
		AdditionTest add=new AdditionTest();
		int x=add.add(10,20);
		System.out.println("Sum is "+x);
		
		
		// Lambda Way
		
		Addition add1=(a,b)->a+b;
		System.out.println("Lambda Addition : "+add1.add(50,75));
		
	//	System.out.println("Lambda Addition : "+(a,b)->a+b);
	}

}
