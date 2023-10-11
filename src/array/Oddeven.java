package array;

import java.util.Scanner;

public class Oddeven {
	
	public void getdetails()
	
	{
		int a[]=new int[10];
				Scanner sc=new Scanner(System.in);
				System.out.println("Please enter inputs");
				for (int i=0;i<=10;i++)
				{
					a[i]=sc.nextInt();
						
		
		if (a[i]>0 && (a[i]%2)==0)
		{
			
			System.out.println(a[i]+" Value is Positive and even number");
			
		}
		
		else if (a[i]<0)
		{
			System.out.println(a[i]+" Value is negative");
		}
			
		else
		{
			System.out.println(a[i]+" Value is odd");
		}
		}			
	}
		
	
	public static void main(String[] args) {
		Oddeven ob=new Oddeven();
		ob.getdetails();
	}

}
