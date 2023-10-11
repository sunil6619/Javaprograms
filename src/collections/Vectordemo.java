package collections;

import java.util.Vector;

public class Vectordemo {
	
	public static void getdata()
	{
		Vector <String> vs=new Vector<String>();
		vs.add("snil");
		vs.add("suraj");
		vs.add("Singh");
		vs.addElement("rajasingh");
		vs.addElement("rajasingh");
		vs.addElement("rajasingh");		
		vs.addElement("rajasingh");
	
	
	for (String dd:vs)
	{
		System.out.println(dd);
	}
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
