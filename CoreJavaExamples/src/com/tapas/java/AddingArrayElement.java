 package com.tapas.java;

import java.util.Arrays;

//adding 2 array element in one array
public class AddingArrayElement {
	public static void main(String[] args) {

		int [] array1 = { 1, 3, 4, 5, 6, 7, 4, 3, 4 };// array 1
		int[] array2 = { 5, 6, 8, 4, 5, 6, 78, 90 }; // array 2
		
		int[] finalArray = new int[array1.length + array2.length]; // set the final array length(array1 and array 2)
		System.arraycopy(array1, 0, finalArray, 0, array1.length); // copy arrray1 element to finalArray
		System.arraycopy(array2, 0, finalArray, array1.length, array2.length); // array2 element to finalArray
		
		Arrays.sort(finalArray);// short the finalArray

		for (int element : finalArray) {
			System.out.print(" "+element); //Iterate all element present in finalArray
		}
	}

}
