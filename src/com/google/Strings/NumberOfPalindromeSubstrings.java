package com.google.Strings;
import java.util.*;
public class NumberOfPalindromeSubstrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value:");
		String s=sc.nextLine();
		//System.out.println(s.substring(0,3));
		char[] c=s.toCharArray();
		String result="abc";
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				FindSubStringPalindrome( s,  i,  j);
				if (FindSubStringPalindrome(s, i, j)) {
//					for(int k=i;k<=j;k++)
//                    System.out.print(c[k]+"");
//					System.out.println();
					int length=j-i+1;
					//System.out.println(length);
	                int maxlength=Math.max(length,0);
	                if(length>maxlength)
	                {
	                	for(int k=i;k<=j;k++)
	                	{
	                		result=result+c[k]+'a';
	                	}
						
	                }
                }
			}
			
		}
		System.out.println(result);
		
		}
	
  public static boolean FindSubStringPalindrome(String str, int start, int end)
  {
	  char[] c=str.toCharArray();
	  while(start<end)
	  {
		  if(c[start]!=c[end])
		  {
			  return false;
			
		  }
		  start++;
		  end--;
	  }
	return true;
	  
  }
}
