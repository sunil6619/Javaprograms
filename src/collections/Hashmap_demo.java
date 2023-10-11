package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_demo {
	
	public static void main(String[] args) {
	HashMap<Integer,String> hm	=new HashMap<Integer, String>();
	
	hm.put(12,"sunil");
	hm.put(10,"suraj");
	hm.put(33,"navv");
	hm.put(3,"naveen");
	hm.put(100,"suraj");
	hm.put(132,"sunil");
	Set<Entry<Integer,String>> set =hm.entrySet();
	for (Entry<Integer,String> dd:set)
	{
		System.out.println(dd.getKey()+ " "+dd.getValue());
	}
	}

}
