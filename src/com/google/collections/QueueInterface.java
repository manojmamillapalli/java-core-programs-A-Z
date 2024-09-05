package com.google.collections;
import java.util.*;
public class QueueInterface {

	public static void main(String[] args) {
		
	        ArrayDeque<String> queue = new ArrayDeque<>();
	        queue.add("array");
	        queue.add("sql");
	        while (!queue.isEmpty()) {
	            System.out.println(queue.poll() + " "); // Added space for readability
	        }
	}

}
//method overriding/inheritence and types of inheritence
