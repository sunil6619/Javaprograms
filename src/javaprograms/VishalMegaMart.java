package javaprograms;

import java.util.Scanner;

public class VishalMegaMart 
{
	String name, productname;
	long mobilenumber; float productamount,gst,total;
	Scanner sc = new Scanner(System.in);
	public void getdetails()
	{
		System.out.println("Please enter the customer name");
		name=sc.next();
		System.out.println("Please enter the mobile number");
		mobilenumber=sc.nextLong();
		System.out.println("Please enter the product name");
		productname=sc.next();
		System.out.println("Please enter the product amount");
		productamount=sc.nextFloat();
		gst=(productamount*18)/100;
		total=(gst+productamount);
		
		System.out.println("Vishal Mega Mart");
		System.out.println("Customer name is "+name);
		System.out.println("Customer mobile number "+mobilenumber);
		System.out.println("Product name is "+productname);
		System.out.println("product amount is "+productamount);
		System.out.println("Gst amount 18% is "+gst);
				System.out.println("Total payble amount is "+total);
		
	}
	
	public static void main(String[] args)
	{
		VishalMegaMart ob = new VishalMegaMart();
		ob.getdetails();
	}
}
