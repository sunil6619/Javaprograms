package javaprograms;

import java.util.Scanner;

  public class Mega_mart
{
	

	public void getdetails(String name, String productname,
	long mobilenumber,float productamount)
	{
				System.out.println("Vishal Mega Mart");
				System.out.println("Customer name is "+name);
				System.out.println("Customer mobile number "+mobilenumber);
				System.out.println("Product name is "+productname);
				System.out.println("product amount is "+productamount);
				float gst=(productamount*18)/100;
				System.out.println("Gst amount 18% is "+gst);
				
				float total=productamount+gst;
				
				System.out.println("Total payble amount is "+total);
			}

	
	
	public static void main(String[] args) {
		
		Mega_mart ob=new Mega_mart();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the customer name");
		String name=sc.next();
		System.out.println("Please enter the mobile number");
		long mobilenumber=sc.nextLong();
		System.out.println("Please enter the product name");
		String productname=sc.next();
		System.out.println("Please enter the product amount");
		float productamount=sc.nextFloat();
		
		ob.getdetails(name,productname,
				mobilenumber,productamount);	
		}	
	
}