package com.tapas.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OccerenceOfString {

	public static void main(String[] args) {
		String str = "Java is a Object oriented programing languages java is a";
		Map<String, Long> map = occerence(str);
		System.out.println(map);
	}

	public static Map<String, Long> occerence(String str) {
		/*String[] strArray = str.split(" ");
		HashMap<String, Integer> map =new HashMap<>();
		for(int i=strArray.length-1; i>=0; i--) {
			if(map.containsKey(strArray[i])) {
				int count=map.get(strArray[i]);
				map.put(strArray[i], ++count);
			}
			else {
				map.put(strArray[i], 1);
			}
		}
		return map;*/
		//using Java 8 feature
		List<String> list = Arrays.asList(str.split(" "));
	return list.stream()
		    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}

}
