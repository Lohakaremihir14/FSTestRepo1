package com.pack1;

public class ClassA 
{
	void meth1()
	{
		int x=10;
		int y=20;
		
		int z=x+y;
		int i=x-y;
		int j=x/y;
		int k=x*y;
		
		System.out.println("Addition : "+z);
		System.out.println("Substraction : "+i);
		System.out.println("Division : "+j);
		System.out.println("Multiplication : "+k);
		
	}

	public static void main(String[] args) 
	{
		new ClassA().meth1();
	}
}
