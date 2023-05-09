package com.tapas.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Exmple2 {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Java8Exmple2.class.getName());

		List<Integer> list = Arrays.asList(1,2,5,2,5,1,25,1,2);
		List<Integer> list2 = Arrays.asList(5,9,5,6,7,2,1,6,9);
		List<Integer> mergeList = Stream.concat(list.stream(), list2.stream())
				                        .toList();
		//Merge 2 list in one list
		System.out.println(mergeList);
	 //need to print unique list
		List<Integer> uniqueList=mergeList.stream()
		         .distinct()
		         .toList();
		System.out.println(uniqueList);
		//way 2 print unique list
		Set<Integer> collect = mergeList.stream()
		         .collect(Collectors.toSet());
		System.out.println(collect);
		//print duplicate value
		  Set<Integer> collect2 = mergeList.stream()
		          .filter(s->Collections.frequency(mergeList, s)>1)
		          .collect(Collectors.toSet());
		 System.out.println(collect2);
		//remove the duplicate characters
		/*Set<Integer> set= list.stream().distinct().collect(Collectors.toSet());
		System.out.println(set);*/
		//print the duplicate value
		/*Set<Integer> duplicateEntery=list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
		System.out.println(duplicateEntery);*/
		//list.stream().filter(t->Collections.frequency(list, t)>1).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
