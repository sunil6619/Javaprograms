package javaprograms;

import java.util.Scanner;

public class Calculator 

{
	float result;
	public void getdetails(float a,float b,int choice)
	
	{
		
		
		
		if(choice==1)
			
		{ result=a+b;
		System.out.println( result+ "is Addition" );
		}
		
		else if(choice==2)
		{ result=a-b;
		System.out.println(result+ "is Subtraction");
		}
		
		else if(choice==3)
		{ result= a*b;
		System.out.println(result+ "is Multiplication");
		
		}
		else if (choice==4)
		{ result=a/b;
		
		System.out.println(result+ "is Division");
		}
		else
		{
						System.out.println(result+ "is Invalid");
		}
		
			if(choice >=1&& choice<=4)
		{
		}
	}
	
	
	
	
	
public static void main(String[] args) {
	
	Calculator ob=new Calculator();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
			System.out.println("Please enter your choice");
			int choice=sc.nextInt();
			System.out.println("Enter any two numbers");
						System.out.println("Please enter your value  a");
			float a=sc.nextFloat();
			System.out.println("Please enter your value  b");
			float b=sc.nextFloat();
						
		ob.getdetails(a,b,choice);
	

}


}
