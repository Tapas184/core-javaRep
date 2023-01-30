package com.tapas.java;

import java.util.Stack;

// Input  s = "(),{},[]"
// output = True
//Input s = "c]"
//output= False
public class ValidateBracket {

    public static void main(String[] args) {
	
	String s = "(}";
	boolean status = validateBrackets(s);
	System.out.println(s);
	System.out.println(status);
	

    }//main

    private static boolean validateBrackets(String s) {
	Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            Character c=s.charAt(i);
            if(c==')') {
     	   if(stack.peek()=='(') {
     	       stack.pop();
     	   }//if
     	   else
     	       return false;
            }else if(c==']') {
        	 if(stack.peek()==']') {
           	       stack.pop();
           	   }//if
           	   else
           	       return false;
            }else if(c=='}') {
        	 if(stack.peek()=='}') {
         	       stack.pop();
         	   }//if
         	   else
         	       return false;
            }else
     	   stack.push(c);
            if(stack.size()==0) {
        	return true;
            }
       }//for
	return false;
    }

}//class
