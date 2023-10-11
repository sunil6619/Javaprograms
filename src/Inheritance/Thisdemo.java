package Inheritance;

public class Thisdemo {
	int a=10;
	
	public Thisdemo(int a)
	{
		this.a=a;
	}
	
	public void getdata()
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		Thisdemo ob=new Thisdemo(20);
		ob.getdata()
;		
	}

}
