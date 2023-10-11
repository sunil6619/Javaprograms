package Inheritance;


class shamwati
{
   public final void getdata1()
{
	System.out.println("Hello get dat");
}
}



public class Finalmethod extends shamwati {
	
	public void getdata()
	{
		System.out.println("Hello get data");
	}
	
	
	
	public static void main(String[] args) {
		Finalmethod ob= new Finalmethod();
		ob.getdata();
		ob.getdata1();
	}

}
