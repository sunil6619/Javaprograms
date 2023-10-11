package Inheritance;


import java.util.Scanner;  
class Congress { 	
	
	public float gstCalculator(float input) 	
	
{ 		float gst= (input*5)/100; 		

return gst; 

} } 

public class Overriding extends Congress {
	
	public float gstCalculator(float input) 
	{ 		float gst= (input*18)/100; 
	return gst; 	} 
	
	
	public static void main(String[] args) {
		Overriding ob = new Overriding(); 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter the input"); 
		float input = sc.nextFloat(); 
		float data = ob.gstCalculator(input); 
		System.out.println(data); 
	}
	

}
