package Inheritance;

public class Constructor {
	
	
	int b=30;
	public Constructor()
	
	{
		int a =40;
		System.out.println("Hello Defualt contructor " +a);
	}
	
	public void name()
	{
		System.out.println("Hello name"+b);
	}
	
	public static void main (String[]args) {
		
		Constructor ob=new Constructor();
		ob.name();
	}

}
