package com.tapas.java;

import java.util.HashMap;
import java.util.HashSet;

public class Test3 {

	public static void main(String[] args) {
	HashMap<Employee, String> empMap = new HashMap<>();
	empMap.put(new Employee(1005, "Tapas", 45.5, 10), "TTY");
	empMap.put(new Employee(1056, "Avi", 45.5, 10), "TTU");
	String string = empMap.get(new Employee(1005, "Tapas", 45.5, 10));
	System.out.println(string);
	}

}
