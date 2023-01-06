package com.tapas.java;

import java.util.HashSet;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdeadcfers";
		HashSet<Character> h = new HashSet<Character>();
		for(Character c : s1.toCharArray()) {
			if(h.contains(c)) {
				System.out.print(c+" ");
			}//if
			else 
			h.add(c);
		}

	}

}
