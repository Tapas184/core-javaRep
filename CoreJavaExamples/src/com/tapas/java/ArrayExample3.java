package com.tapas.java;
/*
 * Input- [person1,Person2]
 * output- HYD= Tapas, Avi
 *         Odish= Subha, Rabi
 *        
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExample3 {

	public static void main(String[] args) {
		List<Person2> list =Arrays.asList(new Person2("Tapas", "ODI"),
				                          new Person2("Rabi", "HYD"),
				                          new Person2("Ram", "HYD"),
                                          new Person2("Rani", "ODI"),
                                          new Person2("Rakesh", "BLR"));
		list.stream()
		    .collect(Collectors.groupingBy(Person2::getCity))
		    .forEach((s,y)->{
		    	System.out.print(s+"=");
		        System.out.println(y.stream()
		    	                    .map(Person2::getName)
		    	                    .collect(Collectors.joining(", "))
		    		);
		    	  
		    });

	}

}
