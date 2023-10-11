package array;

import java.util.Scanner;

public class Getnumeric {
	
	public void getdata(String input)
	{
		
	char[]c=input.toCharArray();
	
			
			for(int i=0;i<=c.length-1;i++)
			{
				
				if(Character.isDigit (c[i]))
				{
					System.out.println(c[i]);
				}
	}}
		
	
	
	public static void main (String[]args) {
		Getnumeric ob=new Getnumeric();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		String input=sc.next();
		ob.getdata(input);
		
	}

}
