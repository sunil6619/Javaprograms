package Inheritance;

interface RBI
{
	public float roi();
	public float exciseduty();
}


class SBI implements RBI
{
	public float roi() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public float exciseduty() {
		// TODO Auto-generated method stub
		return 9;
	}
}

public class Interface{

	
	public static void main(String[] args) {
		
	

	
	}
}
