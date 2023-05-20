package com.tapas.java;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Spliterator;

public class HashMapExam {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "Tapas");
		map.put(6, "Subha");
		map.put(1, "Hari");
		System.out.println(map);
		map.put(6, "Ravi");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.containsValue("Tapas"));
		Set<Entry<Integer, String>> t = map.entrySet();
		for(Map.Entry<Integer, String> y :t) {
			System.out.println(y.getKey()+"-"+y.getValue());
		}
	}
	

}
