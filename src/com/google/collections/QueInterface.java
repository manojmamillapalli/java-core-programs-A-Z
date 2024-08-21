package com.google.collections;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.*;
public class QueInterface {

	public static void main(String[] args) {
		        ArrayDeque<String> queue = new ArrayDeque<>();
		        queue.add("array");
		        queue.add("sql");
		        while (!queue.isEmpty()) {
		            System.out.println(queue.poll() + " "); // Added space for readability
		        }
		    }
		}


//class object method overloading constructor