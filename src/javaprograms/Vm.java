package javaprograms;

import java.util.Scanner;

public class Vm 
{
 public void userdetail(String name,long mobile,String product, float amount)
{ 
	System.out.println("** Vishaal Mega Mart **");
	System.out.println("Customer name is "+ name);
	System.out.println("Customer mobile num is "+ mobile);
	System.out.println("Customer product is "+ product);
	System.out.println("product amount is "+ amount);
	
	if(amount<1000)
	{
		float gst=(amount*5)/100;
		System.out.println("gst  amount is "+ gst);
		
		System.out.println(" total payble   amount is "+ (gst+amount));
		
	}
	
	else if( amount>1000&amount<2000)
		
	{
		
		float gst=(amount*10)/100;
		System.out.println("gst  amount is "+ gst);
		
		System.out.println(" total payble   amount is "+ (gst+amount));
		
	}
	
	
	else
	{
		float gst=(amount*18)/100;
		System.out.println("gst  amount is "+ gst);
		
		System.out.println(" total payble   amount is "+ gst+amount);
		
	}	
	}

	
	
	public static void main(String[] args)
	{
		Vm obj=new Vm();
		Scanner sc=new Scanner(System.in);
		System.out.println
		("please enter customer name");
		String name=sc.nextLine();
		System.out.println("enter the mobile no");
		long mobile=sc.nextLong();
		System.out.println("please enter product");
		String product=sc.next();
		System.out.println("please enter amount");
		float amount=sc.nextFloat();
	obj.userdetail(name, mobile, product, amount);
		
		
	}
}