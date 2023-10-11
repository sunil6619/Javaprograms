package array;

import java.util.Scanner;

public class Minimum {
	
	public void getmininum(int a[])
	
	{
		int min=a[0];
		
		for (int j=0;j<=4;j++)
			
		{
			if (a[j]<min)
			{
				min=a[j];
			}
		
		}	
		System.out.println("minimum value is" +min);
	}
	
	
	public static void main(String[] args) {
		
		Minimum ob=new Minimum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		int a[]=new int[5];
		for (int k=0;k<=4;k++)
		{
			a[k]=sc.nextInt();
		}
		ob.getmininum(a);
	}

}
