
//Input is = I have a sentence with technical words
// out put is = 1=[i,a]
/*               2=[have,with]
            	3=[words]
            	4=[sentence]
            	5=[technical]	*/	
package com.tapas.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class SeparateCharacterByLength {

	public static void main(String[] args) {
		//declare the variable
		String s = "I have a sentence with technical words"; 
		//splite the String to String[]={"I","have"} like
		String[] string = s.split(" "); 
		// convert String[] to list collection
		List<String> words = Arrays.asList(string);
		//collect out put from stream function
		Map<Integer,List<String>> lengthMap	=words.stream().collect(Collectors.groupingBy(String::length));
		//Display output
		System.out.println(lengthMap);
	}

}
