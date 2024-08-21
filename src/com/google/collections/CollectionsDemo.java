package com.google.collections;
import java.util.*;
import java.util.ArrayList;
public class CollectionsDemo {


	public static void main(String[] args) {
		List l=new ArrayList();// datatype is not mentioned. It ca accept any type of data.
		l.add(10);
		l.add("abcd");
		l.add(2.4);
		l.add(true);
		for(Object i:l)
		{
			System.out.println(i);// iteration using the for each method
		}
		
		Iterator obj=l.iterator();//iterating using the iterator object.
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}

	}

}
