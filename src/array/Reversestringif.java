package array;

import java.util.Scanner;

public class Reversestringif {

	
	
	public void getdata(String input,String input1)
	{
		
		String []s=input.split(" ");
					
		for (int i=0;i<=s.length-1;i++)
			
		{
			
			String value=s[i];
						
			if (input.contains(input1))
				
			{
				String out="";
				char[]c=value.toCharArray();
				
			for ( int k=c.length-1;k>=0;k--)
			{
				out=out+c[k];
			}
				out=out+" ";
				System.out.println(out);
		}
				
		else 
			{
				String out1="";
			char[]c1=input1.toCharArray();
			
			for (int j=c1.length-1;j>=0;j--)
			{
				out1=out1+c1[j];
			}
			
			System.out.println(out1);			
			
		}}}
		

		
	
	
	public static void main(String[] args) {
		
		Reversestringif ob= new Reversestringif();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		String input=sc.nextLine();
		System.out.println("Please enter word");
		String input1=sc.next();
		ob.getdata(input,input1);
}
	}
