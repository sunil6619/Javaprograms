package javaprograms;

import java.util.Scanner;

public class Name {
	
String name,city;long pincode;
	
		public void name()
		{
		
		Scanner sc = new Scanner (System.in);
			System.out.println("please enter customer name");
			name=sc.next();
			System.out.println("please enter city name");	
			city=sc.next();
			System.out.println("please enter pincode");
			pincode=sc.nextLong();
		
				System.out.println("Customer name is "+name);
				System.out.println("City name is "+city);
				System.out.println("Pincode is "+pincode);
	}
	
	public static void main(String[] args) {
		Name obj =new Name();
		obj.name();
				
	}
}
