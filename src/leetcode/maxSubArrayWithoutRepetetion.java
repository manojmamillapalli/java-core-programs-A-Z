package leetcode;
import java.util.*;
public class maxSubArrayWithoutRepetetion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		String str=sc.nextLine();
		HashMap<Character, Integer> map=new HashMap<>();
		int l=0;
		int r=0;
		int maxlen=0;
		int n=str.length();
		
		while(r<n)
		{
			if(map.containsKey(str.charAt(r)))
			{
				if(map.get(str.charAt(r))>=l)
				{
					l=1+map.get(str.charAt(r));
				}
			}
			map.put(str.charAt(r), r);
			int len=r-l+1;
			maxlen=Math.max(maxlen, len);
			r++;
			
		}
		System.out.println(maxlen);
	}

}
