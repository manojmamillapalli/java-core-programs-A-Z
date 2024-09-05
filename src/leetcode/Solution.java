package leetcode;

import java.util.Scanner;
import java.util.regex.*;
import java.util.Stack;
import java.util.Collections;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
			String pattern = in.nextLine();
			int i11=010;
			System.out.println(i11);
          	//Write your code
              Stack<Character > s=new Stack<>();
            char[] ch=pattern.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]=='('|| ch[i]=='['|| ch[i]=='{')
                {
                    s.push(ch[i]);
                }
            
                else if (ch[i] == ')' || ch[i] == ']' || ch[i] == '}') {
                if (s.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }
                char top = s.peek();
                if ((ch[i] == ')' && top == '(') || 
                    (ch[i] == ']' && top == '[') || 
                    (ch[i] == '}' && top == '{')) {
                    s.pop();
                }
                else {
                    System.out.println("Invalid");
                    return;
                }
                
            }
            }
           
             if (s.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
		}
            
	}


