package com.google.Strings;

public class Introduction {

	public static void main(String[] args) {
		//equalsignore case is a method used to compare the characters of string irrespective of upper or lower case
		String s = "java";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
//		String s1="Java";
//		Introduction s2=new Introduction();
//        // Print the identity hash code of the string object
//        System.out.println("Identity Hash Code: " + System.identityHashCode(s));
//        System.out.println("Identity Hash Code: " + System.identityHashCode(s1));
//        System.out.println("Identity Hash Code: " + System.identityHashCode(s2));
//        System.out.println(s2);
//        System.out.println(s2.getClass().getName());
        }

}
