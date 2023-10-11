package array;

import java.util.Scanner;

public class Inputfor {
	
	public void getdata()
	
	{
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter 6 inputs");
		
		for (int i=0;i<=5;i++)
			{
			a[i]= sc.nextInt();
			}
	
	 for (int k=5;k>=0;k--)
	 {
		 System.out.println(a[k]);
	 }
		 
	}
	
	
	public static void main(String[] args) {
		Inputfor ob=new Inputfor();
		ob.getdata();
		
	}

}
