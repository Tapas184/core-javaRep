package com.tapas.java.interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Sort Array without using Arrays.sort();
public class Interview5 {

	public static void main(String[] args) {

		int[] array = {5,8,5,8,7,9,6};
		//need to take Treeset for sorting 
		TreeSet<Integer> sort = new TreeSet<>();
		Set<Integer> duplicate = new HashSet<>();
		//Iterator the array 
		for(int i=0; i<array.length; i++) {
			sort.add(array[i]);
		}
		System.out.println(sort);
		//for reverse order we need to take custom comparator
		List<Integer> list = new ArrayList<>();
		for(Integer i1:array) {
			list.add(i1);

		}
		System.out.println("Before Sorting");
		System.out.println(list);
		System.out.println("After sorting");
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		System.out.println("Duplicates are");
		for(Integer i2 :array) {
			if(duplicate.contains(i2)) {
				System.out.print(i2+" ");
			}
			duplicate.add(i2);
		}
	}

}
