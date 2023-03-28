package com.tapas.java;

import java.util.Stack;

public class ReverseStringByStack {

	public static void main(String[] args) {
		String str = "hy";
		String reverseString = reverse(str);
		System.out.println(reverseString);
	}

	public static String reverse(String strng) {
		Stack<Character> stack = new Stack();
		StringBuffer st = null;
		if (strng != "") {
			for (int i = 0; i < strng.length(); i++) {
				stack.push(strng.charAt(i));
			} // for

			st = new StringBuffer();
			while (!stack.isEmpty()) {
				st.append(stack.pop());
			} // while
			return st.toString();
		} // if
		else
			return "String is Empty";
	}// method

}
