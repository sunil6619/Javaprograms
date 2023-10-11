package javaprograms;

	import java.util.Scanner;

	public class Nameloop
	{
		   public void getDetails(String name)
		   {
			  

		      for(int i = 1; i < 11; i++) 
		      {            
		        
				System.out.println( name+i); 
		      }
		   }
		
		   public static void main(String[]args)
		   {
			   Nameloop ob = new Nameloop();
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Please enter name ");
			   String name=sc.next();
			   ob.getDetails(name);
		   }
	}


