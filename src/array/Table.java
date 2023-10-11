package array;

import java.util.Scanner;

public class Table {
	
	
	public void tabledemo()
	
	{
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 inputs");
		
		for (int i = 0;i<=4;i++)
		{	
			a[i]=sc.nextInt();
		
		}
		
		for (int k=4;k>=0;k--)
				{
			
					
		 for (int j =1;j<=10;j++)
		 {
			 			System.out.println(a[k]+ "*" +(j)+ "=" + (a[k]*j));
		 
		
	}}}
	
	
			
	public static void main(String[] args) {
		Table ob=new Table();
		
		ob.tabledemo();
		
	}

}
