package array;

import java.util.Scanner;

public class Addition {
	int b,c;
	public void addition()
	{
		int a[]=new int[3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 2 inputs");
		for (int i=0;i<=3;i++)
		{
			
			a[i]=sc.nextInt();
			 b=sc.nextInt();
			 c=sc.nextInt();
						
		float d=a[i]+b+c;
		System.out.println("Result is "+d);	
		
		break;
		}
	}
	public static void main(String[] args) {
		Addition ob=new Addition();
			ob.addition();		
	}
}
