package array;

import java.util.Scanner;

public class Reversesame {
	
	public void getdata(String input)
	
	{
		String[]s=input.split(" ");
		String out="";
		
		for (int i=0;i<=s.length-1;i++)
		{
			String value=s[i];
			
			char[]c=value.toCharArray();
			 for(int j= c.length-1;j>=0;j--)
				 
			 {
				 out=out+c[j];
			 }
		out=out+" ";	 
		}
		System.out.println(out);
		}
	
	public static void main (String[]args) {
		
		Reversesame ob=new Reversesame();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the input");
		String input=sc.nextLine();
		ob.getdata(input);
	}
}
