package javaprograms;

import java.util.Scanner;

public class Calculatorsw 
{

		public void switchCalculator (int input, float a,
		float b)
	
	{
		
		switch(input)
		
		{
			case 1:
				
			
				
			float c=a+b;
				
			
				System.out.println("Result is "+c );
				break;
			
			
		
		
			case 2:
				
					 c=a-b;
					System.out.println("Result is "+c);
					break;
					
				
				
			case 3:
			
				c =a*b;
				System.out.println("Mulitplication is "+c);
				break;
			
			
			case 4:
				
				 c=a/b;
				System.out.println("Division is "+c);
				break;
				
		}
		
		
		
	}
	

	
	
	
	public static void main(String[] args) {
		
		Calculatorsw ob=new Calculatorsw();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your input");
		int input=sc.nextInt();
		System.out.println("Please enter input a");
		int a=sc.nextInt();
		System.out.println("Please enter input b");
		int b=sc.nextInt();
		float c;
		
		
				ob.switchCalculator(input,a,b);
		
		
	}
	
	
	
	
}
