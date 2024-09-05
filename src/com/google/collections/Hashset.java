package com.google.collections;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		
 Set s=new HashSet();
// Set s1=new LinkedHashSet();
// Set s2=new TreeSet();
 //these linkedhashset, treeset and hashset are the implemented classes of the set interface
 //sorts according to the insertion and hashcode() method;
 // tree set will sort according to the natural sorting order
 //linkedhashset will sort according to the insertion order.
 s.add("manoj");
 s.add(1);
  s.add(2);
 s.add(2.67889);
 Iterator i=s.iterator();
 while(i.hasNext())
 {
 System.out.println(i.next());
 }
 for(Object o:s)
 {
	 System.out.println(o);
 }
	}

}
