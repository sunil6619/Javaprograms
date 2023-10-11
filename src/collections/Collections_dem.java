package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_dem {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(12);
		li.add(45);
		li.add(99);
		li.add(55);
		li.add(443);
		li.add(22);
	
		//System.out.println(Collections.min(li));
	Collections.sort(li);
		
		for (Integer dd:li)
		{
			System.out.println(dd);
		}
	}

}
