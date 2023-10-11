package Inheritance;

public class Exceptionthrows {
	
	public void b() throws InterruptedException
	{
		System.out.println("hello b start");
		Thread.sleep(3000);
		System.out.println("B stops");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Exceptionthrows ob=new Exceptionthrows();
		ob.b();
	}

}
