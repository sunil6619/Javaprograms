package javaprograms;

import java.util.Scanner;


public class VishalMega {
	
	public void Mega (String name,long mobilenumber, String Productname,float productamount,
			int serialnumber)
	
	{
	System.out.println("Vishal Megaaa sale");
	System.out.println("_________________");
		System.out.println("Customer name is "+name);
		System.out.println("Mobile number is "+ mobilenumber);
		System.out.println("Product name is " +Productname);
		System.out.println("Product amount is " +productamount);
		System.out.println("Serial no " +serialnumber);
		
		
		if (productamount<500)
				
				{
							
			float gst=(productamount*5)/100;
				System.out.println("GST amount is "+gst);
				
				float total=productamount+gst;
				System.out.println("Total amount is "+total);
				}
		
		else if (productamount >=501 && productamount<=1000)
				{
			float gst=(productamount*18)/100;
			
		System.out.println("GST amount is " +gst);
		
		float total=productamount+gst;
		System.out.println("Total amount is " +total);
				}
		
		else if (productamount>1001 && productamount<=1500)
		
		{
			float gst=(productamount*20)/100;
			System.out.println("GST amount is "+gst);
			float total=productamount+gst;
			System.out.println("Total amount is " +total);
		}
		
		else
				{ 
			float gst=(productamount*25)/100;
			System.out.println("GST amount is "+gst);
			float total=productamount+gst;
			System.out.println("Total amount is " +total);
				}
		
		
			}


	public static void main(String[] args) {
		
		VishalMega ob=new VishalMega();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Customer name");
		String name=sc.next();
		System.out.println("Please enter Mobile number");
		long mobilenumber=sc.nextInt();
		System.out.println("Please enter Product name");
		String productname=sc.next();
		System.out.println("Please enter Product amount");
		int productamount=sc.nextInt();
		System.out.println("Please enter Serial no. ");
		int serialnumber=sc.nextInt();
		ob.Mega(name,mobilenumber,productname,productamount,serialnumber);
		
	}

}
