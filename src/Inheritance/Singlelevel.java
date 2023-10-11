package Inheritance;

class sunil {
	
	public void getdata()
	{
		System.out.println("Hello getdata");
	}
}
	public class Singlelevel extends sunil
	{
		public void getdata1()
		{
			System.out.println("Hello getdata1");
		}
		
	
		public static void main(String[] args) {
			
			Singlelevel ob=new Singlelevel();
			ob.getdata();
			ob.getdata1();
			
	
	
	}
}
