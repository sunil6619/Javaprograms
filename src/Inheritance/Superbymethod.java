package Inheritance;

class suraj1
{
	public void getdata()
	
	{
		System.out.println("Hellow Sunil");
	}
}

public class Superbymethod extends suraj1 {
	
	public void getdata()
	{
		super.getdata();
		System.out.println("Hello super by method");
	}
	
	
public static void main(String[] args) {
	
	Superbymethod ob=new Superbymethod();
	
	
}
}
