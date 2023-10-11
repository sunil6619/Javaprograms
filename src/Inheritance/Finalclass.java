package Inheritance;

final class sunny
{
	public void getdata1()
	{
		
		System.out.println("hello get ");
	}
}



public class Finalclass extends sunny{
	
	public void getdata()
	{
		
		System.out.println("Hello get data");
	}
	
	public static void main(String[] args) {
		Finalclass ob= new Finalclass();
		ob.getdata();
	
	}

}
