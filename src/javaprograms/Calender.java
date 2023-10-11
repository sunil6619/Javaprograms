package javaprograms;

import java.util.Scanner;

public class Calender {
	Scanner sc=new Scanner(System.in);
	public void getdetails(String month)
	{
		if (month.equalsIgnoreCase ("January")||month.equalsIgnoreCase ("March")||month.equalsIgnoreCase ("May"))
		{
			System.out.println("Number of Days 31");
		}
		
		else if (month.equalsIgnoreCase
				("February"))
				{
			System.out.println("Pleaes enter year");
			int year=sc.nextInt();
			
			if (year%4==0)
			{
				System.out.println("Number of Days is 29 days");
				}
			else 
			{
				System.out.println("Number of Days is 28 days");
			}}
		
		else if (month.equalsIgnoreCase("April")|| month.equalsIgnoreCase ("June"))
			
		{System.out.println("Number of Days is 30");
		
		}
		
		else
			
		{ System.out.println("Wrong input");
		
		}
				
	}
	
	
	
	
	public static void main(String[] args) {
		
		Calender ob=new Calender();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter month");
		String month=sc.next();
		ob.getdetails(month);
	}
	
}
