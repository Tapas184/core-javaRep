package com.tapas.java;

import java.util.Arrays;
import java.util.List;

//Input-[1,2,5]
//OutPut-[9,9,12]
public class ArrayExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10,5,9,8,15,78);
		
		int sum=list.stream()
		             .reduce(0,Integer::sum);
		
		System.out.println(sum);
		List<Integer> list2 = list.stream()
		                          .map(s->s+sum)
		                          .toList();
		System.out.println(list2);
		
	}

}
