package Inheritance;

import java.util.Scanner;

import com.sun.tools.javac.launcher.Main;

public class Exceptionhandlingfinal {
	
	
	public void getdata() {
		System.out.println("Hellow get data");
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
	
	
	catch (Exception ex)
	{
		ex.printStackTrace();
		
	}
	
	finally
	{
		System.out.println("hello fianlly");
	}
}
	public void getdata2()
	{
		System.out.println("Hellow get data2");
			
		}
		public static void main(String[] args) {
			Exceptionhandlingfinal ob=new Exceptionhandlingfinal();
			ob.getdata1();
			ob.getdata2();
		}
}
