package Inheritance;

public class Final {
	
	int a=90;
	
	public void getdata()
	
	{
		a=100;
		System.out.println(a);
	}
			
	
	
	
	
	public static void main(String[] args) {
		Final ob=new Final();
		ob.getdata();
	}

}
