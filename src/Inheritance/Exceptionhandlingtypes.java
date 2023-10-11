package Inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandlingtypes {
	
	public void getdata1()
	{
		System.out.println("hello get data");
	}
	public void getdata2()
	
	{
	try
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter the inputs");
	    int out=sc.nextInt()/sc.nextInt();
		System.out.println(out);
	}
	
	catch (ArithmeticException e)
	{
		getdata1();
	}
	catch (InputMismatchException e)
	{
		getdata3();
	}
	}
	public void getdata3()
	{
		System.out.println("hello getdata3");
	}

	
	public static void main(String[] args) {
		Exceptionhandlingtypes ob=new Exceptionhandlingtypes();
		ob.getdata2();
	}
}
