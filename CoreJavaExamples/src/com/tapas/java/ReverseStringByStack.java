package com.tapas.java;

import java.util.Stack;

public class ReverseStringByStack {

	public static void main(String[] args) {
		String str = "hellow";
		String reverseString = reverse(str);
		System.out.println(reverseString);
	}
	public static String reverse(String strng) {
		Stack<Character> stack = new Stack();
		if (strng != null) {
			for (int i = 0; i < strng.length(); i++) {
				stack.push(strng.charAt(i));
			}//if
		}//if
		StringBuffer st = new StringBuffer();
		while(!stack.isEmpty()) {
			st.append(stack.pop());
		}//while
		return st.toString();
	}//method

}
