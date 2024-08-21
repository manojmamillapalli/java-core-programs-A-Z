package com.google.collections;
import java.util.*;
public class collectionsdemo2 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.remove(1);
		list.add(17);
		list.add(16);
		list.set(0, 1);
		Collections.sort(list);//sort the elements in the collection.
		Iterator<Integer> obj=list.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
//		for(Integer i: list)
//		{
//			System.out.println(i);
//		}

	}

}
