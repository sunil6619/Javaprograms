package Inheritance;





public class Staticvariable {
	static int count=20;
	public Staticvariable ()
	{
		count++;
		System.out.println(count);
		
	}
	
	
	
	public static void main(String[] args) {
		Staticvariable ob=new Staticvariable();
		Staticvariable ob1=new Staticvariable();	
	}

}
