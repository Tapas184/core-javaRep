package com.tapas.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class OccrenceOfCharecter {
	private static final Logger logger = Logger.getLogger(OccrenceOfCharecter.class.getName());

	public static void main(String[] args) {
		String s="YYXXZZYZUSGSVDVBDHHSHSH";
		
		 Map<String, Long> occerence = occerence(s);
		 logger.info("Output:"+occerence);
	}

	public static Map<String, Long> occerence(String s) {
		/* Map<Character, Long> mapm =new HashMap<>();
		for(int i=s.length()-1; i>=0; i--) {
			if(mapm.containsKey(s.charAt(i))) {
				Long count=mapm.get(s.charAt(i));
				mapm.put(s.charAt(i), ++count);
			}
			else {
				mapm.put(s.charAt(i), 1L);
			}
		}
		return mapm;*/
		//using java 8 function ----------------------------------------
		
		List<String> list = Arrays.asList(s.split(""));
		return list.stream()
				    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
}
