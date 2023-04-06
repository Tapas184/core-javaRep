package com.tapas.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Exmple2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,5,2,5,1,25,1,2);
		
		//remove the duplicate characters
		/*Set<Integer> set= list.stream().distinct().collect(Collectors.toSet());
		System.out.println(set);*/
		//print the duplicate value
		/*Set<Integer> duplicateEntery=list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
		System.out.println(duplicateEntery);*/
		list.stream().filter(t->Collections.frequency(list, t)>1).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
