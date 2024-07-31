package com.google.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
        int m=5;
        int Bitand=n&m;
        System.out.println(Bitand);
        int Bitor=n|m;
        System.out.println(Bitor);
        int Bitxor=n^m;
        System.out.println(Bitxor);
        int complement=~5;
        System.out.println(complement);
        System.out.println(4>>2);//right shift
        System.out.println(4<<2);//left shift
        System.out.println(4>>>2);//unsigned right shift
	}

}
