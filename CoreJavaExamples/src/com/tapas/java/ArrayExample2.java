package com.tapas.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExample2 {
//Input ["Tapas","Avijit"]
	//output = TAPAS, AVIJIT
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("Tapas","Avijit","Subhankar");
		String string = str.stream().map(s->s.toUpperCase())
		            .collect(Collectors.joining(", "));
		System.out.println(string);
		            
	}

}
