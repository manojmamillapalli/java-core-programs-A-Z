package leetcode;
import java.util.*;
public class uppercase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    int N = scanner.nextInt();
        scanner.nextLine(); 

        
        int[] counts = new int[N];

       
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            int uppercaseCount = 0;
            
           
            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    uppercaseCount++;
                }
            }
            
           
            counts[i] = uppercaseCount;
        }
        
        
        for (int count : counts) {
            System.out.println(count);
        }
        
	


	}
}
