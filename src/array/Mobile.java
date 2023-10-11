package array;

import java.util.Scanner;

public class Mobile {
	int sam,moto,nok;
	
	Scanner sc=new Scanner(System.in);
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 inputs");
		String s[]= new String[5];
		for (int i=0;i<=4;i++)
		{
			s[i]=sc.next();
		}
			
		for (int j=0;j<=4;j++)
			
		{
			
			if(s[j].equalsIgnoreCase("Samsung"))
				
			{
						sam++;
											
			}
			else if (s[j].equalsIgnoreCase("Motorola"))
				
			{
				moto++;
			}
			
               else if (s[j].equalsIgnoreCase("Nokia"))
				
			{
				nok++;
			}	}
		
						     
			 System.out.println("Samsung = "+sam+ "\n" + "Motorola= " +moto+ "\n"+ "Nokia= " + nok);
		}	
	
	public static void main(String[] args) {
		Mobile ob=new Mobile();
		ob.getdata();
		
		
	}
	

}
