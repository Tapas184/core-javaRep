package com.tapas.java;

import java.util.Set;
import java.util.TreeSet;

public class SortingAnArray {

	public static void main(String[] args) {

		int[] array = {1,5,2,8,3,9,8,9};
		Set<Integer> set = new TreeSet<>();
		/*for(int i =0; i<array.length; i++) {
			set.add(array[i]);
		}*/
		System.out.println("Duplicates Elements");
		for(Integer i:array) {
			if(set.contains(i)) {
				System.out.print(i+", ");
			}
			set.add(i);
		}
		System.out.println("Sorted Elements");
		System.out.println(set);
	}

}
