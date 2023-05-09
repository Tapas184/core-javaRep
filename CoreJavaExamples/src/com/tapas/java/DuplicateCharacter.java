package com.tapas.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String s1 = "abcdeadcfers";
		//without Java 8 Feature============================
		/*HashSet<Character> h = new HashSet<>();
		for(Character c : s1.toCharArray()) {
			if(h.contains(c)) {
				System.out.print(c+" ");
			}//if
			h.add(c);
		}*/
		// using Java 8 Features===================================
		List<String> list = Arrays.asList(s1.split(""));
		Set<String> collect = list.stream()
				                  .filter(s -> Collections.frequency(list, s) > 1)
				                   .collect(Collectors.toSet());
		System.out.println("Print the duplicate character");
		System.out.println(collect);
		// Distinct character
		Set<String> collect2 = list.stream()
				                   .distinct()
				                   .collect(Collectors.toSet());
		System.out.println("Distinct Character Present in string");
		System.out.println(collect2);
		// Print the string which are only one time
		List<String> list2 = list.stream()
				                 .filter(s -> Collections.frequency(list, s) == 1)
				                 .toList();
		System.out.println("Which are only one time");
		System.out.println(list2);
	}

}
