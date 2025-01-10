package com.pack1;

public class ClassA 
{
	void meth1()
	{
		int x=10;
		int y=20;
		
		int z=x+y;
		
		System.out.println(z);
	}
	public static void main(String[] args) 
	{
		new ClassA().meth1();
	}
}
