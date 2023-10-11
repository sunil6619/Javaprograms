package Inheritance;

class sunn
{
	public sunn(int a)
	{
		System.out.println("Hello sunil "+a);
	}
}

public class SuperbyConstructor extends sunn
{
	public SuperbyConstructor()
	{
		super(80);
		System.out.println("Hellow super");
	}
	public static void main(String[] args) {
		
		SuperbyConstructor ob= new SuperbyConstructor();
		
		
	}
}




	

	
	
	
	

