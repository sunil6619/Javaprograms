package Inheritance;


abstract class Transportpolicy
{

public int wheeel()
{
	return 4;
}
public String drivingside()
{
	return "rightside";
}

abstract public String color();
abstract public int price();

}

abstract class Hyundai extends Transportpolicy
{
	public int price()
	{
	return 700000;
}}

class Santro extends Hyundai
{
	public String color()
	{
		return "White color";
	}
}

public class Abstract {
	
public static void main(String[] args) {
	Santro ob=new Santro();
	System.out.println(ob.wheeel());
	System.out.println(ob.price());
	System.out.println(ob.color());
	System.out.println(ob.drivingside());
}
}
