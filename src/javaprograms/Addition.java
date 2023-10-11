package javaprograms;

import java.util.Scanner;

public class Addition {
	
	int a,b,c;
	public void addition()
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the two input");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
		
	}
	
			public void subtraction()
		 {
			
			Scanner	sc=new Scanner(System.in);
			System.out.println("Please enter the two input");
			a=sc.nextInt();
			b=sc.nextInt();
		 c=a-b;
		System.out.println(c);
		
	}
	
 public static void main(String[] args)
{
	 Addition obj= new Addition();
	 obj.addition();
	 obj.subtraction();
	
       
}

}
