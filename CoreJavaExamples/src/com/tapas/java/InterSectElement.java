
//Intersect element from 2 Arrays// Find out the duplicate values from 2 Arrays
package com.tapas.java;

import java.util.Arrays;

public class InterSectElement {

	public static void main(String[] args) {
		
		int [] firstArray= {1,2,3,2,1};
		int [] secondArray = {2,2,3};
		//using Stram Function
		//convert Arrays to stream function
		Arrays.stream(firstArray)
		       .filter(x->Arrays.stream(secondArray)
		         .anyMatch(y->y==x))
		           .distinct()
		             .forEach(System.out::println);

	}//main

}//class
