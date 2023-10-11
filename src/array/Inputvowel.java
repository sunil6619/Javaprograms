package array;

import java.util.Scanner;

public class Inputvowel {

	public void getdetails()
	{
		char a[]=new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 inputs");
		
		for  (char i=0;i<=5;i++)
		{
			a[i]=sc.next().charAt(0);
					
			if (a[i]=='a'||a[i]=='e'|| a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				System.out.println(a[i]+ " is vowel");
			}
								
		else 
		{
			System.out.println(a[i]+ " is consonant");
		}
		}	
		
			}
	
	
	
	public static void main(String[] args) {
		Inputvowel ob=new Inputvowel();
		ob.getdetails();
		
	}

}
