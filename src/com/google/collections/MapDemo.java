package com.google.collections;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		Map m=new HashMap();// follows equals and hashcode method
		//linked hashmap follows the insertion order
		//treemap will follow the natural sorting order but it sort the key values.
		m.put(1, 1);
		m.put(2, 2);
		m.put(3, 3);
		m.put(4, 4);
		m.put(5, 5);
		Set s=m.keySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Object key=i.next();
			Object value=m.get(key);
			System.out.println(key+" "+value);
		}
	}

}
