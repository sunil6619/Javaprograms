package array;

import java.util.Scanner;

public class Getsumalphanume {
	
	public void getdata(String input)
	{
		char[]c=input.toCharArray();
		int sum=0;
		for (int i=0;i<=c.length-1;i++)
		{
			if(Character.isDigit(c[i]))
			{
			
			int num =Character.getNumericValue(c[i]);
			
			sum=sum+num;
		}
		}
		
			System.out.println(sum);
			
		
	}
	public static void main (String []args) {
		Getsumalphanume ob=new Getsumalphanume();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		String input=sc.next();
		ob.getdata(input);
		
	}

}
