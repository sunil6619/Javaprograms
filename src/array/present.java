package array;

import java.util.Scanner;

public class present {
	
	public void presentor()
	
	{
		int a[]=new int[5];
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter 5 inputs");
		
				for (int i=0;i<=4;i++)
		{
			
			a[i]=sc.nextInt();
		}
			
						
				System.out.println("Please enter 1 input");
				for (int k=4;k>=0;k--)
			{	
				a[k]=sc.nextInt();
			
			
			
			if (a[k]==k)
							{
				System.out.println(a[k]+" is present");
			} 
			
			else 
			{
				System.out.println(a[k]+"is not present");
			}
			
			}}	
				
	public static void main(String[] args) {
		present ob=new present();
		ob.presentor();
		
	}

}
