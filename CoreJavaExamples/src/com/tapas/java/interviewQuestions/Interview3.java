package com.tapas.java.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Interview3 extends Interview4 {

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
		
		Interview3 intr = new Interview3();
		intr.example("tapas");
	}
	public static void main(int i) {
		System.out.println("Over Loaded Main method");
	}
 

}
