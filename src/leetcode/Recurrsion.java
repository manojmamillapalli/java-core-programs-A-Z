package leetcode;

public class Recurrsion {

	public static void main(String[] args) {
		
		multiCallFunction( 3);
	}
	public static void multiCallFunction(int n) {
	    if (n <= 0) 
	    	return;

	    System.out.print(n);
	    multiCallFunction(n - 2);
	    System.out.println("end");
	    System.out.print( n);
	    multiCallFunction(n - 1);
	    System.out.println("end2");
	}

	
	}


