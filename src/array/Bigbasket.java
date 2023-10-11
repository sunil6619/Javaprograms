package array;

import java.util.Scanner;

public class Bigbasket 
{
	
	
	public void bigbas()
	{
		String a[]=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter customer name");
				
		for (int i=0;i<1;i++)
		{
			a[i]=sc.next();
												
		}
		System.out.println("Please enter mobile number");
		
		 for (int i=1;i<2;i++)
		 {
			 a[i]=sc.next();
		}
		 System.out.println("Please enter Product category"); 
		 
		 for (int i=2;i<3;i++)
		 {
			 a[i]=sc.next();
		 }	 
		 System.out.println("Please Serial name ");
		 for (int i=3;i<4;i++)
		 {
			 a[i]=sc.next();
		 }
		 
		 System.out.println("Big Basket");
		 System.out.println("--------------");
		 
		 
		 System.out.println("Customer name is " + a[0]);
		 System.out.println("Product name is "+a[1]);
		 System.out.println("Product category is "+a[2]);
		 System.out.println("Serial name is "+a[3]);	
		
		
	}
	
	
	public static void main(String[] args) {
		
		Bigbasket ob=new Bigbasket();
		
		
		ob.bigbas();
		
	}

}
