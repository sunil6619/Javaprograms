package Inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionthrow {
	public void getdata(char input)
	{
		
		try
		{
			if(input=='a'|input=='e'|input=='i'|input=='o'|input=='u')
		{
			System.out.println(input+ " is vowel");
		}
		
		else if (Character.isLetter(input))
		{
			System.out.println(input+ " is consonant");
		}
		else
		{
			throw new InputMismatchException("wrong input");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
		main(null);
	}
}

public void getdata1()
{
	System.out.println("hello get data1");
}

	public static void main(String[] args) {
		Exceptionthrow ob=new Exceptionthrow();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		char input=sc.next().charAt(0);
		ob.getdata(input);
	}

}
