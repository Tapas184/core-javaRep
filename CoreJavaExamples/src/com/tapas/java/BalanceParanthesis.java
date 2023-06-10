package com.tapas.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import javax.management.Query;

public class BalanceParanthesis {

	public static void main(String[] args) {
		String s = "{[()]}";
		if (isBalance(s)) {
			System.out.println(s + " Is a balanced Paranthesis");
		} else
			System.out.println(s + " Is not a balanced Parantheis");
	}

	public static boolean isBalance(String s) {
		//Stack<Character> stack = new Stack<>(); //this is a Synchronized 
		Deque<Character> stack = new ArrayDeque<>(); // this is a unsynchronized
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (!((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '['))) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
