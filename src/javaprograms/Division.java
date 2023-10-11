package javaprograms;

import java.util.Scanner;

public class Division {
	int a,b,c;
	
		public void divide()
		{
	 Scanner s=new Scanner(System.in);
	 System.out.println("Please enter two input");
			a=s.nextInt();
			b=s.nextInt();
	c=a/b;
	System.out.println("Result is "+c);
}
	
	
	
	public static void main(String[] args) {
		Division obj=new Division();
				obj.divide();
	}

}
