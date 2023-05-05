package com.tapas.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * List<String> s=List.of("Jay","Amit","Raj","Ashok","Jayesh");
output should be in Map<String,List<String>>,key should be letter "A" and values should be List.of("Amit","Ashok")

 */
public class Java8Example {

	public static void main(String[] args) {

		List<String> plist = List.of("Tapas","Avi","Akash","Tanvi","Ravi","Rakesh");
		   Map<Character, List<String>> collect = plist.stream()
		                                                .collect(Collectors.groupingBy(s->s.charAt(0)));
	           System.out.println(collect);                     
			                    
	}

}
