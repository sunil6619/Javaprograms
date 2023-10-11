package javaprograms;

import java.util.Scanner;

public class Looptable 
{

	



	public void getNumber(int num)
	{
		
		for ( int i = 1; i<=10;++i)
				
		{
			System.out.println( num*i);
		}
	
	}
	

	

	
	public static void main(String[] args) 
	{
		
		Looptable ob=new Looptable();
				Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int num1=sc.nextInt();
		ob.getNumber(num1);
		
	}

}
