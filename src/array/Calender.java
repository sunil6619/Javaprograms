package array;

import java.util.Scanner;

public class Calender {
	Scanner sc=new Scanner (System.in);
	public void getdata()
	
	{
		String a[]=new String [12];
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter month");
		for (int i=1;i<=11;i++)
		{
			a[i]=sc.next();
			if (a[i].equalsIgnoreCase ("January")||a[i].equalsIgnoreCase("March")|| a[i].equalsIgnoreCase ("May"))
			{
				System.out.println(a[i]+ "have 31 days");
			}
			
			else if (a[i].equalsIgnoreCase("February"))
			{
				System.out.println("Please enter year");
				int year=sc.nextInt();
						{
				if (year%4==0)
				{
					System.out.println(" Number of days is 29 days");
				}
				
				else 
				{
					System.out.println("Number of days is 28 days");
				}
			}
						}
			else if (a[i].equalsIgnoreCase("April")||a[i].equalsIgnoreCase("June"))
			{
				System.out.println("Number of Days is 30 days");
			}
			
			else 
			{
				System.out.println("Wrong input");
			}
			}
						
		
		
		
	}
	
	
	public static void main(String[] args) {
		Calender ob=new Calender();
		ob.getdata();
		
	}

}
