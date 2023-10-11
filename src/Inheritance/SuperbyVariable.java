package Inheritance;

class suraj
{
	
	int a=40;
}

	public class SuperbyVariable extends suraj
	
	{
		int a=10;
		public void getdata()
		
		{
			System.out.println(super.a);
		}
	
	
	public static void main(String[] args) {
		SuperbyVariable ob=new SuperbyVariable();
		ob.getdata();
	}

}
