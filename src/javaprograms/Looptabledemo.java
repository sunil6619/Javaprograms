package javaprograms;

import java.util.Scanner;

public class Looptabledemo
{
	
	 int k;


	public void loop(int n)
	{
				
		for (int k=1; k<=10; k++)
		{
		System.out.println(n + " * "+ (k) + "="+ (n*k));
		}
		
		}
	
	
	public static void main(String[] args) {
		
		Looptabledemo ob=new Looptabledemo();
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter numnber");
		int n=sc.nextInt();
		ob.loop(n);
		
	}

}  
