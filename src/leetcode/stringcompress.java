package leetcode;

import java.util.Arrays;

public class stringcompress {

    public static void main(String[] args) {
        char[] chars = {'s', 'a', 'q', 'a', 'a'};
        Arrays.sort(chars);

        StringBuilder result = new StringBuilder();
        int length = chars.length;
        int i = 0;

        while (i < length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of the current character
            while (i < length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // Append the character and count to the result
            result.append(currentChar);
            if (count > 1) {
                result.append(count);
            }
        }

      String sb=result.toString();
      char[] ch=sb.toCharArray();
      for(int i1=0;i1<ch.length;i1++)
      {
    	  chars[i1]=ch[i1];
      }
      System.arraycopy(chars, ch.length+ 1, chars, ch.length, chars.length-ch.length - 1);

      // Optionally, set the last element to a default value (e.g., '\0' for char)
      chars[chars.length - 1] = '\0';

      // Print the updated array
     // System.out.println(new String(chars).trim()); 
      for(int i1=0;i1<chars.length;i1++)
      {
    	  System.out.print(chars[i1]);
      }
    }
}
