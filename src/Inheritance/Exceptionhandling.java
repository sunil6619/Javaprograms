package Inheritance;

import java.util.Scanner;

public class Exceptionhandling {
	
	public void getdata()
	{
		System.out.println("Hello get data");
	}

	public void getdata1()
	{
		try 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the inputs");
		int out=sc.nextInt()/sc.nextInt();
		System.out.println(out);
		}
		catch (ArithmeticException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void getdata3()
	{
		System.out.println("Hellow get data3 ");
	}
	
	public static void main(String[] args) {
		Exceptionhandling ob=new Exceptionhandling();
		ob.getdata();
		ob.getdata1();
		ob.getdata3();
	}
	
}


