package collections;

import java.util.HashSet;
import java.util.Iterator;


public class hashset_demo {
	
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("sunil");
		hs.add("sunil");
		hs.add("sunila22");
		hs.add("sunila2");
		hs.add("suraj");
		
		Iterator<String> itr=hs.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
