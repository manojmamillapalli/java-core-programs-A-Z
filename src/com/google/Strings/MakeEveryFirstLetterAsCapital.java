package com.google.Strings;
import java.util.*;
public class MakeEveryFirstLetterAsCapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	    String s=sc.nextLine();
	    s=s.toLowerCase();
	    char[] c=s.toCharArray();
	    if(c[0]>='a' && c[0]<='z')
	    {
	    	c[0]=(char)(c[0]-32);
	    }
	    for(int i=1;i<c.length;i++)
	    {
	    	if(c[i]==' ' && (c[i+1]>='a' && c[i+1]<='z'))
	    	{
	    		c[i+1]=(char) (c[i+1]-32);
	    	}
	    	
	    }
	   for(int i=0;i<c.length;i++)
	   {
		   System.out.print(c[i]);
	   }

	}

}
