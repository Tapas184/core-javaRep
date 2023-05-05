package com.tapas.java.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Interview3  {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(5);
		l.add(8);
		l.add(10);
		int count=l.size();
		System.out.println(l);
		System.out.println(count);
		l.remove(2);
		System.out.println(l);
		
	}
 

}
