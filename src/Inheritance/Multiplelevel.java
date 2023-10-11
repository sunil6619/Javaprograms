package Inheritance;


	
	class sunil 
	{
		
		public void getdata() 
		{	
			System.out.println("Hello getdata");	
		}
	}
		class sunil1 extends sunil
	{
		
		public void getdata1()
		{
			System.out.println("Hello getdata1");
		}}
		
		class sunil2 extends sunil
		
		{
			public void getdata2()
			
			{
				System.out.println("Hellow getdata2");
			}
		}
		public class Multiplelevel extends sunil
		{
			public void getdata3()
			{
				System.out.println("Hello getdata3");
			}
		
		public static void main(String[] args) {
		
			Multiplelevel ob=new Multiplelevel();
			sunil2 ob1=new sunil2();
			ob1.getdata2();
			ob.getdata();
			
		
	}}


