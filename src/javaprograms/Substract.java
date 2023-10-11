package javaprograms;

import java.util.Scanner;

public class Substract {
	
	int a,b,c;
	public void substract()
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("plz print two inputs");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println(c);
		
	}
	
	public void multiply()
	
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please print two inputs");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println(c);
			
	}


public static void main(String[] args)
{
	Substract obj= new Substract();
	 obj.substract();
	 obj.multiply();
 	
      
}
}