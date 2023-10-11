package array;

import java.util.Scanner;

public class ReverseStringsent {
	
	public void getdata(String input)
	{
		
		String[]s=input.split(" ");
		String out="";
		
		for (int i=0;i<=s.length-1;i++)
		{
			String value=s[i];
			char[]c=value.toCharArray();
			
			for (int j=c.length-1;j>=0;j--)
			{
				out=out+c[j];
			}
			out=out+" ";
			
		}
		System.out.println(out);
	}
	

	
	
	
	public static void main (String[]args) {
		
		ReverseStringsent ob= new ReverseStringsent();
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter input");
		String input=sc.next();
		ob.getdata(input);
	}

}
